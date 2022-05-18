public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(235));
    }

    public static int sumDigits(int number){
        if(number < 10) return number;
        return sumDigits(number / 10) + number % 10;
    }
}