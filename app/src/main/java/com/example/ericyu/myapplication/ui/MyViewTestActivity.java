package com.example.ericyu.myapplication.ui;

import android.os.Bundle;

import com.example.ericyu.myapplication.R;
import com.example.ericyu.myapplication.ui.view.CaptureButtonWithProgress;

public class MyViewTestActivity extends YYBaseActivity {

    CaptureButtonWithProgress mCaptureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_view_test2);
        initView();
    }

    private void initView() {
        mCaptureButton = (CaptureButtonWithProgress) findViewById(R.id.yy_view_capture_button);
    }
}
