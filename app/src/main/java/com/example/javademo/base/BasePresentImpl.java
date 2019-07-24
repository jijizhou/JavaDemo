package com.example.javademo.base;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * Present 基类
 */
public abstract class BasePresentImpl
{
    public Activity activity;
    public BaseView baseView;

    public BasePresentImpl(BaseView baseView)
    {
        if (baseView instanceof Fragment)
        {
            activity = ((Fragment) baseView).getActivity();
        }
        else
        {
            activity = (Activity) baseView;
        }
        this.baseView = baseView;
    }

    protected abstract void init(boolean isRefresh);

}
