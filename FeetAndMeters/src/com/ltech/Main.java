package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printTableHeader();
        double feetCount = 1;
        double metersCount = 20;

        for(int i = 0; i < 10; i++){
            System.out.printf("%4.1f\t\t%4.3f\t\t|\t\t", feetCount, footToMeter(feetCount));
            System.out.printf("%4.1f\t\t%4.3f", metersCount, meterToFoot(metersCount));
            feetCount += 1;
            metersCount += 5;
            System.out.println();
        }
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }

    public static void printTableHeader(){
        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");
        System.out.println("---------------------------------------------------");
    }
}
