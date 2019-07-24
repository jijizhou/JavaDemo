package com.example.javademo.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javademo.R;
import com.example.javademo.activity.index.IndexActivity;
import com.example.javademo.base.BaseActivity;
import com.example.javademo.service.StartService;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private Intent service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        //开启服务
        service = new Intent(this, StartService.class);
        startService(service);
    }

    @OnClick(R.id.btn_toIndex )
    public void clickBtnIndex(){
        //结束服务
        stopService(service);
        startActivity(IndexActivity.class);
    }
}
