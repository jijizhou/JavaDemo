package com.example.javademo.activity.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javademo.R;
import com.example.javademo.activity.index.IndexActivity;
import com.example.javademo.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_toIndex )
    public void clickBtnIndex(){
        startActivity(IndexActivity.class);
    }
}
