package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        if(value >= 0 && value <= 15){
            if(value < 10){
                System.out.printf("The hex value is %d", value);
            }else{
                System.out.printf("The hex value is %s", (char) (value+=55));

            }
        }else{
            System.out.println("You such a dumb ass🤣");
        }
    }
}
