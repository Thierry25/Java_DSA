import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> cities = Arrays.asList("Atlanta", "Savannah", " new York", "dallas");
       cities.sort(String::compareToIgnoreCase);


       for(String s: cities) System.out.print(s + " ");
    }
}