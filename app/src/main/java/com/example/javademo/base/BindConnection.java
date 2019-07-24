package com.example.javademo.base;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public class BindConnection implements ServiceConnection {

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {

    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }

    @Override
    public void onBindingDied(ComponentName name) {

    }

    @Override
    public void onNullBinding(ComponentName name) {

    }
}
