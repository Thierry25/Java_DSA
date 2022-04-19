package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(printMatrix(3));
    }

    public static String printMatrix(int data){
        StringBuilder x = new StringBuilder();
        for(int i = 0; i < data; i++){
            for(int j = 0; j < data; j++){
                 x.append((int) (Math.random() * (2))).append(" ");
            }
            x.append("\n");
        }
        return x.toString();
    }
}
