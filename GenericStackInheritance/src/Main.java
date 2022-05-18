public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GenericStack<String> list = new GenericStack<>();
        list.push("Lol");
        list.push("Haha");
        list.push("Sskker");
        System.out.println(list.peek());
        System.out.println(list.isEmpty());
    }
}