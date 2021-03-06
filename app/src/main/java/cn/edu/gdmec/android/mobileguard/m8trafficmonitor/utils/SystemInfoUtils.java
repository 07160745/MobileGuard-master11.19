package cn.edu.gdmec.android.mobileguard.m8trafficmonitor.utils;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import cn.edu.gdmec.android.mobileguard.R;
public class SystemInfoUtils{
    public static boolean isServiceRunning(Context context,String className){
        ActivityManager am=(ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> infos=am.getRunningServices(200);
        for (ActivityManager.RunningServiceInfo info:infos){
             String serviceClassName=info.service.getClassName();
            if (className.equals(serviceClassName)){
                return true;
            }
        }
        return false;
    }
}
