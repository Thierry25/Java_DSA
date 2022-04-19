package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle triangle = new Triangle(2, 3, 4, "purple", true);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle);
    }
}
