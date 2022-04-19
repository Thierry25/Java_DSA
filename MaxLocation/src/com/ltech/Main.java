package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row and columns in the array: ");
        double[][] arr = new double[input.nextInt()][input.nextInt()];
        System.out.println("Enter the array: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextDouble();
            }
        }

        Location l = locateLargest(arr);
        System.out.printf("The location of the largest element is %4.2f at (%d, %d)\n"
                , l.getMaxValue(),l.getRow(),l.getColumn());
    }

    public static Location locateLargest(double[][] a){
        int rIndex = -1;
        int cIndex = -1;
        double maxVal = Integer.MIN_VALUE;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                if(a[row][col] > maxVal){
                    maxVal = a[row][col];
                    rIndex = row;
                    cIndex = col;
                }
            }
        }
        return new Location(rIndex, cIndex, maxVal);
    }
}
