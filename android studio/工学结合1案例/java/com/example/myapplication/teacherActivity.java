package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class teacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
    }

    public void btn1(View view) {
        Toast.makeText(this,"修改密码",Toast.LENGTH_SHORT).show();
    }

    public void btn2(View view) {
        Toast.makeText(this,"我的项目",Toast.LENGTH_SHORT).show();
    }

    public void btn3(View view) {
        Toast.makeText(this,"退出登陆",Toast.LENGTH_SHORT).show();
    }
}