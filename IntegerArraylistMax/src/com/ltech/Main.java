package com.ltech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number that you want: ");
        int valueEntered = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(valueEntered != 0){
            System.out.println("Another one: ");
            arrayList.add(valueEntered);
            valueEntered = input.nextInt();
        }
        System.out.println("The values that you entered are the following: ");
        for(int i : arrayList) System.out.print(i + " ");
        System.out.printf("The maximum value was %d\n", max(arrayList));
    }

    public static Integer max(ArrayList<Integer> list){
        if(list == null || list.size() == 0) return null;
        int max = Integer.MIN_VALUE;
        for(int x : list){
            max = Math.max(max, x);
        }
        return max;
    }
}
