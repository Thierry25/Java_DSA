package com.ltech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter five integers for list1: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 5; i++) list1.add(input.nextInt());
        System.out.println("Please enter five integers for list2: ");
        for(int i = 0; i < 5; i++) list2.add(input.nextInt());
        System.out.println(union(list1, list2));
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(list1);
        integers.addAll(list2);
        return integers;
    }
}
