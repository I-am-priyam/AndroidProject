package com.map.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent intent;
                    intent=new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e){}
            }
        }.start();
    }
}
