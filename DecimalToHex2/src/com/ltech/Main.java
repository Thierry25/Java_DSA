package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the decimal number that you want to convert ");
        int decimal = input.nextInt();
        if(decimal >= 0 && decimal <= 9){
            System.out.printf("The hexadecimal representation of %d is %d", decimal, decimal);
            System.exit(1);
        }
        String hexadecimal = "";
        while(decimal != 0){
            int value = decimal % 16;
            hexadecimal = (value >= 10 && value < 16) ? getCharacter((value)) + hexadecimal :
                    value + hexadecimal;
            decimal /= 16;
        }
        System.out.println(hexadecimal);
    }

    public static char getCharacter(int value){
        return switch (value) {
            case 10 -> 'A';
            case 11 -> 'B';
            case 12 -> 'C';
            case 13 -> 'D';
            case 14 -> 'E';
            case 15 -> 'F';
            default -> '0';
        };
    }

}
