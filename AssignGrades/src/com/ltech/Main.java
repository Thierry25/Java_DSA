package com.ltech;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentsNumber = input.nextInt();
        int[] scores = new int[studentsNumber];
        System.out.print("Enter 4 scores: ");
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < studentsNumber; i++){
            scores[i] = input.nextInt();
            max = Math.max(max, scores[i]);
        }

        for(int i = 0; i < studentsNumber; i++){
            char grade = getGradeLetter(scores[i], max);
            System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], grade);
        }
    }
    public static char getGradeLetter(int score, int best ){
        if(score >= best - 10) return 'A';
        if(score >= best - 20) return 'B';
        if(score >= best - 30) return 'C';
        if(score >= best - 40) return 'D';
        return 'F';
    }
}
