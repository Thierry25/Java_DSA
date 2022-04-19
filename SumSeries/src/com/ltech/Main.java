package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("i\t\t\tm(i)");
        sum(20);
    }

    public static void sum(int number){
        double sum = 0;
        for(double i = 1; i <= number; i++){
            sum += i/ (i + 1);
            System.out.printf("%1.0f\t\t\t%4.4f\n", i, sum);
        }
    }
}
