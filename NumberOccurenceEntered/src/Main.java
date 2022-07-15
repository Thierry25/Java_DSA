import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> integerMap = new HashMap<>();
        int value = input.nextInt();
        while (value != 0) {
            integerMap.put(value, integerMap.containsKey(value) ? integerMap.get(value) + 1 : 1);
            value = input.nextInt();
        }


    }
}