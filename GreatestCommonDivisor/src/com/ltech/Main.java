package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first integer ");
        int n1 = input.nextInt();
        System.out.print("Please enter second integer ");
        int n2 = input.nextInt();

        int greater = Math.min(n1, n2);
        int gcd = 1;
        int i = 2;
        while(i <= greater){
            if(n1 % i == 0 && n2 % i == 0) gcd = i;
            i++;
        }
        System.out.println(gcd);
    }
}
