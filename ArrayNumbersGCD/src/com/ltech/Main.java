package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter five integers: ");
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        System.out.println("The gcd of these five integers is " +
                gcd(numbers));
    }
    public static int gcd(int n1, int n2){
        int greater = Math.min(n1, n2);
        int gcd = 1;
        int i = 2;
        while(i <= greater){
            if(n1 % i == 0 && n2 % i == 0) gcd = i;
            i++;
        }
        return gcd;
    }
    public static int gcd(int... numbers){
        int g = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            g = gcd(g, numbers[i]);

        return g;
    }
}
