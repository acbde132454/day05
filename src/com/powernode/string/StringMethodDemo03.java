package com.powernode.string;

import java.util.ArrayList;
import java.util.Arrays;

/*
    截取的方法
    String[] split(String regex) 按照指定的符号对字符串进行切，返回字符串数组。
	String substring(int beginIndex) 从起始下标截取到字符串末尾，返回新的字符串。
	String substring(int beginIndex, int endIndex) 从起始下标截取到结束下标，返回新的字符串。
	比较的方法
	int compareTo(String anotherString) 比较两个字符串的字典。
	int compareToIgnoreCase(String str) 按字典顺序比较两个字符串，忽略大小写的差异。
 */
public class StringMethodDemo03 {
    public static void main(String[] args) {
        // s声明字符串
        String str = "abcde#sjls#jffg";
        System.out.println("str = " + str);
        /*
            String substring(int beginIndex) 从起始下标截取到字符串末尾，返回新的字符串。
	        String substring(int beginIndex, int endIndex) 从起始下标截取到结束下标，返回新的字符串。
         */
        String substring = str.substring(3);
        System.out.println("substring = " + substring);
        String substring1 = str.substring(1, 7);
        System.out.println("substring1 = " + substring1);

        // String[] split(String regex) 按照指定的符号对字符串进行切，返回字符串数组。
        String[] split = str.split("#");
        System.out.println(Arrays.toString( split ));
        Arrays.sort(split); // 排序
        System.out.println(Arrays.toString(split));

        /*
            int compareTo(String anotherString) 比较两个字符串的字典。
	        int compareToIgnoreCase(String str) 按字典顺序比较两个字符串，忽略大小写的差异。
         */
        String s1 = "abcd";
        String s2 = "ABCD";
        int i = s1.compareTo(s2); // 比较的出的非0的结果
        System.out.println("i = " + i);
    }
}
