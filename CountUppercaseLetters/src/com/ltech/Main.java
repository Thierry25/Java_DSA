package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("My sista, enter a String for us: ");
        String value = input.nextLine();
        int uppercaseLetters = 0;
        for (int i = 0; i < value.length(); i++){
            if(Character.isUpperCase(value.charAt(i))) uppercaseLetters += 1;
        }
        System.out.printf("In the string \"%s\", there are %d uppercase letters.\n", value, uppercaseLetters);
    }
}
