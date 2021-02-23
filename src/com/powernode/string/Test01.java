package com.powernode.string;

public class Test01 {
    public static void main(String[] args) {
        // 声明字符串
        String str = "jlajdljdsssjldjflsjssd";
        int count = getCount(str);
        System.out.println("count = " + count);
    }
    // 统计字符串中s字符出现的次数
    public static int getCount( String str ) {
        // 声明计数器
        int count = 0;
        for( int i = 0; i < str.length(); i++ ) {
            if( str.charAt(i) == 's') {
                count++;
            }
        }
        return count;
    }
}
