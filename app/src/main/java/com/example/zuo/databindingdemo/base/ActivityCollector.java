package com.example.zuo.databindingdemo.base;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zuo
 * @date 2018/5/3 17:26
 */
public class ActivityCollector {
    private static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity activity){
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    //获取当前栈顶activity
    public static Activity getTopActivity(){
        if (activityList.isEmpty()){
            return null;
        }else {
            return activityList.get(activityList.size()-1);
        }
    }

    public static void finishAll(){
        for (Activity activity : activityList) {
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
