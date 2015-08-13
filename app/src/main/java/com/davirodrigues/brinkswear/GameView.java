package com.davirodrigues.brinkswear;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class GameView extends View implements View.OnTouchListener{

    public Paint paint = new Paint();
    public int radius = 60;
    public int margins = 95;
    Context context;

    public GameView(Context context) {
        super(context);
        this.context = context;
        setBackgroundColor(Color.WHITE);
        setOnTouchListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        canvas.drawCircle(margins, margins, radius, paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(margins, canvas.getWidth()-margins, radius, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(canvas.getHeight()-margins, margins, radius, paint);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(canvas.getHeight() - margins, canvas.getWidth() - margins, radius, paint);
    }



    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(this.context, "click X: " + event.getX() + " Y: " + event.getY(), Toast.LENGTH_SHORT)
                    .show();
        }
        return false;
    }
}
