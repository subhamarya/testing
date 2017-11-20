package com.subhamarya.javaprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Programs extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        lv=(ListView)findViewById(R.id.lv);
        ArrayList<String>al=new ArrayList<>();
        al.add("Hello World");
        al.add("If Else Example");
        al.add("While Loop Example");
        al.add("Do While Loop Example");
        al.add("For Loop Example");
        al.add("Switch Case Example");
        al.add("Continue Example");
        al.add("Even or Odd");
        al.add("Prime Number");
        al.add("Palindrome Number");
        al.add("Find Factorial");
        al.add("Factorial using recursion");
        al.add("Bitwise Addition");
        al.add("GCD and LCM");
        al.add("Leap Year");
        al.add("Armstrong Number");
        al.add("Swapping two number");
        al.add("Swapping without third variable");
        al.add("Floyd Triangle");
        al.add("Pascal Triangle");
        al.add("Constructor Example");
        al.add("Palindrome String");
        al.add("2D Array Example");
        al.add("Interface Example");
        al.add("linear Search");
        al.add("Binary Search");
        al.add("Bubble Sort");
        al.add("Selection Sort");
        al.add("Insertion Sort");
        al.add("Quick Sort");
        al.add("Merge Sort");
        al.add("Multiple Catch");
        al.add("Create File");
        al.add("Create Directory");
        al.add("Delete Directory");
        ArrayAdapter<String> adaptor=new ArrayAdapter<String>(Programs.this,R.layout.colours,R.id.text1,al);
        lv.setAdapter(adaptor);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in=new Intent(Programs.this,web2.class);
                in.putExtra("pos",i);
                startActivity(in);

            }
        });
    }
}
