package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getRandomCharacter('A', 'Z'));

    }

    public static char getRandomCharacter(char ch1, char ch2){
        return (char) (ch1 + (Math.random() * (ch2 - ch1 + 1)));
    }
}
