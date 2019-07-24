package com.example.javademo.activity.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javademo.R;
import com.example.javademo.activity.index.IndexActivity;
import com.example.javademo.base.BaseActivity;

public class MainActivity extends BaseActivity {


    Button btn_toIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
    }

    private void initListener() {
        btn_toIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(IndexActivity.class);
            }
        });
    }

    private void initView() {
        btn_toIndex = (Button) findViewById(R.id.btn_toIndex);

    }
}
