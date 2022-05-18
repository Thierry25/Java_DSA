public class Main {
    public static void main(String[] args) {
        System.out.println(dec2Bin(130));
    }

    public static String dec2Bin(int value) {
        if (value <= 0) return "0";
        return value % 2 + dec2Bin(value / 2);
    }
}