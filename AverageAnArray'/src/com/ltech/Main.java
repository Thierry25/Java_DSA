package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static double average(int[] array){
        double sum = 0;
        for(int i : array) sum += i;
        return sum / array.length;
    }
    public static double average(double[] array){
        double sum = 0;
        for(double i : array) sum += i;
        return sum / array.length;
    }

}
