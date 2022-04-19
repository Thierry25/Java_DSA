package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }
            System.out.println();
        }

        System.out.println(sumMatrix(matrix));
        columnSum(matrix);
        rowSum(matrix);
        System.out.println(largestSum(matrix));

    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) sum += anInt;
        }
        return sum;
    }

    // Summing elements by column
    public static void columnSum(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][col];
            }
            System.out.println("Total of column " + col + " is " + total);
        }
    }

    // Summing elements by row
    public static void rowSum(int[][] matrix){
        for(int row = 0; row < matrix[0].length; row++){
            int total = 0;
            for(int col = 0; col < matrix.length; col++) total += matrix[row][col];
            System.out.println("Total of row " + row + " is " + total);
        }
    }

    // Which row has the largest sum
    public static String largestSum(int[][] matrix){
        int maxIndex = Integer.MIN_VALUE;
        int maxTotal = Integer.MIN_VALUE;
        for(int row = 0; row < matrix[0].length; row++){
            int total = 0;
            for(int col = 0; col < matrix.length; col++){
                total += matrix[row][col];
                if(total > maxTotal){
                    maxTotal = total;
                    maxIndex = row;
                }
            }
        }
        return "Row " + maxIndex + " has the maximum sum of " + maxTotal;
    }
}
