package com.ltech;

import java.util.Scanner;

// TO be done tomorrow March 9th 2022
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a, b ,c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = (b * b) - 4 * a * c;
        if(delta > 0){
            double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }else if(delta == 0){
            double root = -b / (2 * a);
            System.out.println("The equation has one root " + root);
        }else{
            System.out.println("The equation has no real roots");
        }
    }
}
