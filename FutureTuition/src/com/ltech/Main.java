package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int universityTuition = 10_000;
        int yCount = 0;
        int amountDoubled = universityTuition * 2;
        while(universityTuition < amountDoubled){
            universityTuition *= 1.07;
            yCount += 1;
        }
        System.out.println(yCount);
    }
}
