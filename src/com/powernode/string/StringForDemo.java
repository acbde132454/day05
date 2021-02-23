package com.powernode.string;
/*
    char charAt(int index) 返回指定索引的 char价值。
	int length() 返回此字符串的长度。
 */
public class StringForDemo {
    public static void main(String[] args) {
        // 声明字符串
        String s = "djlsdajljdajadsfjdfsa";
        int length = s.length();
        System.out.println("length = " + length);
        char c = s.charAt(3);
        System.out.println("c = " + c);

        // 字符串遍历
        for( int i = 0; i < s.length() ;i++ ) {
            char c1 = s.charAt(i);
            System.out.print(c1 + "  ");
        }
    }
}
