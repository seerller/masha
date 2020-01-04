package com.gangan.tools;



import com.alibaba.fastjson.JSON;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component
public class AliSmsUtils  {

    private static String accessKeyId = "LTAI4Ft9Cf3zko6ZMWYBShdT";
    private static String AccessKeySecret = "SUnK1fBkNaVWPDoWe69oSNLrL0PjWy";
    private static String smsUrl = "dysmsapi.aliyuncs.com";

    private static String sendSms(String phone , Map param , String templateCode){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, AccessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain(smsUrl);
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "大觅");
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", JSON.toJSONString(param));

        CommonResponse response = null;

        try {
            response = client.getCommonResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch(ClientException e) {
            e.printStackTrace();
        }
        return response.getData();
    }

    /**
     * 发送短信验证码
     * @param phone
     * @return
     */
    public static String sendCode(String phone) {

        //随机验证码
        String code = String.valueOf(new Random().nextInt(899999) + 100000);

        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set(phone, code);
        //设置60秒过期
        jedis.setex(phone, 60, code);
        jedis.close();

        Map param = new HashMap();
        param.put("code" , code);

        //sendSms(phone , param , "SMS_177257151");

        return code;
    }

    /**
     * 订单确认短信通知
     * @param phone
     * @param param
     * @return
     */
    public String sendOrderNotice(String phone , Map param){

        return sendSms(phone , param , "SMS_177257151");
    }


    /**
     * 预约订单提醒
     * @param phone
     * @param param
     * @return
     */
    public String sendOrderRemind(String phone , Map param){

        return sendSms(phone , param , "SMS_177551030");
    }
}
