package com.example.a1110_rmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextActiv(View view){
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }
    public void tachActiv(View view){
        Intent intent = new Intent(this, TachActive.class);
        startActivity(intent);
    }
    public void cameraActiv(View view){
        Intent intent = new Intent(this,CameraActivity.class);
        startActivity(intent);
    }
    public void skechActiv(View view){
        Intent intent = new Intent(this,Sketchbook.class);
        startActivity(intent);
    }

}