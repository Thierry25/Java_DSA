package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();
        //System.out.printf("Psst... the number I'm thinking is %d\n", number);
        while(guess != number){
            if(guess < number){
                System.out.println("Your guess is too low");
            }else{
                System.out.println("Your gess is too high");
            }
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
        }
        System.out.printf("Yes, the number is %d", number);
    }
}
