package com.example.oneproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class OneProjectActivity extends AppCompatActivity {
    private static final String TAG = "OneProjectActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_project_layout);
        Log.d("data","onCreate execute");


    }


}
