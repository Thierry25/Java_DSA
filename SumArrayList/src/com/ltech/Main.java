package com.ltech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Double> doubles = new ArrayList<>();
        System.out.println("Please enter five numbers");
        for(int i = 0; i < 5; i++) doubles.add(input.nextDouble());
        System.out.printf("The sum of the values entered is %4.2f\n" ,sum(doubles));
    }

    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for(double d: list){
            sum += d;
        }
        return sum;
    }
}
