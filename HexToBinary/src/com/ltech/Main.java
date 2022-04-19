package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String value = input.nextLine();
        if (value.length() > 1) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        char c = Character.toUpperCase(value.charAt(0));
        if (Character.isDigit(c)) {
            System.out.printf("The binary value is %s", Integer.toBinaryString(Integer.parseInt(value)));
        } else if (Character.isLetter(c)) {
            if (c >= 'A' && c <= 'F') {
                int digits = ((int) c) - 55;
                System.out.printf("The binary value is %s", Integer.toBinaryString(digits));
            } else {
                System.out.printf("%s is an invalid input", c);
            }
        } else {
            System.out.println("Boy go f yourself 🤣🤣🤣🤣🤣");
        }
        // System.out.println(Integer.toBinaryString(11));
    }
}
