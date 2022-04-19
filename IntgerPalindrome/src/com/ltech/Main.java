package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int enteredValue = input.nextInt();
        int lastDigit = enteredValue % 10;
        int firstDigit = enteredValue / 100;
        if(lastDigit == firstDigit){
            System.out.println(enteredValue + " is a palindrome");
        }else{
            System.out.println(enteredValue + " is not a palindrome");
        }
    }
}
