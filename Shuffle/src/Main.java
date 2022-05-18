import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) integers.add(i);
        shuffle(integers);
        System.out.println(integers);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int) (Math.random() * list.size());
            E data = list.get(i);
            list.set(i, list.get(index));
            list.set(index, data);
        }
    }
}