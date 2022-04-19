package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displaySortedNumbers(5.0, 4.0, 1.0);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 < num2){
            if(num1 < num3){
                System.out.println(num1);
            }else if(num2 < num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        }else if(num2 < num3){
            System.out.println(num2);
            if(num1 < num3){
                System.out.println(num1);
                System.out.println(num3);
            }
        }
    }
}
