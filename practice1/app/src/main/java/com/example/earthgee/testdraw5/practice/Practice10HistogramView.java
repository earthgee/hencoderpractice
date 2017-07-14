package com.example.earthgee.testdraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //画线
        Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        Path path=new Path();
        path.moveTo(50,0);
        path.lineTo(50,200);
        path.rLineTo(400,0);
        canvas.drawPath(path,paint);

        //画长方形
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        Rect[] histograms=new Rect[7];
        int[] topArray={195,180,180,130,40,30,140};
        for(int i=0;i<7;i++){
            histograms[i]=new Rect(50+10*(i+1)+i*45,0,50+55*(i+1),200);
            histograms[i].top=topArray[i];
            canvas.drawRect(histograms[i],paint);
        }

        paint.setColor(Color.WHITE);
        //写字
        String[] strs=new String[]{"Froyo","CB","ICS","JB","KitKat","L","M"};
        for(int i=0;i<7;i++){
            canvas.drawText(strs[i],60+10*(i+1)+i*45,215,paint);
        }

    }
}
