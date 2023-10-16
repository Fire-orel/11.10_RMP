package com.example.a1110_rmp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Sketchbook extends AppCompatActivity {
    private Button btnPaint,btnClear,btnText;
    private PaintArea paintArea;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sketchbook);

        btnPaint=(Button)findViewById(R.id.btnPaint);
//        btnText=(Button)findViewById(R.id.btnText);
        btnClear=(Button)findViewById(R.id.btnClear);

        paintArea=(PaintArea) findViewById(R.id.paint);
        paintArea.setVisibility(View.INVISIBLE);

    }

    public void onBtnPaintClick(View view){
        paintArea.setVisibility(View.VISIBLE);

    }
    public void onBtnTextClick(View view){

    }
    public void onBtnClearClick(View view){
        paintArea.clearPaintArea();

    }
}