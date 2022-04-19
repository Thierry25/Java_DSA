package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012) : ");
        int year = input.nextInt();

        System.out.print("Enter the month as a number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month){
        printMonthTitle(year, month);

        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month){
        System.out.println("\t\t" + getMonthName(month) + " " + year);
        System.out.println("---------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month){
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

    public static void printMonthBody(int year, int month){
        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        int i = 0;
        for(i = 0; i < startDay; i++) System.out.println("   ");

        for(i = 1; i <= numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static int getStartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;

        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month){
        int total = 0;

        for(int i = 1800; i < year; i++){
            if(isLeapYear(i)) total += 366;
            else total += 365;
        }

        for (int i = 1; i < month; i++){
            total += getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month){
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
