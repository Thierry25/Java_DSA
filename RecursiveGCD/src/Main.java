public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(7, 24));
    }

    public static int gcd(int firstNumber, int secondNumber){
        if(firstNumber % secondNumber == 0) return secondNumber;
        return gcd(secondNumber, firstNumber % secondNumber);
    }
}