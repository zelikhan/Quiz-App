package com.example.splash_qiuz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quizz_activity extends AppCompatActivity {
    Button Simple,Tough,Rate,Other_app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        Simple=findViewById(R.id.Simple_q);
        Tough=findViewById(R.id.Tough_q);
        Other_app=findViewById(R.id.See_others);
        Rate=findViewById(R.id.Rate_app);

        Simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(quizz_activity.this,simple_questions.class);
                startActivity(intent);
            }
        });

        Tough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Other_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/khushi8686?tab=repositories";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}