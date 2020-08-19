package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<projItem> datalist = new ArrayList<projItem>();
    BaseAdapter baseAdapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return datalist.size();
        }

        @Override
        public Object getItem(int position) {
            return datalist.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        //每个视图的view长什么样
        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            View itemView = View.inflate(MainActivity.this, R.layout.lv_item,null);
            projItem projlist=datalist.get(position);
            ((TextView)itemView.findViewById(R.id.proj_title)).setText((projlist.proj_title));
            ((TextView)itemView.findViewById(R.id.proj_chatCount)).setText((projlist.proj_chatCount));
            ((TextView)itemView.findViewById(R.id.proj_price)).setText((projlist.proj_price));
            ((TextView)itemView.findViewById(R.id.proj_desc)).setText((projlist.proj_desc));
            return itemView;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView Lv = (ListView)findViewById(R.id.lv2);
        projItem proj = new projItem();
        proj.proj_title="火车票x";
        proj.proj_desc="详情";
        proj.proj_price="1";
        proj.proj_chatCount="20";
        datalist.add(proj);
        Lv.setAdapter(baseAdapter);

    }

    public void addClick(View view) {
        projItem proj = new projItem();
        proj.proj_title="火车票x";
        proj.proj_desc="详情";
        proj.proj_price="1";
        proj.proj_chatCount="20";
        datalist.add(proj);
        baseAdapter.notifyDataSetChanged();
    }
}
