package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int[] tenValues = new int[10];
        System.out.print("Please enter ten values: ");
        for(int i = 0; i < 10; i++) tenValues[i] = input.nextInt();
        System.out.println("Reverse Array is:");
        System.out.print("[ ");
        for(int i = 9; i >= 0; i--){
            System.out.print(tenValues[i] + " ");
        }
        System.out.print("]");
    }
}
