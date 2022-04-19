package com.ltech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String x = "Hello! World! Nadia! De! Bueno! Dias";
        System.out.println(Arrays.toString(split(x, "!")));

        System.out.println("----");
        System.out.println();

    }

    // Should return the values with the String delimiters included
    public static String[] split(String s, String regex) {
        String[] temp = new String[100];
        int k = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != regex.charAt(0)) {
                stringBuilder.append(c);
                System.out.println(stringBuilder);
                if (i == s.length() - 1) temp[k++] = stringBuilder.toString();

            } else {
                temp[k++] = stringBuilder.toString();
                temp[k++] = String.valueOf(s.charAt(i));
                stringBuilder = new StringBuilder();
            }

        }
        String[] split = new String[k];
        System.arraycopy(temp, 0, split, 0, k);
        return split;
    }
}
