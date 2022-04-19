package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int max = Integer.MIN_VALUE;
        String name = "";
        String bestScoreName = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        int number = input.nextInt();
        if(number <= 0){
            System.out.print("Are you serious bro? ");
            System.exit(1);
        }
        int score;
        for(int i = 0; i < number; i++){
            System.out.print("Enter the name of the student: ");
            name = input.next();
            System.out.printf("Please enter the score of %s : ", name);
            score = input.nextInt();
            if(score > max){
                bestScoreName = name;
                max = score;
            }
            System.out.println();
        }
        System.out.printf("%s had the best score. He had a %d 😱", bestScoreName, max);

    }
}
