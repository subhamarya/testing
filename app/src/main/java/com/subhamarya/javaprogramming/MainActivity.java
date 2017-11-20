package com.subhamarya.javaprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView tutorial,program,important,quiz,settings,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tutorial=(ImageView)findViewById(R.id.tutorial);
        program=(ImageView)findViewById(R.id.programming);
        important=(ImageView)findViewById(R.id.important);
        quiz=(ImageView)findViewById(R.id.quiz);
        about=(ImageView)findViewById(R.id.about);
        settings=(ImageView)findViewById(R.id.settings);
        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Tutorials.class);
                startActivity(i);

            }
        });
        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Programs.class);
                startActivity(i);


            }
        });
        important.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Important_Questions.class);
                startActivity(i);


            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Quiz.class);
                startActivity(i);


            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,About_Us.class);
                startActivity(i);


            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Not available right now.", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
