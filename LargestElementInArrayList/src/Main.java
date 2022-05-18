import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Lol");
        strings.add("Zebra");
        strings.add("Qwerty");
        strings.add("Habla");
        strings.add("Art");
        System.out.println(max(strings));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E max = list.get(0);
        for(E data: list){
            if(data.compareTo(max) > 0) max = data;
        }
        return max;
    }
}