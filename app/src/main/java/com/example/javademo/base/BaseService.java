package com.example.javademo.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.NonNull;

import com.example.javademo.util.LogUtil;


public class BaseService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.e(((Service)this).getClass().getName() + " - onCreate");
    }

    @NonNull
    @Override
    public IBinder onBind(Intent intent) {
        LogUtil.e(((Service)this).getClass().getName() + " - onBind");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        LogUtil.e(((Service)this).getClass().getName() + " - onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        LogUtil.e(((Service)this).getClass().getName() + " - onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.e(((Service)this).getClass().getName() + " - onDestroy");
    }
}
