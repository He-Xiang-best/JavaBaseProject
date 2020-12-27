package util;
/*
 * @author:何翔
 * @date:2020/11/20 9:38
 * @description:判断给定字符是否为空
 /*
 
 */

public class StringUtil {
    public static boolean isEmpty(String str){
        if("".equals(str)|| str == null){
            return true;
        }
        return false;
    }
}
