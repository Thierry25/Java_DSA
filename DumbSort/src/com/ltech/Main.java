package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int lastNumber = input.nextInt();

        int container = Integer.MAX_VALUE;
        int value = firstNumber < secondNumber ? firstNumber : (secondNumber < lastNumber ? secondNumber : lastNumber);
        System.out.println(value);
    }
}
