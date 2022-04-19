package main;

public class Main {
    public static void main(String[] args) {
        int x = 134;
        int binary;
        String s = "";
        while (x > 0) {
            s = x %2 + s;
            x /= 2;
        }
        binary = Integer.parseInt(s);
        System.out.println(binary);
    }

}
