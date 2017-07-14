package com.example.earthgee.testdraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        canvas.drawArc(50,0,300,250,180,120,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(60,10,310,260,-60,60,true,paint);
        paint.setColor(Color.rgb(255,0,255));
        canvas.drawArc(60,10,310,260,2,8,true,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(60,10,310,260,12,8,true,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(60,10,310,260,22,38,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(60,10,310,260,62,118,true,paint);
    }
}









