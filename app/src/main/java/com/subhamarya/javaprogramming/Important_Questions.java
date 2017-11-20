package com.subhamarya.javaprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Important_Questions extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important__questions);
        lv=(ListView)findViewById(R.id.lv);
        ArrayList<String> al=new ArrayList<>();
        al.add("Q1.List any five features of Java?");
        al.add("Q2.Why is Java Architecture neutral?");
        al.add("Q3.Why Java is considered dynamic?");
        al.add("Q4.Define class?");
        al.add("Q5.What if I write static public void instead of public static void?");
        al.add("Q6.What kind of variables a class consist of?");
        al.add("Q7.What is default value of local variables?");
        al.add("Q8.What is Singleton Class?");
        al.add("Q9.What is Constructor?");
        al.add("Q10.What is purpose of default constructor?");
        al.add("Q11.Does constructor return any value?");
        al.add("Q12.Is constructor Inherited?");
        al.add("Q13.Can you make a constructor final?");
        al.add("Q14.What is static variable?");
        al.add("Q15.What is static block?");
        al.add("Q17.Can we execute a program without main() method?");
        al.add("Q18.What is default value of byte datatype in Java?");
        al.add("Q19.When a byte datatype is used?");
        al.add("Q20.When parseInt() method can be used?");
        al.add("Q21.What is difference  between StringBuffer and StringBuilder class?");
        al.add("Q21.java.util.regex consists of which class?");
        al.add("Q22.Which class is the superclass for every class?");
        al.add("Q23.What is composition?");
        al.add("Q24.Why Java does not support pointers?");
        al.add("Q25.What is super in Java?");
        al.add("Q26.Can we overload main() method in Java?");
        al.add("Q27.Which are the two subclass under Exception class?");
        al.add("Q28.When throws keyword is used?");
        al.add("Q29.How finally used under Exception Handling?");
        al.add("Q30.What is Abstraction?");
        al.add("Q31.What is Abstract class?");
        al.add("Q32.What is Interface?");
        al.add("Q33.Define Packages in Java?");
        al.add("Q34.What are the two ways in which thread can be created?");
        al.add("Q35.Can we override static method?");
        al.add("Q36.Can we override overloaded method?");
        al.add("Q37.What is final variable?");
        al.add("Q38.What is blank final variable?");
        al.add("Q39.Can we initialize blank final variable?");
        al.add("Q40.Can you declare main method as final?");
        al.add("Q41.What is an Applet?");
        al.add("Q42.An applet extend which class?");
        al.add("Q43.Explain garbage collection in Java?");
        ArrayAdapter<String> adaptor=new ArrayAdapter<String>(Important_Questions.this,R.layout.colours,R.id.text1,al);
        lv.setAdapter(adaptor);
    }
}
