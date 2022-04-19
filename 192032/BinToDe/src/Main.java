public class Main {

    public static void main(String[] args) {
        System.out.println(decimal(11101010));
    }

    public static int decimal(int binary){
        int value = 0;
        int exponent = 0;
        while(binary > 0){
            value += (int)((binary % 2) * (Math.pow(2, exponent)));
            binary /= 10;
            exponent += 1;
        }
        return value;
    }
}