package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = input.nextInt();
        double[] numberArray = createArray(size);
        double sum = getSum(numberArray);
        double average = sum / size;
        int greaterThanAverageCount = getValues(average, numberArray);
        System.out.printf("There are %d values greater than the average which was %4.2f, and the sum was %4.2f", greaterThanAverageCount, average, sum);
    }

    public static double[] createArray(int size) {
        double[] arr = new double[size];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter next value");
            arr[i] = input.nextDouble();
        }
        return arr;
    }

    public static double getSum(double[] array) {
        int sum = 0;
        for (double d : array) sum += d;
        return sum;
    }

    public static int getValues(double average, double[] array) {
        int count = 0;
        for (double d : array) {
            if (d > average) count += 1;
        }
        return count;
    }
}
