package com.ltech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        boolean valid = true;
        do{
            try{
                System.out.print("Enter an integer: ");
                System.out.printf("The number entered is %d\n", input.nextInt());
                valid = false;
            }catch (InputMismatchException ex){
                System.out.println("Try again, an integer is required");
                input.nextLine();
            }
        }while(valid);
    }
}
