package com.powernode.exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.zip.DataFormatException;
/*
    声明异常
 */
public class ThrowsDemo {
    public static void main(String[] args) throws FontFormatException, DataFormatException, ParseException {
        // 调用方法
        demo(1,2);
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.parse("");
    }
    // 异常方法
    public static void demo( int a , int b ) throws FontFormatException , DataFormatException {
        // 数据如果下于0 则默认为异常数据
        if( a < 0 ) {
            throw new FontFormatException("");
        }
        if( b < 0 ) {
            throw new DataFormatException("不能小于0...");

        }
    }

    public static void a() throws DataFormatException, FontFormatException {
        demo(1,2);
    }
}
