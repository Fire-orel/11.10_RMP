package com.example.a1110_rmp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.Toast;


public class TachActive extends AppCompatActivity
    implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tach_active);

        gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }
    public boolean onTouchEvent(MotionEvent event){
        if (this.gestureDetector.onTouchEvent(event)){
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(@NonNull MotionEvent e) {
        Toast toast1=Toast.makeText(TachActive.this, "Двойное нажатие",Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.TOP,0,10);
        toast1.show();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
        Toast toast3=Toast.makeText(TachActive.this,"Отпущенное одиночное нажатие",Toast.LENGTH_LONG);
        toast3.setGravity(Gravity.TOP,0,10);
        toast3.show();
        return true;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
//        Toast toast4=Toast.makeText(TachActive.this,"Скролинг",Toast.LENGTH_LONG);
//        toast4.setGravity(Gravity.TOP,0,10);
//        toast4.show();
        return false;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {
        Toast toast2=Toast.makeText(TachActive.this,"Долгое нажание",Toast.LENGTH_LONG);
        toast2.setGravity(Gravity.TOP,0,10);
        toast2.show();


    }

    @Override
    public boolean onFling(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
        Toast toast5=Toast.makeText(TachActive.this,"Свайп",Toast.LENGTH_LONG);
        toast5.setGravity(Gravity.TOP,0,10);
        toast5.show();
        return true;
    }
}