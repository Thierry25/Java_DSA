import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("golden"));
        list.add(new StringBuilder("state"));
        list.add(new StringBuilder("warriors"));
        list.add(new StringBuilder("stephen"));
        list.add(new StringBuilder("curry"));
        list.add(new StringBuilder("klay"));
        list.add(new StringBuilder("thompson"));

        list.forEach(e ->{
            if(e.length() > 0) {
                char c = e.charAt(0);
                e.setCharAt(0, Character.toUpperCase(c));
                System.out.println(e);
            }
        });
    }
}