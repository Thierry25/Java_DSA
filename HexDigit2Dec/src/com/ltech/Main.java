package com.ltech;

import java.util.Scanner;

// Convert a Hex character to it's decimal value
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an hexadecimal character: ");
        String enteredValue = input.nextLine();
        if(enteredValue.trim().length() != 1){
            System.out.println("You must enter a single character, you dumb ass");
            System.exit(1);
        }
        char c = enteredValue.toUpperCase().charAt(0);
        if('A' <= c && c <= 'F'){
            int digit = c - 'A' + 10;
            System.out.println("The digit value is " + digit);
        }else if(Character.isDigit(c)){
            System.out.println("The value is " + c);
        }else{
            System.out.println("Invalid input you dumb fuck😂");
        }
    }
}
