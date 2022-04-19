package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int positiveCount = 0;
        int negativeCount = 0;
        double sum = 0;
        int number = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        while(true){
            number = scanner.nextInt();
            sum += number;
            if(number == 0) break;
            if(number > 0) positiveCount += 1;
            else negativeCount += 1;
        }
        System.out.printf("The number of positives is %d\n", positiveCount);
        System.out.printf("The number of negatives is %d\n", negativeCount);
        System.out.printf("The total is %4.2f\n", sum);
        int count = positiveCount + negativeCount;
        if(count > 0) System.out.printf("The average is %4.2f\n", sum / count);
        else System.out.println("The average is 0");
    }
}
