package com.hyfun.transitionanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.anim_scale_close_exit);
    }
}
