package com.subhamarya.javaprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        WebView web=(WebView)findViewById(R.id.a);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/quiz.html");
    }
}
