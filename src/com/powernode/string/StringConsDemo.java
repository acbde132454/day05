package com.powernode.string;
/*
    String(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组构造了一个新的 String。
    String(byte[] bytes, int offset, int length)构建了一种新的 String通过解码指定的字节数组使用平台的默认字符集。
    String(char[] value) 将字符数组中的数据转换为字符串数据。
	String(char[] value, int offset, int count)分配一个包含字符与字符数组数组参数的新 String。
 */
public class StringConsDemo {
    public static void main(String[] args) {
        // 声明字节数组
        byte[] bytes = {97,98,99,65,66,67};
        // 通过构造方法将字节数组中的数据转换为字符串数据
        String s1 = new String( bytes );
        System.out.println("s1 = " + s1);
        String s2 = new String(bytes ,2,2 );
        System.out.println("s2 = " + s2);

        // 声明字符数组
        char[] chars = {'a','b','c','d','e','f'};
        // 通过构造方法将字符数组中的数据转换为字符串数据
        String s3 = new String(chars);
        System.out.println("s3 = " + s3);
        String s4 = new String(chars ,3,3);
        System.out.println("s4 = " + s4);
    }
}
