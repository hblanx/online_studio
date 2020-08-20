package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.os.Bundle;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    public void formSend(View view) {
        int isOk = 1;
        EditText name = (EditText)findViewById(R.id.name);
        String Strname = name.getText().toString();
        EditText group = (EditText)findViewById(R.id.group);
        String Strgroup = group.getText().toString();
        EditText contact = (EditText)findViewById(R.id.contact);
        String Strcontact = contact.getText().toString();
        EditText contactInfo = (EditText)findViewById(R.id.contactInfo);
        String StrcontactInfo = contactInfo.getText().toString();
        EditText Msg = (EditText)findViewById(R.id.Msg);
        String StrMsg = Msg.getText().toString();
        if(Strname.length()==0){isOk=0;}
        if(Strgroup.length()==0){isOk=0;}
        if(Strcontact.length()==0){isOk=0;}
        if(StrcontactInfo.length()==0){isOk=0;}
        if(StrMsg.length()==0){isOk=0;}
        if(isOk==1) {
            Toast.makeText(this, "确定", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "请检查输入是否正确", Toast.LENGTH_SHORT).show();
        }
    }
}