package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int firstPrime = 2;
        for(int i = 2; i < 1000; i++){
            if(isPrime(i)){
                if(i - firstPrime == 2){
                    System.out.printf("(%d, %d)\n", firstPrime, i);
                }
                firstPrime = i;
            }
        }
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

}
