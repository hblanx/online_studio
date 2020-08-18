package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        EditText userName = (EditText)findViewById(R.id.user_name);
        String StruserName = userName.getText().toString();
        EditText userPasswd = (EditText)findViewById(R.id.user_passwd);
        String StruserPasswd = userPasswd.getText().toString();
        Toast.makeText(this, StruserName+StruserPasswd, Toast.LENGTH_SHORT).show();
    }
}
