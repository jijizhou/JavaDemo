package com.example.javademo.base;

/**
 * 自定义的 异常
 */
public class BaseException extends Exception {

    //无参构造方法
    public BaseException(){
        super();
    }

    //有参的构造方法
    public BaseException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public BaseException(String message, Throwable cause){
        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public BaseException(Throwable cause) {
        super(cause);
    }
}
