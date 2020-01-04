package com.gangan.tools;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.util.*;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;

import org.apache.http.*;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

/**
 * HTTPClient连接池工具类
 *
 * @author wuyunhu
 */
public class HttpClientUtil
{

    // 响应成功编码
    private static final int successCode = 200;

    // 默认编码
    private static final String defaultCharset;

    // 连接建立超时时间
    private static final int connectTimeout;

    // 响应超时时间
    private static final int socketTimeout;

    // 从连接池获取连接的超时时间
    private static final int connectionRequestTimeout;

    // 重试次数
    private static final int retryTime;

    // 服务器丢弃请求是否重试
    private static final boolean isRetryNoHttpResponse;

    // 服务器超时是否重试
    private static final boolean isRetryInterrupted;

    // 目标服务器不可达是否重试
    private static final boolean isRetryUnknowHost;

    // 连接被拒绝是否重试
    private static final boolean isRetryConnectionTimeout;

    // 最大连接数
    private static final int maxTotal;

    // 每个路由基础的最大连接数
    private static final int maxPerRoute;

    // 目标主机的最大连接数
    private static final int maxRoute;

    // 使用Map维护多个HttpClient，key为域名:端口，例：127.0.0.1:8080
    private static Map<String, CloseableHttpClient> httpClientMap = new HashMap<>();

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

    // 初始化信息
    static
    {
        connectTimeout = 10000;
        socketTimeout = 10000;
        connectionRequestTimeout = 10000;
        retryTime = 3;
        maxTotal = 200;
        maxPerRoute = 40;
        maxRoute = 200;
        isRetryNoHttpResponse = true;
        isRetryInterrupted = true;
        isRetryUnknowHost = true;
        isRetryConnectionTimeout = true;
        defaultCharset = "UTF-8";
    }

    /**
     * 根据主机名和端口号获取HttpClient对象
     */
    private static CloseableHttpClient getHttpClient(String domainPort)
    {
        CloseableHttpClient oHttpClient = httpClientMap.get(domainPort);
        if (null == oHttpClient)
        {
            synchronized (httpClientMap)
            {
                oHttpClient = httpClientMap.get(domainPort);
                if (null == oHttpClient)
                {
                    oHttpClient = addHttpClient(domainPort);
                }
            }
        }
        return oHttpClient;
    }

