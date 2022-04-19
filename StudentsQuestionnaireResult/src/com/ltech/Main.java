package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] result = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        char[][] matrix = getArray();

        checkAnswer(matrix, result);
    }

    public static char[][] getArray(){
        Scanner input = new Scanner(System.in);
        char[][] arr = new char[3][10];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                arr[row][col] = input.next().charAt(0);
            }
        }
        return arr;
    }

    public static void checkAnswer(char[][] matrix, char[] result){
        for(int row = 0; row < matrix.length; row++){
            int score = 0;
            for(int col = 0; col < matrix[0].length; col++){
                if(result[col] == matrix[row][col]){
                    score += 1;
                }
            }
            System.out.printf("Student %d got %d questions right\n", row, score);
        }
    }
}
