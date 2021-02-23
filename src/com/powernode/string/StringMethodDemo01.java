package com.powernode.string;
/*
    boolean contains(CharSequence s) 如果并且只有当此字符串包含指定的字符序列的字符串值，则返回真值。
	boolean endsWith(String suffix) 测试字符串是否以指定的后缀结束。  "www.baidu.com"
	boolean startsWith(String prefix) 测试这个字符串是否以指定的前缀开始。
	boolean equals(Object anObject) 将此字符串与指定的对象比较。判断两个字符串是否相等
	boolean isEmpty() 判断字符串是否为空。
 */
public class StringMethodDemo01 {
    public static void main(String[] args) {
        // 声明字符串
        String str = "www.akadksjaaaflaj.com";
        // boolean contains(CharSequence s) 如果并且只有当此字符串包含指定的字符序列的字符串值，则返回真值。
        boolean aaa = str.contains("aaa");
        System.out.println("aaa = " + aaa);
        /*
            boolean endsWith(String suffix) 测试字符串是否以指定的后缀结束。  "www.baidu.com"
	        boolean startsWith(String prefix) 测试这个字符串是否以指定的前缀开始。
         */
        boolean endsWith = str.endsWith(".com");
        System.out.println("endsWith = " + endsWith);
        boolean startsWith = str.startsWith("www.");
        System.out.println("startsWith = " + startsWith);

        // boolean isEmpty() 判断字符串是否为空。
        boolean empty = str.isEmpty();
        System.out.println("empty = " + empty);

        // boolean equals(Object anObject) 将此字符串与指定的对象比较。判断两个字符串是否相等
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println( s1 == s2 );
        System.out.println( s1.equals(s2) );
    }
}
