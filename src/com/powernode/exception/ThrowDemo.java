package com.powernode.exception;
/*
    throw : 抛出异常对象使用的关键字。
    我们在声明方法的时候,如果方法上声明了形参,我们就需要对每一个形参数据进行强壮性的判断。
    如果传递的实参数据，超出方法的处理范围，就需要使用 throw 关键字抛出对应异常对象。
    if ( 强壮性判断代码 ){
        throw new 异常对象("异常信息");
    }
    如果抛出的是运行时期的异常类对象可以不用处理。 如果抛出的是编译时期的异常对象就一定要处理之后才能运行。
 */
public class ThrowDemo {
    public static void main(String[] args)  {

        // 声明数组
        int[] arr = { 1,2,3,4,5,6 };
        int value = getValue(null, 31);
        System.out.println("value = " + value);
    }
    // 根据指定的下标返回对应的数据
    public static int getValue( int[] arr , int index ) {
        // 增强强壮性判断
        if( arr == null ) {
            throw new NullPointerException("哥们,数组不可以为null...");
        }
        //Objects.requireNonNull(arr);// 检测对象是否为空

        if( index < 0 || index > arr.length - 1 ) {
            throw new ArrayIndexOutOfBoundsException("哥们,数组的下标越界啦...");
        }
        return arr[index];
    }
}
