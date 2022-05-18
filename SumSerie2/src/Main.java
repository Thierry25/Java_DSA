public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveSum(4));
    }

    public static double recursiveSum(double i){
        if(i == 1) return i / ((2 * i) + 1);
        return recursiveSum(i - 1) + (i) / ((2 * i) + 1);
    }
}