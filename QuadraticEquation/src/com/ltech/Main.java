package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Equation equation = new Equation(1, 2, 3);
        System.out.println(equation.getDiscriminant());
        System.out.println(equation.getRoot1());
        System.out.println(equation.getRoot2());
    }
}
