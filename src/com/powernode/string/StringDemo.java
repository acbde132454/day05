package com.powernode.string;

public class StringDemo {
    public static void main(String[] args) {
        // 声明字符串对象
        String s = new String("abc");
        String s1 = "abc";
        String s2 = "abc";
        System.out.println( s == s1 );
        System.out.println( s1 == s2 );

        String s3 = "abc";
        System.out.println("s3 = " + s3);
        s3 = "SSS";
        System.out.println("s3 = " + s3);

        s3 = "SSS" + "abc";
        System.out.println(s3);
    }
}
