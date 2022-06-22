package com.tutorials.androidproxytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.tutorials.androidproxytest.proxy.Multiplier;
import com.tutorials.androidproxytest.proxy.Multiplier2x;
import com.tutorials.androidproxytest.proxy.MyClassLoader;
import com.tutorials.androidproxytest.proxy.MyProxyHandler;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "TEST";
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTest = findViewById(R.id.btnTest);

        MyClassLoader myClassLoader = new MyClassLoader();
        int result = 0;
        try {
            result = myClassLoader.testClassLoad();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        Multiplier multiplier = new Multiplier2x();
//        Multiplier multiplierProxy = (Multiplier) Proxy.newProxyInstance(getClassLoader(), new Class[]{Multiplier.class}, new MyProxyHandler(multiplier));
//        int result = multiplierProxy.multiply(3);

        Intent intent = new Intent(this, TestActivity.class);
        intent.putExtra("test", "test");
        intent.putExtra("value", result);

        Log.e(TAG,"result = "+result);

        btnTest.setOnClickListener(view -> {
            startActivity(intent);
        });
    }
}