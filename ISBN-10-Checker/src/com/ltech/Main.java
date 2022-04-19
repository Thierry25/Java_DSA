package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int value = input.nextInt();
        int isbn = value;
        int i = 9;
        int sum = 0;
        while(isbn > 0){
            sum += (isbn % 10) * i;
            isbn /= 10;
            i--;
        }
        int checkData = sum % 11;
        if(checkData == 10) {
            System.out.println("The ISBN-10 number is " + value + "X");
        }else{
            System.out.println("SKKRR  :" + checkData);
            System.out.println("The ISBN-10 number is " + value + checkData);
        }
        System.out.println(sum);

    }
}
