package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the code from 0-127: ");
        int code = input.nextInt();
        if(code > 0 && code <127){
            char ASCII = (char) code;
            System.out.printf("The character for ASCII code %d is %s",code, ASCII);
        }else{
            System.out.println("Not possible");
        }
    }
}
