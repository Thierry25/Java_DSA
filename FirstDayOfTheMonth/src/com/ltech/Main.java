package com.ltech;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//	// write your code here
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the year: ");
//        int year = input.nextInt();
//        System.out.print("Please enter the day (0, 1, ..6): ");
//        int day = input.nextInt();
//        System.out.printf("%s 1 , %d is %s\n", getCorrespondingMonth(0), year, getCorrespondingDay(day));
//        for(int i = 1; i < 12; i++){
//            day = (getCorrespondingMonthCount(i) + day) % 7;
//            System.out.printf("%s 1 , %d is %s\n", getCorrespondingMonth(i), year, getCorrespondingDay(day));
//        }
//    }
//
//    public static int getCorrespondingMonthCount(int value){
//        return switch (value) {
//            case 0, 2, 4, 6, 7, 9, 11 -> 31;
//            case 1 -> 28;
//            case 3, 5, 8, 10 -> 30;
//            default -> -1;
//        };
//    }
//
//    public static String getCorrespondingMonth(int value){
//        return switch (value) {
//            case 0  -> "January";
//            case 1  -> "February";
//            case 2  -> "March";
//            case 3  -> "April";
//            case 4  -> "May";
//            case 5  -> "June";
//            case 6  -> "July";
//            case 7  -> "August";
//            case 8  -> "September";
//            case 9  -> "October";
//            case 10 -> "November";
//            case 11 -> "December";
//            default -> "Not";
//        };
//    }
//
//    public static String getCorrespondingDay(int value){
//        return switch (value) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 0 -> "Sunday";
//            default -> "Not Available";
//        };
//    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        int numberOfDaysInMonth = 0;

        // Display calendar for each month
        for (int month = 1; month <= 12; month++) {
            // Display Calendar title
            switch (month) {
                case 1: System.out.print("January 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 2: System.out.print("February 1, " + year + " is ");
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        numberOfDaysInMonth = 29;
                    else
                        numberOfDaysInMonth = 28;
                    break;
                case 3: System.out.print("March 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 4: System.out.print("April 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 5: System.out.print("May 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 6: System.out.print("June 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 7: System.out.print("July 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 8: System.out.print("August 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 9: System.out.print("September 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 10: System.out.print("October 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 11: System.out.print("November 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 12: System.out.print("December 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
            }

            switch (firstDay) {
                case 0: System.out.println("Sunday"); break;
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
            }

            // Get the start day for the next month
            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }

}
