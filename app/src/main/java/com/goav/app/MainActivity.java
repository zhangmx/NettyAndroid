package com.goav.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ClientBus.Initialization(this, "token", "host", 8080);
    }

    public void push(Object o) {
//        ClientBus.request(o);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        ClientBus.Recycle();
    }
}
