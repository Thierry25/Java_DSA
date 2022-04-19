package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a text, we will only display the characters at odd position🥳: ");
        String value = input.nextLine();
        StringBuilder oddString = new StringBuilder();
        for(int i = 0; i < value.length(); i++){
            if(i % 2 == 0) oddString.append(value.charAt(i));
        }
        System.out.println("Skrr");
        System.out.printf("The result is %s", oddString);
    }
}
