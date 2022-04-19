package com.ltech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr = {10, 9, 8, 1};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] list){
         return sortedList(list) == 0;
    }

    public static int sortedList(int[] list){
        int count = 0;
        for(int i = 0 ; i < list.length; i++){
           int min = list[i];
           int currentMinIndex = i;

           for(int j = i + 1; j < list.length; j++){
               if(list[j] < min){
                   min = list[j];
                   currentMinIndex = j;
               }
           }
           if(currentMinIndex != i){
               list[currentMinIndex] = list[i];
               list[i] = min;
               count += 1;
               break;
           }
        }
        return count;
    }
}
