package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here

        StringBuilder x = new StringBuilder("Hello World");
        x.insert(1, "LOL");
        System.out.println(x);

        MyStringBuilder2 s = new MyStringBuilder2("Hello World");
        MyStringBuilder2 y = s.insert(1, new MyStringBuilder2("LOL"));
        MyStringBuilder2 z = s.reverse();
        MyStringBuilder2 a = y.substring(3);
        System.out.println(y.getChars());
        System.out.println(z.getChars());
        System.out.println(a.getChars());
        System.out.println(s.toUpperCase().getChars());
    }
}
