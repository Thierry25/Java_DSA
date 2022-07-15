public class Main {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("Lol");
        queue.enqueue("Thierry");
        queue.enqueue("Joseph");
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}