package com.ltech;


public class Main {

    public static void main(String[] args) {
        // write your code here
        final int MAX_PER_LINE = 10;
        for(int i = 1; i < 101; i++){
            int value = getPentagonalNumber(i);
            if(i % MAX_PER_LINE == 0) System.out.printf("%7d\n", value);
            else System.out.printf("%7d", value);
        }
    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