    /**
     * 创建HttpClient并放入map中
     */
    private static CloseableHttpClient addHttpClient(String domainPort)
    {
        String[] oDomainPortArray = domainPort.split(":");
        String sHostName = oDomainPortArray[0];
        int nPort = Integer.valueOf(oDomainPortArray[1]);
        ConnectionSocketFactory oConnectionSocketFactory = PlainConnectionSocketFactory.getSocketFactory();
        LayeredConnectionSocketFactory oLayeredConnectionSocketFactory = SSLConnectionSocketFactory.getSocketFactory();
        Registry<ConnectionSocketFactory> oRegistry = RegistryBuilder.<ConnectionSocketFactory> create().register(
                "http", oConnectionSocketFactory).register("https", oLayeredConnectionSocketFactory).build();
        PoolingHttpClientConnectionManager oHttpClientManager = new PoolingHttpClientConnectionManager(oRegistry);
        // 设置最大连接数
        oHttpClientManager.setMaxTotal(maxTotal);
        // 设置每个路由基础的最大连接数
        oHttpClientManager.setDefaultMaxPerRoute(maxPerRoute);
        HttpHost oHttpHost = new HttpHost(sHostName, nPort);
        // 设置目标主机的最大连接数
        oHttpClientManager.setMaxPerRoute(new HttpRoute(oHttpHost), maxRoute);
        // 请求重试处理
        HttpRequestRetryHandler oHttpRequestRetryHandler = new HttpRequestRetryHandler()
        {
            @Override
            public boolean retryRequest(IOException exception, int executionCount, HttpContext context)
            {
                if (executionCount >= retryTime)
                {// 重试超过指定次数，就放弃
                    return false;
                }
                if (exception instanceof NoHttpResponseException)
                {// 服务器丢掉了连接
                    return isRetryNoHttpResponse;
                }
                if (exception instanceof SSLHandshakeException)
                {// 不要重试SSL握手异常
                    return false;
                }
                if (exception instanceof InterruptedIOException)
                {// 超时
                    return isRetryInterrupted;
                }
                if (exception instanceof UnknownHostException)
                {// 目标服务器不可达
                    return isRetryUnknowHost;
                }
                if (exception instanceof ConnectTimeoutException)
                {// 连接被拒绝
                    return isRetryConnectionTimeout;
                }
                if (exception instanceof SSLException)
                {// SSL握手异常
                    return false;
                }
                HttpClientContext oHttpClientContext = HttpClientContext.adapt(context);
                HttpRequest oRequest = oHttpClientContext.getRequest();
                // 如果请求是幂等的，就再次尝试
                if (oRequest instanceof HttpEntityEnclosingRequest)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
        };

        CloseableHttpClient oHttpClient = HttpClients.custom().setConnectionManager(oHttpClientManager).setRetryHandler(
                oHttpRequestRetryHandler).build();
        // 放入Map中
        httpClientMap.put(domainPort, oHttpClient);
        return oHttpClient;
    }

    /**
     * GET请求（幂等，可重试）
     */
    @SuppressWarnings("unused")
    public static String httpGET(String url)
    {
        String sResult = null;
        CloseableHttpResponse oResponse = null;
        RequestConfig oRequestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(
                connectTimeout).setConnectionRequestTimeout(connectionRequestTimeout).build();
        HttpGet oHttpGet = new HttpGet(url);
        oHttpGet.setConfig(oRequestConfig);
        CloseableHttpClient oHttpClient = getHttpClient(getDomainPort(url));
        try
        {
            long start = System.currentTimeMillis() / 1000;
            oResponse = oHttpClient.execute(oHttpGet);
            long end = System.currentTimeMillis() / 1000;
//            log.info("获取耗时={}秒", end - start);
            if (null != oResponse && oResponse.getStatusLine().getStatusCode() == successCode)
            {
                sResult = EntityUtils.toString(oResponse.getEntity(), defaultCharset);
            }
        }
        catch (IOException e)
        {
        }
        finally
        {
            if (null != oResponse)
            {
                try
                {
                    oResponse.close();
                }
                catch (IOException e)
                {

                }
            }
        }
        return sResult;
    }

    /**
     * POST请求（非幂等，不可重试）
     */
    public static String httpPOST(String url, Map<String, String> paramsMap)
    {
        String sResult = null;
        CloseableHttpResponse oResponse = null;
        RequestConfig oRequestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(
                connectTimeout).setConnectionRequestTimeout(connectionRequestTimeout).build();
        HttpPost oHttpPost = new HttpPost(url);
        oHttpPost.setConfig(oRequestConfig);
        CloseableHttpClient oHttpClient = getHttpClient(getDomainPort(url));
        try
        {
            if (null != paramsMap && paramsMap.size() > 0)
            {
                List<NameValuePair> oParamsList = new ArrayList<>();
                for (Map.Entry<String, String> oEntry : paramsMap.entrySet())
                {
                    oParamsList.add(new BasicNameValuePair(oEntry.getKey(), oEntry.getValue()));
                }
                UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(oParamsList, defaultCharset);
                oHttpPost.setEntity(formEntity);
            }
            oResponse = oHttpClient.execute(oHttpPost);
            if (null != oResponse && oResponse.getStatusLine().getStatusCode() == successCode)
            {
                sResult = EntityUtils.toString(oResponse.getEntity(), defaultCharset);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != oResponse)
            {
                try
                {
                    oResponse.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return sResult;
    }

    /**
     * [简要描述]:获取httpClient<br/>
     * [详细描述]:<br/>
     *
     * @author lixiaolong
     * @return
     */
    private static CloseableHttpClient getInstance()
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        return httpclient;
    }

    /**
     * [简要描述]:post请求<br/>
     * [详细描述]:<br/>
     *
     * @author lixiaolong
     * @param url
     * @param content
     * @return
     * @throws Exception
     */
    public static String post(String url, JSONObject obj) throws Exception
    {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        String result = null;
        try
        {
            httpClient = getInstance();

            // 设置请求超时时间
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(
                    connectTimeout).setConnectionRequestTimeout(connectionRequestTimeout).build();
            // 指定POST请求
            HttpPost httppost = new HttpPost(url);
            httppost.setConfig(requestConfig);

            // 包装请求体
            // List<NameValuePair> params = new ArrayList<NameValuePair>();
            // params.addAll(content);
            // HttpEntity request = new UrlEncodedFormEntity(params, "UTF-8");

            StringEntity request = new StringEntity(obj.toString(), "utf-8");// 解决中文乱码问题
            request.setContentEncoding("UTF-8");
            request.setContentType("application/json");

            // 发送请求
            httppost.setEntity(request);
            httpResponse = httpClient.execute(httppost);

            // 读取响应
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null)
            {
                result = EntityUtils.toString(entity, "UTF-8");
            }
        }
        catch (Exception e)
        {

        }
        finally
        {
            // 关闭httpClient
            httpResponse.close();
        }
        return result;
    }

    /**
     * DELETE请求（幂等，可重试）
     */
    public static String httpDELETE(String url)
    {
        String sResult = null;
        CloseableHttpResponse oResponse = null;
        RequestConfig oRequestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(
                connectTimeout).setConnectionRequestTimeout(connectionRequestTimeout).build();
        HttpDelete oHttpDelete = new HttpDelete(url);
        oHttpDelete.setConfig(oRequestConfig);
        CloseableHttpClient oHttpClient = getHttpClient(url);
        try
        {
            oResponse = oHttpClient.execute(oHttpDelete);
            if (null != oResponse && oResponse.getStatusLine().getStatusCode() == successCode)
            {
                sResult = EntityUtils.toString(oResponse.getEntity(), defaultCharset);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != oResponse)
            {
                try
                {
                    oResponse.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return sResult;
    }

    /**
     * PUT请求（幂等，可重试）
     */
    public static String httpPut(String url, Map<String, String> paramsMap)
    {
        String sResult = null;
        CloseableHttpResponse oResponse = null;
        RequestConfig oRequestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(
                connectTimeout).setConnectionRequestTimeout(connectionRequestTimeout).build();
        HttpPut oHttpPut = new HttpPut(url);
        oHttpPut.setConfig(oRequestConfig);
        CloseableHttpClient oHttpClient = getHttpClient(getDomainPort(url));
        try
        {
            if (null != paramsMap && paramsMap.size() > 0)
            {
                List<NameValuePair> oParamsList = new ArrayList<NameValuePair>();

                for (Map.Entry<String, String> oEntry : paramsMap.entrySet())
                {
                    oParamsList.add(new BasicNameValuePair(oEntry.getKey(), oEntry.getValue()));
                }
                UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(oParamsList, defaultCharset);
                oHttpPut.setEntity(formEntity);
            }
            oResponse = oHttpClient.execute(oHttpPut);
            if (null != oResponse && oResponse.getStatusLine().getStatusCode() == successCode)
            {
                sResult = EntityUtils.toString(oResponse.getEntity(), defaultCharset);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != oResponse)
            {
                try
                {
                    oResponse.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return sResult;
    }

    private static String getDomainPort(String url)
    {
        String sDomainPort = url.split("/")[2];
        if (!sDomainPort.contains(":"))
        {
            sDomainPort = sDomainPort + ":80";// url中未写端口号则认为使用默认80端口
        }
        return sDomainPort;
    }

    public static  void main(String args[]){

    String str=    HttpClientUtil.httpGET("https://blog.csdn.net/qicui2835/article/details/80945749");
    System.out.println(str);
    }

}
