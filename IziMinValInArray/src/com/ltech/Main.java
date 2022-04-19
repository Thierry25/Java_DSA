package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 10 numbers: ");
        double[] values = new double[10];
        for (int i = 0; i < 10; i++) values[i] = input.nextDouble();
        System.out.printf("The minimum number is %4.1f", min(values));
    }

    public static double min(double[] array) {
        double min = Integer.MAX_VALUE;
        for (double d : array) min = Math.min(min, d);
        return min;
    }
}
