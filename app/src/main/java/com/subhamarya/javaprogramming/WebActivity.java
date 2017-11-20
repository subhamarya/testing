package com.subhamarya.javaprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Switch;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        int i=getIntent().getIntExtra("pos",0);
        WebView web=(WebView)findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        switch (i)
        {
            case 0:
                web.loadUrl("file:///android_asset/intro.html");
                break;
            case 1:
                web.loadUrl("file:///android_asset/featues.html");
                break;
            case 2:
                web.loadUrl("file:///android_asset/proscons.html");
                break;
            case 3:
                web.loadUrl("file:///android_asset/variables.html");
                break;
            case 4:
                web.loadUrl("file:///android_asset/datatype.html");
                break;
            case 5:
                web.loadUrl("file:///android_asset/operators.html");
                break;
            case 6:
                web.loadUrl("file:///android_asset/flowcontrol.html");
                break;
            case 7:
                web.loadUrl("file:///android_asset/classbasic.html");
                break;
            case 8:
                web.loadUrl("file:///android_asset/object.html");
                break;
            case 9:
                web.loadUrl("file:///android_asset/constructor1.html");
                break;
            case 10:
                web.loadUrl("file:///android_asset/overloading.html");
                break;
            case 11:
                web.loadUrl("file:///android_asset/overriding.html");
                break;
            case 12:
                web.loadUrl("file:///android_asset/static.html");
                break;
            case 13:
                web.loadUrl("file:///android_asset/inheritance.html");
                break;
            case 14:
                web.loadUrl("file:///android_asset/typesinher.html");
                break;
            case 15:
                web.loadUrl("file:///android_asset/final.html");
                break;
            case 16:
                web.loadUrl("file:///android_asset/abstraction.html");
                break;
            case 17:
                web.loadUrl("file:///android_asset/wrapperclass.html");
                break;
            case 18:
                web.loadUrl("file:///android_asset/definterface.html");
                break;
            case 19:
                web.loadUrl("file:///android_asset/extendinginter.html");
                break;
            case 20:
                web.loadUrl("file:///android_asset/implementinginter.html");
                break;
            case 21:
                web.loadUrl("file:///android_asset/accessinginter.html");
                break;
            case 22:
                web.loadUrl("file:///android_asset/exceptions.html");
                break;
            case 23:
                web.loadUrl("file:///android_asset/trycatch.html");
                break;
            case 24:
                web.loadUrl("file:///android_asset/customexception.html");
                break;

            default:

        }
    }
}
