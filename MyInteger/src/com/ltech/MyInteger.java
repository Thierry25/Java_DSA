package com.ltech;

public class MyInteger {
    private final int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return MyInteger.isEven(value);
    }

    public boolean isOdd(){
        return !isEven();
    }

    public boolean isPrime(){
       return MyInteger.isPrime(this.value);
    }

    public static boolean isEven(int data){
        return data % 2 == 0;
    }

    public static boolean isOdd(int data){
        return !isEven(data);
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
