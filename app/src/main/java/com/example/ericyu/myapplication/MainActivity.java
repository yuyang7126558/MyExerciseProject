package com.example.ericyu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ericyu.myapplication.ui.MyViewTestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpToMyCaptureButton(View view) {
        Intent intent = new Intent(this,MyViewTestActivity.class);
        startActivity(intent);
    }
}
