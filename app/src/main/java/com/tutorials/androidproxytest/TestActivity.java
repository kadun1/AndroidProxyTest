package com.tutorials.androidproxytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent intent = getIntent();
        String test = intent.getStringExtra("test");
        int value = intent.getIntExtra("value", 0);
        Toast.makeText(this, test+"/"+value, Toast.LENGTH_LONG).show();
    }
}