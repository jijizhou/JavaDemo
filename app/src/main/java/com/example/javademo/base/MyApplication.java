package com.example.javademo.base;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);//如果时正式版就改成false
        JPushInterface.init(this);

//        JPushInterface.setAlias(this,"1234");
    }
}
