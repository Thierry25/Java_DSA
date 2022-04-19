package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getRandom(0,11));
    }

    public static int getRandom(int start, int end){
        return (int) (start + Math.random() * (end - start + 1));
    }
}
