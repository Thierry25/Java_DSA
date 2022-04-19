package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of money that you save per month: ");
        int amount = input.nextInt();
        System.out.print("Please enter the annual interest rate: ");
        double interest = input.nextDouble();
        double totalInterest = ((interest / 100) / 12) + 1;
        System.out.print("Please enter the number of months: ");
        int months = input.nextInt();
        double sum = 0;
        for(int i = 0; i < months; i++){
            sum += amount * totalInterest;
            System.out.printf("The amount is %4.3f\n", sum);
        }
    }
}
