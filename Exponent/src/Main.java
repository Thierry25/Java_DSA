public class Main {
    public static void main(String[] args) {
        System.out.println(exponent(2,12));
    }

    public static int exponent(int n) {
        if(n == 0) return 1;
        return 2 * exponent(n - 1);
    }

    public static int exponent(int base, int number){
        if(number == 0) return 1;
        return base * exponent(number - 1);
    }
}