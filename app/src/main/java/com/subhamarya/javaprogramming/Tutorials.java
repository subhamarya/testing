package com.subhamarya.javaprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Tutorials extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tutorials);

        lv=(ListView)findViewById(R.id.lv);
        ArrayList<String>al=new ArrayList<>();
        al.add("Introduction");
        al.add("Features");
        al.add("Pros and Cons");
        al.add("Variables");
        al.add("Data Type");
        al.add("Operators & Expressions");
        al.add("Flow Control");
        al.add("Classes basics");
        al.add("Class Objects");
        al.add("Constructors");
        al.add("Method Overloading");
        al.add("Method Overriding");
        al.add("Static Keyword");
        al.add("Inheritance");
        al.add("Types of Inheritance");
        al.add("Final Keyword");
        al.add("Abstraction");
        al.add("Wrapper Class");
        al.add("Defining Interfaces");
        al.add("Extending Interfaces");
        al.add("Implementing Interfaces");
        al.add("Accessing Interface");
        al.add("Exceptions");
        al.add("Try Catch");
        al.add("Custom Exception");

        ArrayAdapter<String>adaptor=new ArrayAdapter<String>(Tutorials.this,R.layout.colours,R.id.text1,al);
        lv.setAdapter(adaptor);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in=new Intent(Tutorials.this,WebActivity.class);
                in.putExtra("pos",i);
                startActivity(in);

            }
        });
    }
}
