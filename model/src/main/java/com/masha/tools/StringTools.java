package com.gangan.tools;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 字符串工具类
 * @author zhengweicheng
 */
public class StringTools {
    /**
     * 切割字符串并将数组转化为Int集合
     * @param str   字符串
     * @return
     */
    public static List<Integer> resultIntegerArrayBySplitString(String str){
        if(StringUtils.isBlank(str)){
            return null;
        }
        return resultIntegerArray(new ArrayList<String>(Arrays.asList(str.split(","))));
    }
    /**
     * 将String类型的集合转换为Int类型的集合
     * @param list
     * @return
     */
    public static List<Integer> resultIntegerArray(List<String> list){
        try {
            List<Integer> result = new ArrayList<>();
            Iterator<String> iterator =list.iterator();
            while (iterator.hasNext()){
                result.add(Integer.parseInt(iterator.next()));
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            throw new LogicException(null);
        }

    }
}
