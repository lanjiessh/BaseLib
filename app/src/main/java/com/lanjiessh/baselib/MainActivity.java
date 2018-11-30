package com.lanjiessh.baselib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ryeex.common.JLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JLog.d("");
    }
}
