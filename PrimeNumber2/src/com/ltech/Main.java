package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int number = 2;
       int count = 0;
       while(number < 10_000){
           if(isPrime(number)) count +=1;
           number += 1;
       }
        System.out.printf("There are %d prime numbers in 10,000", count);
    }

    public static boolean isPrime(int number){
       for(int i = 2; i <= Math.sqrt(number); i++){
           if(number % i == 0){
              return false;
           }
       }
       return true;
    }
}
