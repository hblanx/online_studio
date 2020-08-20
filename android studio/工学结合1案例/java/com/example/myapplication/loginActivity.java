package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void send(View view) {
        EditText userName = (EditText)findViewById(R.id.user_name);
        String StruserName = userName.getText().toString();
        EditText userPasswd = (EditText)findViewById(R.id.user_passwd);
        String StruserPasswd = userPasswd.getText().toString();
        int canPass = 1;
        if (StruserPasswd.length()<=3){
            Toast.makeText(this,"密码太短",Toast.LENGTH_SHORT).show();
            canPass=0;
        }
        if (StruserName.length()<3){
            Toast.makeText(this,"用户名太短",Toast.LENGTH_SHORT).show();
            canPass=0;
        }
        if (!StruserPasswd.equals("123456")){
            Toast.makeText(this,"密码错误",Toast.LENGTH_SHORT).show();
            canPass=0;
        }
        if(canPass==1){
            Toast.makeText(this,"登陆成功",Toast.LENGTH_SHORT).show();
        }
    }
}