package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double taxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        double grossPay = hours * pay;
        System.out.println("");
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Hours Worked: %.1f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", pay);
        System.out.printf("Gross Pay: $%.2f\n",grossPay );
        System.out.println("Deductions: ");
        double federalWithHolding = grossPay * taxRate;
        double stateWithHolding = grossPay * stateTax;
        double totalDeduction = federalWithHolding + stateWithHolding;
        double netPay = grossPay - totalDeduction;
        System.out.printf("\t Federal Withholding (%2.1f%%): $%4.2f\n",taxRate * 100 ,federalWithHolding);
        System.out.printf("\t State Withholding (%1.1f%%): $%4.2f\n", stateTax * 100,stateWithHolding);
        System.out.printf("\t Total Deduction: $%1.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f", netPay);
    }
}
