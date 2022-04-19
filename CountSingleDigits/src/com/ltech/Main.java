package com.ltech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] values = new char[100];
        for(int i = 0; i < 100; i++) values[i] = RandomCharacter.getRandomSingleDigits();
        System.out.println("The random single digits values are ");
        printRandomSingleDigits(values);
        System.out.println();
        System.out.println(Arrays.toString(countValues(values)));
    }
    public static int[] countValues(char[] arr){
        int[] values = new int[10];
        for(char c: arr) values[c - '0']++;
        return values;
    }

    public static void printRandomSingleDigits(char[] data){
        for(int i = 0; i < data.length; i++){
            if((i + 1 ) % 10 == 0) System.out.printf("%c\t\n", data[i]);
            else System.out.printf("%c\t", data[i]);
        }
    }
}
