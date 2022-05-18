import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("New York");
        list.add("Atlanta");
        list.add("Dallas");
        list.add("Madison");

        list.forEach(e -> System.out.println(e.toUpperCase()));
        for(String s : list) System.out.println(s.toLowerCase());
    }
}