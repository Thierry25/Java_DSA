package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyStringBuilder myStringBuilder = new MyStringBuilder("HELLO");
        MyStringBuilder myStringBuilder2 = new MyStringBuilder("WORLD");
        System.out.println(myStringBuilder.append(myStringBuilder2).getChars());
        System.out.println(myStringBuilder.append(2022).getChars());
        System.out.println(myStringBuilder.charAt(7));
        System.out.println(myStringBuilder.toLowerCase().getChars());
        System.out.println(myStringBuilder.substring(5, 13).getChars());
        System.out.println(myStringBuilder.toString());
    }
}
