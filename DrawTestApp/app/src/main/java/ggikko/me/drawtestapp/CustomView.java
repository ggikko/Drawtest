package ggikko.me.drawtestapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by admin on 16. 7. 6..
 */
public class CustomView extends View {

    private final int paintColor = Color.BLACK;
    private Paint drawPaint;

    public CustomView(Context context) {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setupPaint();
    }

    public CustomView(Context context, Paint drawPaint) {
        super(context);
        this.drawPaint = drawPaint;
    }

    public CustomView(Context context, AttributeSet attrs, Paint drawPaint) {
        super(context, attrs);
        this.drawPaint = drawPaint;
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, Paint drawPaint) {
        super(context, attrs, defStyleAttr);
        this.drawPaint = drawPaint;
    }


    private void setupPaint() {
        drawPaint = new Paint();
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(3);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(50, 50, 20, drawPaint);
        drawPaint.setColor(Color.GREEN);
        canvas.drawCircle(50, 150, 20, drawPaint);
        drawPaint.setColor(Color.BLUE);
        canvas.drawCircle(50, 250, 20, drawPaint);
    }
}
