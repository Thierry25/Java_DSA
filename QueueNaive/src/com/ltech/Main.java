package com.ltech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue queue = new Queue();
        for (int i = 0; i <= 20; i++)
            queue.enqueue(i);

        while (!queue.empty())
            System.out.print(queue.dequeue() + " ");
    }
}
