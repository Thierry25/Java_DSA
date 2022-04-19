package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String enteredString = input.nextLine();
        System.out.print("Please enter the char that you would like to test: ");
        char c = input.nextLine().charAt(0);
        System.out.printf("In the string '%s', there are %d '%c'", enteredString, count(enteredString, c), c);
    }

    public static int count(String str, char a){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == a) count += 1;
        }
        return count;
    }
}
