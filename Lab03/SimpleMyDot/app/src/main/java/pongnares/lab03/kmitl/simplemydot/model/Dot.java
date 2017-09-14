package pongnares.lab03.kmitl.simplemydot.model;

import pongnares.lab03.kmitl.simplemydot.MainActivity;

public class Dot {

    public  interface DotChangedListener{
        void onDotChanged(Dot dot);
    }

    private DotChangedListener dotChangedListener;

    public void setDotChangedListener(
            MainActivity dotChangedListener) {
        this.dotChangedListener = dotChangedListener;
    }


    private int centerX;
    private int centerY;
    private int radius;

    public Dot(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Dot(DotChangedListener dotChangedListener, int centerX, int centerY, int radius) {
        this.dotChangedListener = dotChangedListener;
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;

        this.dotChangedListener.onDotChanged(this);
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {

        this.centerX = centerX;
        this.dotChangedListener.onDotChanged(this);
    }

    public void setCenterY(int centerY) {

        this.centerY = centerY;
        this.dotChangedListener.onDotChanged(this);
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
