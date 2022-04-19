package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here'
        char[] r = randomCharacters();
        displayAllCharacters(r);
        System.out.println("----------------");
        int[] counts = countLetters(r);
        int count = 0;
        for(int i : counts){
            count += 1;
            if(count % 10 == 0) System.out.println(i + "\t");
            else System.out.print(i + "\t");
        }
    }

    public static char[] randomCharacters(){
        char[] chars = new char[100];
        for(int i = 0; i < 100; i++){
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static void displayAllCharacters(char[] letters){
        int count = 0;
        for(char c : letters) {
            count += 1;
            if(count % 10 == 0) System.out.println(c + "\t");
            else System.out.print(c + "\t");
        }
    }

    public static int[] countLetters(char[] characters){
        int[] counts = new int[26];
        for (char character : characters) {
            counts[character - 'a']++;
        }
        return counts;
    }
}
