import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the binary that you would like to convert: ");
        String enteredValue = input.nextLine();
        try {
            System.out.printf("The decimal value is %d\n", bin2Dec(enteredValue));
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int bin2Dec(String bin) {
        int exponent = 0;
        int decimal = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            int value = (bin.charAt(i) - '0');
            if (value == 0 || value == 1) {
                decimal += value * (int) (Math.pow(2, exponent));
                exponent += 1;
            }else throw new NumberFormatException("Not a binary number");

        }
        return decimal;
    }
}