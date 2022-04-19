package com.ltech;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final int MAX_PER_LINE = 10;
        int count = 0;

        for (int i = 100; i < 1_001; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                count++;
                if (count % MAX_PER_LINE == 0) System.out.printf("%d\t\n", i);
                else System.out.printf("%d\t", i);
            }
        }
    }
}
