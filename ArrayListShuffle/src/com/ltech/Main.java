package com.ltech;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            int value = (int) (Math.random() * list.size());
            swap(list, i, value);
            i++;
        }
    }

    public static void swap(ArrayList<Integer> list, int x, int y) {
        int temp = list.get(x);
        int temp2 = list.get(y);
        list.set(y, temp);
        list.set(x, temp2);
    }

}
