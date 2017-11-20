package com.subhamarya.javaprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Switch;

public class web2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        int i=getIntent().getIntExtra("pos",0);
        WebView web=(WebView)findViewById(R.id.wv);
        web.getSettings().setJavaScriptEnabled(true);
        switch (i)
        {
            case 0:
                web.loadUrl("file:///android_asset/helloworld.html");
                break;
            case 1:
                web.loadUrl("file:///android_asset/ifelse.html");
                break;
            case 2:
                web.loadUrl("file:///android_asset/while.html");
                break;
            case 3:
                web.loadUrl("file:///android_asset/dowhile.html");
                break;
            case 4:
                web.loadUrl("file:///android_asset/for.html");
                break;
            case 5:
                web.loadUrl("file:///android_asset/switch.html");
                break;
            case 6:
                web.loadUrl("file:///android_asset/continue.html");
                break;
            case 7:
                web.loadUrl("file:///android_asset/evenodd.html");
                break;
            case 8:
                web.loadUrl("file:///android_asset/prime.html");
                break;
            case 9:
                web.loadUrl("file:///android_asset/palindrome.html");
                break;
            case 10:
                web.loadUrl("file:///android_asset/findfactorial.html");
                break;
            case 11:
                web.loadUrl("file:///android_asset/factorialrecursion.html");
                break;
            case 12:
                web.loadUrl("file:///android_asset/bitwiseadd.html");
                break;
            case 13:
                web.loadUrl("file:///android_asset/gCD&LCM.html");
                break;
            case 14:
                web.loadUrl("file:///android_asset/leapyear.html");
                break;
            case 15:
                web.loadUrl("file:///android_asset/armstrong.html");
                break;
            case 16:
                web.loadUrl("file:///android_asset/swap2no.html");
                break;
            case 17:
                web.loadUrl("file:///android_asset/swapwithout3rdvar.html");
                break;
            case 18:
                web.loadUrl("file:///android_asset/floyd.html");
                break;
            case 19:
                web.loadUrl("file:///android_asset/pascal.html");
                break;
            case 20:
                web.loadUrl("file:///android_asset/constructor.html");
                break;
            case 21:
                web.loadUrl("file:///android_asset/palindromestring.html");
                break;
            case 22:
                web.loadUrl("file:///android_asset/darray.html");
                break;
            case 23:
                web.loadUrl("file:///android_asset/interface.html");
                break;
            case 24:
                web.loadUrl("file:///android_asset/linearsearch.html");
                break;
            case 25:
                web.loadUrl("file:///android_asset/binarysearch.html");
                break;
            case 26:
                web.loadUrl("file:///android_asset/bubblesort.html");
                break;
            case 27:
                web.loadUrl("file:///android_asset/selectionsort.html");
                break;
            case 28:
                web.loadUrl("file:///android_asset/insertionsort.html");
                break;
            case 29:
                web.loadUrl("file:///android_asset/quicksort.html");
                break;
            case 30:
                web.loadUrl("file:///android_asset/mergesort.html");
                break;
            case 31:
                web.loadUrl("file:///android_asset/multiplecatch.html");
                break;
            case 32:
                web.loadUrl("file:///android_asset/createfile.html");
                break;
            case 33:
                web.loadUrl("file:///android_asset/createdirectoty.html");
                break;
            case 34:
                web.loadUrl("file:///android_asset/deletedirectory.html");
                break;

            default:
        }

    }
}
