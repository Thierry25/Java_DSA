package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Kilograms\tPounds");
        for(int i = 0; i < 200; i++){
            System.out.printf("%d\t\t\t%4.1f\n", i, i*2.2);
        }
    }
}
