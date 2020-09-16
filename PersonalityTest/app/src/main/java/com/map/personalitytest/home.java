package com.map.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home extends AppCompatActivity implements View.OnClickListener {
    Button start,abt,source,teamin;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        start=findViewById(R.id.startid);
        start.setOnClickListener(this);
        abt=findViewById(R.id.aboutid2);
        abt.setOnClickListener(this);
        source=findViewById(R.id.credit2);
        source.setOnClickListener(this);
        teamin=findViewById(R.id.team);
        teamin.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mp=MediaPlayer.create(this,R.raw.thequietmorningdavidfesliyan);
        mp.start();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.aboutid2:
                Intent intent1=new Intent(this,PersonalityMenu.class);
                startActivity(intent1);
                break;
            case R.id.startid:
                Intent intent2=new Intent(this,FirstActivity.class);
                Toast.makeText(this, "Let's begin !", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
                break;
            case R.id.credit2:
                Intent intent3=new Intent(this,PersonalityMenu.class);
                startActivity(intent3);
                break;
            case R.id.team:
                Intent intent4=new Intent(this,TeamInfo.class);
                startActivity(intent4);
                break;

        }


    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.stop();
    }
}
