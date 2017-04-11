package com.example.ericyu.myapplication.ui.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ericyu.myapplication.R;

/**
 * Created by ericyu on 2017/4/10.
 */

public class CaptureButtonWithProgress extends RelativeLayout implements View.OnClickListener{

    private Context mContext;

    //拍摄按钮的进度条
    //protected SmoothRoundProgressBar mSmoothRoundProgressBar;

    //拍摄按钮中间文字
    protected TextView mCaptureTextTV;

    //拍摄按钮中间打钩图片
    //protected AnimationTickView mCaptureSuccessIV;

    //拍摄按钮底部较大的圆
    protected View mCaptureBtnOutsideCirle;

    public CaptureButtonWithProgress(Context context) {
        super(context);
    }

    public CaptureButtonWithProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.yy_capture_button_progress,this);
        mContext = context;
    }

    public CaptureButtonWithProgress(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CaptureButtonWithProgress(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onClick(View v) {

    }
}
