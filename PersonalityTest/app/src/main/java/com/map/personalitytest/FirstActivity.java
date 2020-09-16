package com.map.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    TextView inst,ques_tv;
    Button in1,in2,n,ac2,ac1,res;
    String[] q_array={"I try not to draw attention to myself","I feel uncomfortable when I disagree with someone","I lose my belongings","I have a vivid imagination","I would enjoy attending a large party in my honor","I dislike being in competition with others","I prefer to follow a schedule","I question the wisdom of my elders","I enjoy being the center of attention","I try to avoid conflict","I make sure my work is finished on time","It is important to me to follow traditions","I make an effort to be popular","I sympathize with the homeless","I have trouble controlling my impulses","I think about why people do the things they do","Being around lots of people energizes me","I am helpful to the people around me","I am ambitious","I like to do things as they were done in the past","I avoid being alone","I forgive easily","I like trying out new hobbies","I like to stay active","It is best to be totally objective when making a decision","I keep my belongings in their proper place","I have a rich fantasy life","I have little to say","I enjoy being there for people when they are feeling sad","I would rather go with the flow than have a set schedule","I enjoy philosophical discussions","I let other people know what I think","I avoid arguing, even when I disagree","I am very attentive to deadlines","I would like to play a musical instrument","I have a lot of fun","I resist temptations","It is easy for me to talk to strangers","I am concerned for the welfare of elderly people","I am determined to achieve success in life","I believe in the importance of art","I like to spend my free time alone","I believe people should be punished for their mistakes","I enjoy having a daily routine","I spend time seeking out new experiences","I am on the go","I wish other people would be more logical","I like to tidy up","I enjoy imagining the future","I find it difficult to express my opinions","I like to help others with their personal problems","I finish assignments before they are due","I like thinking about the mysteries of the universe","I have a lot of energy","I can't stand when someone doesn't like me","I follow my impulses","I enjoy trying to understand complicated ideas","I feel very happy","I spend time trying to understand myself","I get a thrill out of meeting new people","I need support from other people","I am not bothered by disorder","I enjoy going to museums"};
    int length=q_array.length;
    int i=1;
    MediaPlayer mp1;

    @Override
    protected void onStart() {
        super.onStart();
        mp1=MediaPlayer.create(this,R.raw.peaceandhappydavidfesliyan);
        mp1.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        inst=findViewById(R.id.textView5);
        ques_tv=findViewById(R.id.textView6);
        in1=findViewById(R.id.button2);
        in2=findViewById(R.id.button3);
        n=findViewById(R.id.button4);
        ac2=findViewById(R.id.button5);
        ac1=findViewById(R.id.button6);
        res=findViewById(R.id.button8);
        in1.setOnClickListener(this);
        in2.setOnClickListener(this);
        n.setOnClickListener(this);
        ac2.setOnClickListener(this);
        ac1.setOnClickListener(this);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(),Result.class);
                startActivity(intent1);
            }
        });
        res.setEnabled(false);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
                ques_tv.setText(q_array[i++]);
                if(i==length){
                    in1.setEnabled(false);
                    in2.setEnabled(false);
                    n.setEnabled(false);
                    ac1.setEnabled(false);
                    ac2.setEnabled(false);
                    ques_tv.setText("Test completed !");
                    res.setEnabled(true);

                }

        }


    }

    @Override
    protected void onPause() {
        super.onPause();
        mp1.stop();
    }
}
