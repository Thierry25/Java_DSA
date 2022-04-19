package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printTableHeader();
        double celsiusCount = 40;
        double fahrenheitCount = 120;

        for(int i = 0; i< 10; i++){
            System.out.printf("%4.1f\t\t%4.1f\t\t\t|\t\t",celsiusCount, celsiusToFahrenheit(celsiusCount));
            System.out.printf("%4.1f\t\t\t%4.2f", fahrenheitCount, fahrenheitToCelsius(fahrenheitCount));
            celsiusCount -= 1;
            fahrenheitCount -= 10;
            System.out.println();
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void printTableHeader(){
        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
        System.out.println("-----------------------------------------------------------");
    }
}
