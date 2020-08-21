package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.RadioGroup;
import android.widget.TabHost;

public class loginActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final TabHost th = getTabHost();
        TabHost.TabSpec ts1;
        ts1 = th.newTabSpec("tab1").setIndicator("tab1").setContent(new Intent(this,tab1Activity.class));
        TabHost.TabSpec ts2;
        ts2 = th.newTabSpec("tab2").setIndicator("tab2").setContent(new Intent(this,tab2Activity.class));
        th.addTab(ts1);
        th.addTab(ts2);
        RadioGroup rg = (RadioGroup)findViewById(R.id.IDradioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //切换单选的时候
                //checkedId,要么是 R.id.button1，要么是R.id.button2
                th.setCurrentTab(i-R.id.btn1);
            }
        });
    }


}
