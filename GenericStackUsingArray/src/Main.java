public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> list = new GenericStack<>();
        System.out.println(list.isEmpty());
        list.push(13);
        list.push(14);
        list.push(15);
        list.push(16);
        list.push(17);
        list.push(18);
        list.printStackData();
        System.out.println(list.pop());
        list.push(19);
        list.printStackData();
        System.out.println(list.isEmpty());
        System.out.println(list.peek());
    }


}