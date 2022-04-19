package com.ltech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int total = input.nextInt();
        int[][] matrix = new int[total][total];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
        printMatrix(matrix);
        System.out.println(findMaxRowIndex(matrix));
        System.out.println(findMaxColumnIndex(matrix));
    }

    public static void printMatrix(int[][] arr) {
        for (int[] ints : arr) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> findMaxRowIndex(int[][] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int row = 0; row < arr.length; row++) {
            int countOne = 0;
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == 1) countOne += 1;
            }
            if(countOne >= max) {
                max = countOne;
                index = row;
                System.out.println(row);
            }
        }
        arrayList.add(index);
        return arrayList;
    }

    public static ArrayList<Integer> findMaxColumnIndex(int[][] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int col = 0; col < arr[0].length; col++){
            int countOne = 0;
            for (int[] ints : arr) {
                if (ints[col] == 1) countOne += 1;
            }
            if(countOne >= max) {
                max = countOne;
                index = col;
                System.out.println(col);
            }
        }
        arrayList.add(index);
        return arrayList;
    }


}
