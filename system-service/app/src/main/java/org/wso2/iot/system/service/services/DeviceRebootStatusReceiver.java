//package org.wso2.iot.system.service.services;
//
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//
//import org.wso2.iot.system.service.SystemService;
//
///**
// * Created by madhawa on 11/19/17.
// */
//
//public class DeviceRebootStatusReceiver extends BroadcastReceiver {
//    private static final String TAG = DeviceRebootStatusReceiver.class.getName();
//    private String operation = null;
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
//                Intent pushIntent = new Intent(context, SystemService.class);
//                context.startService(pushIntent);
//            }
//        }
//}
