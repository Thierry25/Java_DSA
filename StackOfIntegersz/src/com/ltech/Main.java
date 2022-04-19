package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StackOfIntegers stack = new StackOfIntegers();
        for(int i = 0; i < 10; i++){
            stack.push(i);
        }

        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println(Integer.parseInt("10", 16));

    }
}
