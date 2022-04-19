package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String value = input.nextLine();
        System.out.printf("%s has %d letters in it", value, countLetters(value));
    }

    public static int countLetters(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)) count += 1;
        }
        return count;
    }
}
