import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        Arrays.sort(cities, new MyComparator());
        Arrays.sort(cities, Comparator.comparing(String::length));
        for(String s : cities) System.out.print(s + " ");
    }

  public static class MyComparator implements Comparator<String>{
      @Override
      public int compare(String o1, String o2) {
          return o1.length() - o2.length();
      }
  }
}