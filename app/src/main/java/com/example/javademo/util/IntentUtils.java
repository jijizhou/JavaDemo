package com.example.javademo.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

import com.example.javademo.base.BaseConstants;

/**
 * Intent 统一处理类，包含来源
 */
public class IntentUtils
{
    /**
     * 跳转添加 来源
     */
    public static Intent getSchemaIntent(Activity current, String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        ActivityManager manager = (ActivityManager) current.getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.RunningTaskInfo info = manager.getRunningTasks(1).get(0);
        String shortClassName = info.topActivity.getShortClassName();    //类名
//        String className = info.topActivity.getClassName();              //完整类名
//        String packageName = info.topActivity.getPackageName();          //包名
        intent.putExtra("from",shortClassName);
        return intent;
    }

    /**
     * 跳转添加 来源Activity
     */
    public static Intent putFrom(Activity current, Intent intent)
    {
        ActivityManager manager = (ActivityManager) current.getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.RunningTaskInfo info = manager.getRunningTasks(1).get(0);
        intent.putExtra("from",info.topActivity.getShortClassName());
        LogUtil.e("-----from; " + info.topActivity.getShortClassName());
        return intent;
    }

    /**
     * 跳转添加 来源Fragment
     */
    public static Intent putFrom(Fragment fragment, Intent intent)
    {
        intent.putExtra("from",fragment.getClass().getName());
        LogUtil.e("-----from; " + fragment.getClass().getName());
        return intent;
    }


}
