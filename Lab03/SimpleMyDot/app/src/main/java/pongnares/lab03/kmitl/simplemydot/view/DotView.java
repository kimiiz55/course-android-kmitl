package pongnares.lab03.kmitl.simplemydot.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


import pongnares.lab03.kmitl.simplemydot.model.Dot;

import static android.graphics.Color.*;

public class DotView extends View {

    private Paint paint;
    private Canvas[] canvas;

    public DotView(Context context) {
        super(context);
        paint = new Paint();
    }

    public DotView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();
    }

    public DotView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    private Dot dot;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(dot != null) {
            paint.setColor(BLUE);
            canvas.drawCircle(
                    dot.getCenterX(),
                    dot.getCenterY(),
                    dot.getRadius(),
                    paint);
        }
        invalidate();
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }

}
