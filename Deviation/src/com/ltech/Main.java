package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] values = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter ten numbers: ");
        for(int i = 0; i < 10; i++) values[i] = input.nextDouble();
        System.out.printf("The mean is %4.2f\n", getMean(values));
        System.out.printf("The standard deviation is: %4.4f", getStandardDeviation(values));

    }

    public static double getMean(double[] array){
        double sum = 0;
        for(double d : array) sum += d;
        return sum / array.length;
    }

    public static double getStandardDeviation(double[] array){
        double sum = 0;
        double mean = getMean(array);
        for(double d : array) sum += Math.pow((d - mean), 2);
        return Math.sqrt((sum / array.length -12));
    }
}
