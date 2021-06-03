package com.jsdroid.template;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ComponentActivity;

import com.jsdroid.core.JsdApp;
import com.jsdroid.ui.UiActivity;

public class MainActivity extends UiActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JsdApp.getInstance().runLastScript();
        JsdApp.getInstance().loadAssetsScript();
    }
}