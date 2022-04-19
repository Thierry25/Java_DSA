package com.ltech;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> list = new ArrayList<>();

    public Stack() {
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(list.size() - 1);
    }

    public Object pop(){
        return list.remove(list.size() - 1);
    }

    public void push(Object o){
        list.add(o);
        System.out.println("Object successfully added to the list");
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
