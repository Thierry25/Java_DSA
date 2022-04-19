package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
    }
}
