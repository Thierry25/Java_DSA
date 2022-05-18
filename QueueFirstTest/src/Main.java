import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("I'm just");
        queue.offer("trying");
        queue.offer("to be");
        queue.offer("the best");
        queue.offer("that I can be");

        while(queue.size() > 0){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(13);
        priorityQueue.offer(11);
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        priorityQueue.offer(4);
        priorityQueue.offer(3);
        priorityQueue.offer(9);

        while(priorityQueue.size() > 0) System.out.print(priorityQueue.poll() + " ");
    }
}