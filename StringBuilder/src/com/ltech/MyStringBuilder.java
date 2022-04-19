package com.ltech;


import java.util.Arrays;

public class MyStringBuilder {
    private char[] chars;

    public MyStringBuilder(String s) {
        this.chars = new char[s.length()];
        System.arraycopy(s.toCharArray(), 0, this.chars, 0, s.length());
    }

    public MyStringBuilder append(MyStringBuilder s) {
        char[] temp = new char[this.chars.length + s.chars.length];
        System.arraycopy(this.chars, 0, temp, 0, this.chars.length);
        int initialSize = this.chars.length;
        this.chars = temp;
        for (int i = 0; i < s.getChars().length; i++) {
            this.chars[initialSize++] = s.getChars()[i];
        }
        return new MyStringBuilder(String.valueOf(this.chars));
    }

    public MyStringBuilder append(int i) {
        return append(new MyStringBuilder(String.valueOf(i)));
    }

    public int length() {
        return this.chars.length;
    }

    public char charAt(int index) {
        if (index < 0 || index > this.chars.length) return '-';
        return this.chars[index];
    }

    public MyStringBuilder toLowerCase() {
        char[] chars = new char[this.chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(this.chars[i]);
        }
        return new MyStringBuilder(String.valueOf(chars));
    }

    public MyStringBuilder substring(int begin, int end) {
        if (begin < 0 || begin > this.chars.length || begin > end || end > this.chars.length) return null;
        char[] newStringBuilder = new char[end - begin];
        int k = 0;
        for(int i = begin ; i < end; i++){
            newStringBuilder[k++] = this.chars[i];
        }
        return new MyStringBuilder(String.valueOf(newStringBuilder));
    }

    public String toString(){
        return String.valueOf(this.chars);
    }

    public char[] getChars() {
        return chars;
    }
}
