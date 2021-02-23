package com.powernode.string;

import java.util.Arrays;

/*
    byte[] getBytes() 将字符串数据转换为字节数组。
	char[] toCharArray() 将字符串数据转换为字符数组。
	String toLowerCase() 将字符串转换为全部小写。
	String toUpperCase() 将字符串转换为全部大写。
 */
public class StringMethodDemo02 {
    public static void main(String[] args) {
        // 声明字符串数据
        String str = "abcdefgABCD";
        // byte[] getBytes() 将字符串数据转换为字节数组。
        byte[] bytes = str.getBytes();
        System.out.println( Arrays.toString(bytes) );
        // char[] toCharArray() 将字符串数据转换为字符数组。
        char[] chars = str.toCharArray();
        System.out.println( Arrays.toString(chars) );

        /*
            String toLowerCase() 将字符串转换为全部小写。
	        String toUpperCase() 将字符串转换为全部大写
         */
        String lowerCase = str.toLowerCase();
        System.out.println( "lowerCase = " + lowerCase );
        String upperCase = str.toUpperCase();
        System.out.println("upperCase = " + upperCase);
    }
}
