package com.powernode.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyDemo {
    public static void main(String[] args) {
        // 声明解析对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 声明日期字符串
        String time = "2019-12/19";
        // 解析日期字符串
        try {
            Date parse = sdf.parse(time);
            System.out.println(parse);
        }catch (ParseException e ) {
            System.out.println("异常被捕获了....");
        }finally {
            System.out.println("一定要执行的代码....");
        }
        System.out.println("Hello World!!");

    }
}
