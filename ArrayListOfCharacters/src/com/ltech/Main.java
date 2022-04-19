package com.ltech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        System.out.println(toCharacterArray(input.next()));
    }

    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            arrayList.add(s.charAt(i));
        }
        return arrayList;
    }
}
