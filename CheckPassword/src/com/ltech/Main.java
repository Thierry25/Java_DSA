package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String password = input.nextLine();
        boolean isChecked = checkPassword(password);
        if(isChecked) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }

    public static boolean checkPassword(String password){
        int digitCount = 0;
        if(password.length() >= 8){
            for(int i = 0; i < password.length(); i++){
                char c = password.charAt(i);
                if(!Character.isLetter(c) && !Character.isDigit(c)) return false;
                if(Character.isDigit(c)) digitCount += 1;
            }
        }
        return digitCount >= 2;
    }
}
