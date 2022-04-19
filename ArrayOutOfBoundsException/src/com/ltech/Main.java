package com.ltech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = generateRandomArr();
        printArray(arr);
        System.out.print("Please enter an index that you would like to check (0 -99)");
        boolean isValid = true;
        Scanner input = new Scanner(System.in);

        do{
            try{
                int index = input.nextInt();
                System.out.println(arr[index]);
                isValid = false;
            }catch (InputMismatchException e){
                System.out.println("The value entered is not an integer");
                input.nextLine();
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Out of bounds bro");
                input.nextLine();
            }
        }while(isValid);

    }

    public static int[] generateRandomArr(){
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * arr.length);
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i: arr) System.out.print(i + " ");
        System.out.println();
    }
}
