package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the word that you want to try out: ");
        String word = input.nextLine();
        System.out.printf(checkPalindrome(word) ? "%s is a palindrome": "%s is not a palindrome", word);
    }

   private static boolean checkPalindrome(String value){
        int low = 0;
        int high = value.length() - 1;
        while(low < high){
            if(value.charAt(low) != value.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
   }


}
