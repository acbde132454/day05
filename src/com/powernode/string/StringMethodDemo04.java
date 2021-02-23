package com.powernode.string;
/*
    int indexOf(int ch) 返回指定字符在字符串中第一次出现的下标。
	int indexOf(int ch, int fromIndex) 从指定下标开始查找,返回指定字符在字符串中第一次出现的下标。
	int indexOf(String str) 返回指定字符串在字符串中第一次出现的下标。
	int indexOf(String str, int fromIndex) 从指定下标开始查找,返回指定字符串在字符串中第一次出现的下标。
	int lastIndexOf(int ch) 返回指定字符在字符串中最后一次出现的下标。
	int lastIndexOf(int ch, int fromIndex) 从指定下标开始查找,返回指定字符在字符串中最后一次出现的下标。
	int lastIndexOf(String str) 返回指定字符串在字符串中最后一次出现的下标。
	int lastIndexOf(String str, int fromIndex)从指定下标开始查找,返回指定字符串在字符串中最后一次出现的下标。
 */
public class StringMethodDemo04 {
    public static void main(String[] args) {
        // 声明字符串数据
        String str = "abcdefghiajk";
        /*
            int indexOf(int ch) 返回指定字符在字符串中第一次出现的下标。
	        int indexOf(int ch, int fromIndex) 从指定下标开始查找,返回指定字符在字符串中第一次出现的下标。
         */
        int a = str.indexOf('a');
        System.out.println("a = " + a);
        int a1 = str.indexOf('a', 3);
        System.out.println("a1 = " + a1);

        /*
            int indexOf(String str) 返回指定字符串在字符串中第一次出现的下标。
	        int indexOf(String str, int fromIndex) 从指定下标开始查找,返回指定字符串在字符串中第一次出现的下标。
         */
        int a2 = str.indexOf("a");
        System.out.println("a2 = " + a2);
        int gh = str.indexOf("gh", 3);
        System.out.println("gh = " + gh);
    }
}
