package com.ltech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int result = number1 + number2;
        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d? ", number1, number2);
        int enteredData = input.nextInt();
        ArrayList<Integer> wrongAnswers = new ArrayList<>();

        while(enteredData != result){
            if(wrongAnswers.contains(enteredData)){
                System.out.printf("Brruhh, you already entered %d\n", enteredData);
            }else wrongAnswers.add(enteredData);
            System.out.println("Wrong answer. Try again.");
            System.out.printf("What is %d + %d? ", number1, number2);
            enteredData = input.nextInt();
        }
        System.out.println("You got it! Finally");
    }


}
