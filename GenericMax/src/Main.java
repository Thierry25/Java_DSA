import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter 10 digits");
        Scanner input = new Scanner(System.in);
        Integer[] values = new Integer[10];
        for(int i = 0; i < 10; i++) values[i] = input.nextInt();
        System.out.println(max(values));
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E mx = list[0];
        for(E val : list) {
           if(val.compareTo(mx) > 0) mx = val;
        }
        return mx;
    }
}