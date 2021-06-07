package com.jsdroid.template;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;

import com.jsdroid.core.JsdApp;
import com.jsdroid.ui.UiActivity;

import java.net.URL;
import java.nio.ByteBuffer;

import dalvik.system.InMemoryDexClassLoader;

public class MainActivity extends UiActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JsdApp.getInstance().runLastScript();
        JsdApp.getInstance().loadAssetsScript();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            new InMemoryDexClassLoader(ByteBuffer.allocate(1),null);
        }
    }
    class U extends ClassLoader{
        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            defineClass();
            return super.findClass(name);
        }

    }
}