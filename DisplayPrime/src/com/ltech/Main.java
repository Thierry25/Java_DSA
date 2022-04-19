package com.ltech;



public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] primes = new int[30];
        int k = 0;
        for(int i = 2; i < 121; i ++){
            if(isPrime(i)){
                primes[k++] = i;
            }
        }

        printReverseArr(primes);
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printReverseArr(int[] arr){
        for(int i = arr.length -1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
