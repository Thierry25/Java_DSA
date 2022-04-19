package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the hexadecimal that you want to convert: ");
        try{
            String hex = input.nextLine();
            System.out.println(hexToDec(hex));
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static int hexToDec(String hex){
        int decimal = 0;
        for(int i = 0; i < hex.length(); i++){
            decimal = decimal * 16 + convertHexToDec(hex.charAt(i));
        }
        return decimal;
    }

    public static int convertHexToDec(char c){
        return switch (Character.toUpperCase(c)){
            case 'A' -> 10;
            case 'B' -> 11;
            case 'C' -> 12;
            case 'D' -> 13;
            case 'E' -> 14;
            case 'F' -> 15;
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> c - '0';
            default -> throw new NumberFormatException("Not a hex number " + c);
        };
    }
}
