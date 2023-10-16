package com.example.a1110_rmp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PaintArea  extends View implements View.OnTouchListener {
    Paint paint=new Paint();
    ArrayList<Point> pointArrayList=new ArrayList<>();
    public PaintArea(Context context, @Nullable AttributeSet attrs) {
        super(context,attrs);

        this.setOnTouchListener(this);

        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(0.5f);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Point dot=new Point();
        dot.x=event.getX();
        dot.y=event.getY();
        pointArrayList.add(dot);
        invalidate();
        return true;
    }
    public void onDraw(Canvas canvas){
        for (Point point:pointArrayList){
            canvas.drawCircle(point.x,point.y,10,paint);
        }
    }
    private class Point{
        float x,y;
    }
    public void clearPaintArea(){
        pointArrayList.clear();
        invalidate();
    }
}
