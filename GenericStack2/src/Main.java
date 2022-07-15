public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.add("HAHA");
        myStack.add("LOL");
        myStack.add("Funny");
        myStack.add("Sweet");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack);
    }
}