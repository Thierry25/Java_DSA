public class Main {
    public static void main(String[] args) {
        System.out.println(sum(3));
    }

    public static double sum(int value){
        if(value == 1) return 1;
        //return 1 + (1 / sum(value - 1));
        return sum(value - 1) + 1.0 / value;
    }
}