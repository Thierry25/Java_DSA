package com.ltech;

public class RandomCharacter {

    public static char getRandomCharacter(char ch1, char ch2){
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomSingleDigits(){
        return getRandomCharacter('0', '9');
    }
}
