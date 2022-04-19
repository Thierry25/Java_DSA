package com.ltech;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Loan());
        arrayList.add(new Circle());
        arrayList.add(new Date());
        System.out.println(arrayList);

    }

    static class Loan {
        public Loan(){
            System.out.println("Yup, I loaned you $200_000US");
        }
        @Override
        public String toString(){
            return "Yall know I'm a loan";
        }
    }

    static class Circle{
        public Circle(){
            System.out.println("I have a radius of 10 centimeters");
        }
        @Override
        public String toString(){
            return "Best Circle you've ever seen in your life bro";
        }
    }
}
