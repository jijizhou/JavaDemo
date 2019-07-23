package com.example.javademo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.javademo.IndexActivity;

import cn.jpush.android.api.JPushInterface;

/**
 * com.example.javademo.receiver.MineJpushReceiver  这个是快速集成必须要的类
 * 当前类，配置相同的过滤器，也是会收到对应的消息，可以处理收到消息之后操作
 */
public class MineReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            Bundle bundle = intent.getExtras();
            if (JPushInterface.ACTION_REGISTRATION_ID.equals(intent.getAction())) {
                //极光服务器分配的Registration Id，
                String regId = bundle.getString(JPushInterface.EXTRA_REGISTRATION_ID);
            } else if (JPushInterface.ACTION_MESSAGE_RECEIVED.equals(intent.getAction())) {
                //自定义消息

            } else if (JPushInterface.ACTION_NOTIFICATION_RECEIVED.equals(intent.getAction())) {
                //推送通知

            } else if (JPushInterface.ACTION_NOTIFICATION_OPENED.equals(intent.getAction())) {

                //当用户点击通知时的操作,打开自定义的Activity
                Intent i = new Intent(context, IndexActivity.class);
//                i.putExtras(bundle);
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
