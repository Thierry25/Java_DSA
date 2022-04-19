package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Please enter the second city: ");
        String secondCity = input.nextLine();

        if (firstCity.compareTo(secondCity) < 0){
            System.out.println("The cities you entered in order are " + firstCity + " and " + secondCity);
        }else{
            System.out.println("The cities you entered in order are " + secondCity + " and " + firstCity);
        }
    }
}
