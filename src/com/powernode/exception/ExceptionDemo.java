package com.powernode.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        // 声明数组
        int[] arr = new int[10];
        arr[11] = 199;
        print( arr );

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date parse = sdf.parse("");



    }
    public static void print( int[] arr ) {
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
