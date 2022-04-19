package com.ltech;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random(1000);
        for(int i = 0 ; i < 50; i++){
            System.out.println(random.nextInt(100));
        }
    }
}
