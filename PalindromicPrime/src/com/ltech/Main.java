package com.ltech;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 0;
        final int MAX_PER_LINE = 10;
        int number = 2;

        while (count < 100) {
            if (isPrime(number) && isPalindrome(number)){
                count += 1;
                if(count % MAX_PER_LINE == 0){
                    System.out.printf("%d\t\n", number);
                }else{
                    System.out.printf("%d\t", number);
                }
            }
            number += 1;
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
