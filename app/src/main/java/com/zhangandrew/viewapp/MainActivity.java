package com.zhangandrew.viewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.one);
    }
    public void onClick1(View view){
        setContentView(R.layout.two);
    }
    public void onClick2(View view){
        setContentView(R.layout.three);
    }
    public void onClick3(View view){
        setContentView(R.layout.four);
    }
    public void onClick4(View view){
        setContentView(R.layout.five);
    }
    public void onClick5(View view){
        setContentView(R.layout.six);
    }
    public void onClick6(View view){
        setContentView(R.layout.seven);
    }
    public void onClick7(View view){
        setContentView(R.layout.one);
    }
}
