package com.ltech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i < 5; i++) integers.add(input.nextInt());
        sort(integers);
        System.out.println(integers);
    }

    public static void sort(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            int min = list.get(i);
            int minIndex = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j) < min){
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = list.get(i);
                int temp2 = list.get(minIndex);
                list.set(i, temp2);
                list.set(minIndex, temp);
            }
        }
    }
}
