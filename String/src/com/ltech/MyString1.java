package com.ltech;

public class MyString1 {
    private final char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public MyString1(String s){
        this.chars = new char[s.length()];
        System.arraycopy(s.toCharArray(), 0, this.chars, 0, s.length());
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) return '-';
        return this.chars[index];
    }

    public int length() {
        return this.chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (end < begin) return null;
        if (end - begin < 0 || end - begin > this.chars.length) return null;
        int newRange = end - begin;
        char[] sub = new char[newRange];
        int k = 0;
        for (int i = begin; i < end; i++) {
            sub[k++] = this.chars[i];
        }
        return new MyString1(sub);
    }

    public MyString1 substring(int begin){
        return substring(begin, this.chars.length);
    }

    public MyString1 toLowerCase() {
        char[] lowerCase = new char[this.chars.length];
        for (int i = 0; i < this.chars.length; i++) {
            lowerCase[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerCase);
    }

    public MyString1 toUpperCase(){
        char[] upperCase = new char[this.chars.length];
        for(int i = 0; i < this.chars.length; i++){
            upperCase[i] = Character.toUpperCase(this.chars[i]);
        }
        return new MyString1(upperCase);
    }

    public boolean equals(MyString1 s) {
        boolean isEqual = true;
        char[] sChars = s.getChars();
        if (this.chars.length != sChars.length) return false;
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] != sChars[i]) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }

    public static MyString1 valueOf(int i) {
        char[] chars = new char[countDigit(i)];
        int j = chars.length - 1;
        while (i != 0) {
            int reminder = i % 10;
            chars[j] = (char) (reminder + '0');
            j--;
            i /= 10;
        }
        return new MyString1(chars);
    }

    public char[] getChars() {
        return chars;
    }

    public static int countDigit(int i) {
        int count = 0;
        while (i != 0) {
            count += 1;
            i /= 10;
        }
        return count;
    }

    public static MyString1 valueOf(boolean b){
       String s = String.valueOf(b);
       return new MyString1(s);


    }

}
