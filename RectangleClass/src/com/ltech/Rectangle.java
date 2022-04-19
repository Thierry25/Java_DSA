package com.ltech;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
