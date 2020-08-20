package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btn1(View view) {
        Intent intent = new Intent(this,JsonActivity.class);
        startActivity(intent);
    }

    public void btn2(View view) {
        Intent intent = new Intent(this,FormActivity.class);
        startActivity(intent);
    }

    public void btn3(View view) {
        Intent intent = new Intent(this,loginActivity.class);
        startActivity(intent);
    }

    public void btn4(View view) {
        Intent intent = new Intent(this,teacherActivity.class);
        startActivity(intent);
    }
}