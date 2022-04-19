package com.ltech;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        boolean isValid = true;
        int total = 0;
        do{
            try{
                System.out.print("Please enter two integers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                total += num1 + num2;
                isValid = false;
            }catch (InputMismatchException ex){
                System.out.println("The value entered is not an integer");
                input.nextLine();
            }

        }while(isValid);

        System.out.printf("The total of the values entered is %d\n", total);
    }
}
