package com.powernode.exception;

import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
    捕获异常 : try catch 一起使用
    声明异常最终是把异常的信息告知了JVM,而JVM对异常的处理方式就是终止程序,会导致后续的代码无法执行。
    捕获异常的好处是，当我们捕获的异常之后,可以对异常进行自定义的处理,而不用结束整个程序。
    try {
        异常的代码
    }
    catch ( 异常的类型 变量名) {
        对异常的处理方式
        // 打印异常信息   记录日志   继续抛出异常
    }
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        // 格式化日期
        Date date = new Date();
        System.out.println("date = " + date);
        // 声明格式化类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        System.out.println("format = " + format);
        String time = "2020-12-19";
        // 将日期字符串解析为Date对象
        try {
            Date parse = sdf.parse(time);
            System.out.println(parse);
        } catch ( ParseException e ) {
            // 对异常的处理
            System.out.println("异常被捕获了....");
            e.printStackTrace();
        }
        System.out.println("HelloWorld");
        try{
            demo(1,-12);
        }catch (FontFormatException e) { // Exception e = new FontFormatException("不能为0...");
            System.out.println("a小于0 异常被捕获了...");
        }catch (Exception e) {
            System.out.println("b小于0 异常被捕获了...");
        }
        System.out.println("...................");
    }
    public static void demo(int a , int b ) throws FontFormatException, Exception {
        if( a < 0 ) {
            throw new FontFormatException("不能为0...");
        }
        if( b < 0 ) {
            throw new Exception("不能为0....");
        }
        System.out.println(a);
    }
}
