public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(90));
    }

    public static long factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}
