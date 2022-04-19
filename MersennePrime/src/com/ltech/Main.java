package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The Mersenne primes for integers <= 31 are: ");
        System.out.println("p\t\t\t2^p-1");
        System.out.println("_______________________");
        for(int i = 2; i <= 31; i ++){
            if(isPrime(i) && isPrime(newForm(i))){
                System.out.printf("%d\t\t\t%d\n", i, newForm(i));
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

    public static int newForm(int number){
        return (int)(Math.pow(2,number)) - 1;
    }
}
