package com.coolweather.anxy;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

import org.litepal.LitePal;

/**
 * Created by Sanwuwy on 2016/12/25.
 */

public class CoolWeatherApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        MobclickAgent.setDebugMode(true);
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);
    }
}
