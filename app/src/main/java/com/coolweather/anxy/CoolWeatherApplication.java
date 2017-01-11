package com.coolweather.anxy;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.umeng.analytics.MobclickAgent;

import org.litepal.LitePal;

/**
 * Created by Sanwuwy on 2016/12/25.
 */

public class CoolWeatherApplication extends Application {

    private static final String BUGLY_APPID = "be9994f2bd";
    private static final String BUGLY_APPKEY = "8ae2cb22-3eb4-4fa9-8210-6a14967c7fd6";
    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(), BUGLY_APPID, BuildConfig.LOG_DEBUG);
        LitePal.initialize(this);
        MobclickAgent.setDebugMode(true);
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);
        MobclickAgent.setCatchUncaughtExceptions(false);   // 关闭友盟的日志功能
    }
}
