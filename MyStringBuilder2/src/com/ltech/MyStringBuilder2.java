package com.ltech;

public class MyStringBuilder2 {
    private char[] chars;

    public MyStringBuilder2(char[] chars){
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public MyStringBuilder2(){
        this(new char[16]);
    }

    public MyStringBuilder2(String s){
        this(s.toCharArray());
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        int k = 0;
        char[] newValue = new char[this.chars.length + s.getChars().length];
        for(int i = 0; i < this.chars.length; i++){
            if(i == offset){
                for(char c : s.getChars()) newValue[k++] = c;
            }
            newValue[k++] = this.chars[i];
        }
        return new MyStringBuilder2(newValue);
    }

    public MyStringBuilder2 reverse(){
        char[] temp = new char[this.chars.length];
        int k = 0;
        for(int i = temp.length-1; i >= 0; i--){
            temp[k++] = this.chars[i];
        }
        return new MyStringBuilder2(temp);
    }

    public MyStringBuilder2 substring(int begin){
        if(begin < 0 || begin > this.chars.length) return null;
        char[] newValue = new char[this.chars.length - begin];
        int k = 0;
        for(int i = begin; i < this.chars.length; i++){
            newValue[k++] = this.chars[i];
        }
        return new MyStringBuilder2(newValue);
    }

    public MyStringBuilder2 toUpperCase(){
        char[] temp = new char[this.chars.length];
        for(int i = 0; i < temp.length; i++){
            temp[i] = Character.toUpperCase(this.chars[i]);
        }
        return new MyStringBuilder2(temp);
    }

    public char[] getChars() {
        return chars;
    }
}
