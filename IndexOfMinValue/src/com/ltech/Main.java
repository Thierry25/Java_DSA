package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int index = 0;
        double min = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 10 values: ");
        double[] values = new double[10];
        for (int i = 0; i < 10; i++) {
            values[i] = input.nextInt();
            if (values[i] < min) {
                min = values[i];
                index = i;
            }
        }
        System.out.printf("The Minimum of the values entered was %4.1f and the index was %d", min, index + 1);
    }
}
