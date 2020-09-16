package com.map.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Result extends AppCompatActivity {

    MediaPlayer mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mp2=MediaPlayer.create(this,R.raw.onmyowndavidrenda);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp2.stop();
    }
}
