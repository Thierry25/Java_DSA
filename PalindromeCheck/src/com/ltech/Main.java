package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s  = "m!!@__)()0om";
        System.out.println(isPalindrome(s));
    }

    public static String filter(String s){
       StringBuilder stringBuilder = new StringBuilder("");
       for(int i = 0; i < s.length(); i++){
           char letter = s.charAt(i);
           if(Character.isLetterOrDigit(letter)) stringBuilder.append(letter);
       }
       return stringBuilder.toString();
    }

    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s){
        String checked = filter(s);
        return checked.equals(reverse(checked));
    }

}
