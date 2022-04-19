package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 33;
        final int MAX_PER_LINE = 10;
        int count = 0;

        while (n < 127){
            count += 1;
            if(count % MAX_PER_LINE == 0) System.out.printf("%c\t\n", (char) n);
            else System.out.printf("%c\t", (char) n);
            n += 1;
        }
    }
}
