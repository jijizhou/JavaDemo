package com.example.javademo.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.javademo.util.IntentUtils;
import com.example.javademo.util.LogUtil;

public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.e(((Activity)this).getClass().getName() + " - onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.e(((Activity)this).getClass().getName() + " - onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.e(((Activity)this).getClass().getName() + " - onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.e(((Activity)this).getClass().getName() + " - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.e(((Activity)this).getClass().getName() + " - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.e(((Activity)this).getClass().getName() + " - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.e(((Activity)this).getClass().getName() + " - onDestroy");
    }

    public void startActivity(Class clazz)
    {
        try{
            Intent intent = new Intent(this, clazz);
            this.startActivity(IntentUtils.putFrom(this, intent));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
