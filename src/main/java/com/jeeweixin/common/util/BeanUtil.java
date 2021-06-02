package com.jeeweixin.common.util;

/**
 * Bean 转换工具
 */
public class BeanUtil {

    /**
     * 转换将第一个字母大写变成小写，并在前面加下划线
     * @param args
     */
    public static String fieldToColumn(String str) {
        char[] chars = str.toCharArray();
        String rstStr = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 64 && chars[i] < 94) {
                rstStr += ("_" + chars[i]).toLowerCase();
            } else {
                rstStr += chars[i];
            }
        }
        return rstStr;
    }
    
    /**
     * 首字母变大写
     * @param args
     */
    public static String upperCaseFirst(String str) {
    	return Character.toUpperCase(str.charAt(0))+str.substring(1, str.length());
    }
    
    /**
     * 首字母变小写
     * @param args
     */
    public static String lowerCaseFirst(String str) {
    	return Character.toLowerCase(str.charAt(0))+str.substring(1, str.length());
    }
	
}
