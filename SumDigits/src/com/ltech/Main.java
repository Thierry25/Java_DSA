package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: (e.g.: 234, 432): ");
        long value = input.nextInt();
        System.out.printf("The sum of the digits of %d is %d", value, sumDigits(value));
    }

    public static int sumDigits(long n){
        int total = 0;
        while(n > 0){
            total += n % 10;
            n /= 10;
        }
        return total;
    }
}
