package com.jiyun.lenovo.gitdemo02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
         intiData();
    }

    private void intiData() {
        Log.e("TAG","我的电脑好卡!......");
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listView);
    }
}
