package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int todayDate = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        if(todayDate < 0 || todayDate > 6){
            System.out.println("Invalid Data");
        }else{
            int newDate = (todayDate + elapsed) % 7;
            System.out.println(newDate);
            // Ah res la izi
        }

    }
}
