package com.subhamarya.javaprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About_Us extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__us);
        tv=(TextView)findViewById(R.id.tv);
        tv.setText("This app enables you to carry basic Tutorial of Java in your android device."+"\nIt contains Basic Programs,Most important theory Questions and MCQ's"+"\nAll THE BEST "+"\n\n\n Developer : Subham Arya ");
    }
}
