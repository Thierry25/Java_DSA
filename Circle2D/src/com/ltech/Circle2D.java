package com.ltech;

public class Circle2D {
    private final double x, y, radius;

    public Circle2D(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D(){
        this(0,0, 1);
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

}
