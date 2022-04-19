package com.ltech;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 0;
        int number = 2;
        int MAX_NUMBER_PER_LINE = 10;

        while(count < 50){
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
                if(isPrime){
                    count++;
                    if(count % MAX_NUMBER_PER_LINE == 0){
                        System.out.printf("%d\t\n",number);
                    }else{
                        System.out.printf("%d\t", number);
                    }
                }
            number++;
        }
    }
}
