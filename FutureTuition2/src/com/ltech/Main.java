package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double price = 10_000;
        for(int i = 0; i < 10; i++){
            price *= 1.05;
        }
        System.out.printf("In 10 years, the tuition fees will be $%4.2f\n", price);
        double studiesPrice = 0;
        for(int i = 0; i < 4; i++) studiesPrice += price *= 1.05;
        System.out.printf("The tuition fees for four years of studies, is worth $%4.2f\n", studiesPrice);
    }
}
