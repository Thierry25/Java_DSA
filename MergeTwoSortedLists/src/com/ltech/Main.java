package com.ltech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] list1 = {2, 4, 6, 8, 10};
        int[] list2 = {1, 3, 5, 7, 9};


        System.out.println(Arrays.toString(merge(list1, list2)));
    }

    public static int[] merge(int[] list1, int[] list2){
        int[] mergedList = new int[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < list1.length && j < list2.length){
            if(list1[i] <= list2[j]){
                mergedList[k++] = list1[i];
                i++;
            }else{
                mergedList[k++] = list2[j];
                j++;
            }
        }

        while(i < list1.length){
            mergedList[k++] = list1[i];
            i++;
        }

        while(j < list2.length){
            mergedList[k++] = list1[j];
            j++;
        }

        return mergedList;
    }
}
