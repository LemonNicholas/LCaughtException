package com.lemon.demo;

import android.app.Application;

import lemon.library.util.ExceptionSetting;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ExceptionSetting.setIsDebugMode(true);
    }
}
