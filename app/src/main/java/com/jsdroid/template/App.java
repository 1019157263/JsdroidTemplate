package com.jsdroid.template;

import androidx.multidex.MultiDexApplication;

import com.jsdroid.core.JsdApp;
import com.jsdroid.ui.floaty.JsdFloaty;

public class App extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        JsdApp.getInstance().init(this);
        JsdFloaty.Companion.getInstance().init(this);
    }
}
