package com.masha.tools;

import com.github.houbb.opencc4j.util.ZhConverterUtil;

public class ZiTiUtils {

    public static void main(String[] args) throws Exception {

        String original = "吴医生";
        String result = ZhConverterUtil.convertToSimple(original);
        System.out.println(result);
        String result1 = ZhConverterUtil.convertToTraditional(result);
        System.out.println(result1);


    }
}
