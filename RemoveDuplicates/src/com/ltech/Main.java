package com.ltech;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i < 10; i++) integers.add(input.nextInt());
        removeDuplicates(integers);
        System.out.println(integers);
    }

    public static void removeDuplicates(ArrayList<Integer> list){
        for(int i = 0 ; i < list.size() - 1; i++){
            for(int j = i + 1; j < list.size() ; j++){
                if(list.get(i) == list.get(j)) list.remove(j);
            }
        }
    }
}
