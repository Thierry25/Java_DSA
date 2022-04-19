package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // DISCLAIMER: ENTERED VALUES NOT VERIFIED
        Scanner input = new Scanner(System.in);
        int dayOfTheWeek;
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfTheMonth = input.nextInt();
        if(month == 1){
            year -= 1;
            month = 13;
        }else if(month == 2){
            year -= 1;
            month = 14;
        }

        int century = year % 100;
        int j = year / 100;

        dayOfTheWeek = ((dayOfTheMonth + ((26*(month + 1)) / 10) + century + (century / 4) + (j / 4) + (5 * j)) % 7);
        System.out.println(dayOfTheWeek);
        switch (dayOfTheWeek) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }
    }
}
