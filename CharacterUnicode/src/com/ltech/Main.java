package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String value = input.nextLine();
        char character = value.charAt(0);
        System.out.printf("The Unicode for the character %s is %d", character, (int) character);
    }
}
