package com.example.splash_qiuz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView icon;
    TextView Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon=findViewById(R.id.logo_id);
        Name=findViewById(R.id.name);
        Animation nameanimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.interplater);
        Name.startAnimation(animation);
        icon.startAnimation(nameanimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, quizz_activity.class);
                startActivity(intent);


            }
        },3500);
    }
}