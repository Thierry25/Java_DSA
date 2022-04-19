package com.ltech;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue(int capacity){
        this.elements = new int[capacity];
    }

    public Queue(){
        this(DEFAULT_CAPACITY);
    }

    public void enqueue(int v){
        if(size >= this.elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
            this.elements = temp;
        }
        this.elements[size++] = v;
    }

    public int dequeue(){
        int value = this.elements[0];
        for(int i = 0; i < size - 1; i++){
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;

        return value;
    }
    /** Test whether the queue is empty */
    public boolean empty() {
        return this.size == 0;
    }

    /** Return the number of elements in the queue */
    public int getSize() {
        return this.size;
    }
}
