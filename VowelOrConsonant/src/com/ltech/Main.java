package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String value = input.nextLine();
        if(value.length() > 1){
            System.out.println("Invalid input");
            System.exit(1);
        }
        char c = Character.toLowerCase(value.charAt(0));
        if(Character.isLetter(c)){
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.printf("%s is a vowel", c);
                default -> System.out.printf("%s is a consonant", c);
            }
        }else{
            System.out.printf("%s is an invalid input", c);
        }
    }
}
