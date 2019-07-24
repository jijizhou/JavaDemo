package com.example.javademo.activity.index;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.javademo.R;
import com.example.javademo.base.BaseActivity;

/**
 * 极光推送打开的界面
 */
public class IndexActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_activity);
    }

}
