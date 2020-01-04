package com.gangan.tools;

import com.zhenzi.sms.ZhenziSmsClient;
import io.swagger.models.auth.In;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * 发送短信工具类
 */
public class SmsUtil {

    private Logger log = LoggerFactory.getLogger(getClass());
    //个人开发者请求地址
    private  static String apiUrl="https://sms_developer.zhenzikj.com";

    //企业开发着请求地址
//    private static String apiUrl="https://sms.zhenzikj.com";

    //小程序appId;
    private  static String appId;

    //小程序 appSecret
    private  static String appSecret;

    /**
     * 发送短信验证码
     * @param phone
     */
    public static String sendSms(String phone) throws  Exception{

        ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
        //随机验证码
        String code=String.valueOf(new Random().nextInt(899999) + 100000);

        String result=null;
        try {
          // 发送短信(返回状态报告)
//            result = client.send(phone, "您的验证码为" + code, "dfee_dfdw_xdfd_dfdfd");
            Jedis jedis = new Jedis("localhost", 6379);
            //验证码存入redis
		    jedis.set(phone, code);
		    //设置60秒过期
		    jedis.setex(phone, 60,code);
		    jedis.close();
            return code;
        }catch (Exception e){
//            log.error("获取验证码失败");
            e.printStackTrace();
            return result;
        }
    }


}
