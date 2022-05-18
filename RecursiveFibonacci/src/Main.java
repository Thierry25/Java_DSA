public class Main {
    public static void main(String[] args) {
        // This will output the 7th integer in the fibonacci sequence.
        System.out.println(fibonacci(7));
    }
    public static long fibonacci(int number){
        if(number == 0) return 0;
        if(number == 1) return 1;
        return fibonacci(number - 2) + fibonacci(number - 1);
    }
}