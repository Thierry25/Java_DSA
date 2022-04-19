package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        System.out.println(isConsecutiveFour(values));
    }

    public static boolean isConsecutiveFour(int[] values) {
        int i = 0;
        int count = 0;
        for (int j = 1; j < values.length; j++) {
            if (count == 3) break;
            if (values[i] != values[j]) {
                i = j;
                count = 0;
            } else count += 1;
        }
        return count == 3;
    }
}
