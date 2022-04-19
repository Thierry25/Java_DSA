package com.ltech;

public class Main {

    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'});
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.toLowerCase().getChars());
        System.out.println(s.substring(2, 4).getChars());
        System.out.println(s.equals(new MyString1(new char[] {'A', 'B', 'C'})));

        char[] chars = MyString1.valueOf(345).getChars();
        for (char aChar : chars) {
            System.out.print(aChar);
        }

        MyString1 s2 = new MyString1("udemy is the best");
        System.out.println(s2.substring(3).getChars());
        System.out.println(s2.toUpperCase().getChars());
        System.out.println(s2.getChars());

        System.out.println("---");
        String string = String.valueOf(true);
        System.out.println(string);

    }
}
