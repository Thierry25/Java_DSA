package com.ltech;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter ten numbers: ");
        int[] data = new int[10];
        int j = 0;
        for(int i = 0 ; i < 10; i++){
            int value = input.nextInt();
            if(!isThere(value, data)) data[i - j] = value;
            else{
                j += 1;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    public static boolean isThere(int number, int[] array){
        boolean isPresent = false;
        for (int j : array) {
            if (j == number) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
}
