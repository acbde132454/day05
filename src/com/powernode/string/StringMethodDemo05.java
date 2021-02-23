package com.powernode.string;
/*
    String replace(char oldChar, char newChar) 将指定的字符替换为新的字符。
	String replace(CharSequence target, CharSequence replacement)将指定的字符串替换为新的字符串。
	String trim() 删除字符串数据两侧的空格，返回新的字符串数据。
	String concat(String str) 将指定的字符串，拼接此字符串的末尾。
 */
public class StringMethodDemo05 {
    public static void main(String[] args) {
        // 声明字符串
        String str = "Hello World!!";
        // String replace(char oldChar, char newChar) 将指定的字符替换为新的字符。
        String replace = str.replace('o', 'O');
        System.out.println("replace = " + replace);

        // String replace(CharSequence target, CharSequence replacement)将指定的字符串替换为新的字符串。
        String replace1 = str.replace("Hello", "heool");
        System.out.println("replace1 = " + replace1);
        System.out.println(str);

        // String trim() 删除字符串数据两侧的空格，返回新的字符串数据。
        String s = " d l j ";
        System.out.println("s = " + s);
        String trim = s.trim();
        System.out.println("trim = " + trim);

        // String concat(String str) 将指定的字符串，拼接此字符串的末尾。
        String s1 = "abc" + "bce".concat("AAA");
        System.out.println("s1 = " + s1);
    }
}
