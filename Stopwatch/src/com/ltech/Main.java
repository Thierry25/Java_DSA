package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Add 100000 numbers to arr
        double[] arr = new double[100_000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.random() * arr.length;
        }
        StopWatch stopWatch = new StopWatch();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

    public static void selectionSort(double[] arr){
        for(int i = 0; i < arr.length; i++){
            double min = arr[i];
            int currentIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    min = arr[j];
                    currentIndex = j;
                }
            }

            if(currentIndex != i){
                arr[currentIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
