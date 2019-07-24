package com.example.javademo.activity.index;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.javademo.R;
import com.example.javademo.base.BaseActivity;
import com.example.javademo.base.BindConnection;
import com.example.javademo.service.BindService;

/**
 * 极光推送打开的界面
 */
public class IndexActivity extends BaseActivity {

    private BindConnection conn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_activity);
        bind();
    }

    private void bind() {
        //开启服务
        Intent service = new Intent(this, BindService.class);
        conn = new BindConnection();
        //第一个参数：Intent意图
        //第二个参数：是一个接口，通过这个接口接收服务开启或者停止的消息，并且这个参数不能为null
        //第三个参数：开启服务时的操作，BIND_AUTO_CREATE代表自动创建service
        bindService(service, conn, BIND_AUTO_CREATE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (conn != null) {
            unbindService(conn);
        }
    }
}
