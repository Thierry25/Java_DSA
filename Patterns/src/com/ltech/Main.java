package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Pattern A");
        for(int i = 1; i < 7; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("%d\t", j);
            }
            System.out.println();
        }

        System.out.println("Pattern B");
        for(int i = 1; i < 8; i++){
            for(int j = 1; j < 8 - i; j++){
                System.out.printf("%d\t", j);
            }
            System.out.println();
        }
    }
}
