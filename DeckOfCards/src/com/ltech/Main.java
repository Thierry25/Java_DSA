package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] cards = new int[52];
        // Add values to array
       for(int i = 0; i < cards.length; i++) cards[i] = i;

       // Shuffle cards
        for(int i = 0; i < cards.length; i++){
            int index = (int) (Math.random() * cards.length); // any values between 0 - 51
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }
}
