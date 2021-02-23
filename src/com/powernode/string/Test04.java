package com.powernode.string;

import java.util.Arrays;

/*
    需求: 使用#号对字符串数据进行切割,然后对切割后的字符串数据排序

 */
public class Test04 {
    public static void main(String[] args) {
        String s = "dalfdj#lad#flaj#ljoi#jwfoi#wjeofj#oad";
        String[] split = s.split("#");
        System.out.println(Arrays.toString(split));

    }
}
