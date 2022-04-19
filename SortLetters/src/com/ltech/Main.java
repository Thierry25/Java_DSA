package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sort("acb"));
    }

    public static String sort(String s){
        String sorted = "";
        for(int i = 0; i < s.length(); i++){
            char min = s.charAt(i);
            int minIndex = i;

            for(int j = i + 1; j < s.length(); j++){
                if(min > s.charAt(j)){
                    min = s.charAt(j);
                    minIndex = j;
                }
            }
            sorted += minIndex != i ? s.charAt(minIndex) : s.charAt(i);

        }
        return sorted;
    }
}
