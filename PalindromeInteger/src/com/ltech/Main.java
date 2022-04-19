package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number that you want to test: ");
        int number = input.nextInt();
        boolean value = isPalindrome(number);
        if(value){
            System.out.printf("%d is a palindrome\n", number);
        }else{
            System.out.printf("%d is not a palindrome\n", number);
        }
    }

    public static int reverse(int number){
        int reversed = 0;
        while(number > 0){
            int value = number % 10;
            reversed = reversed * 10 + value;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
}
