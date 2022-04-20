import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the value that you would like to test: ");
        Scanner input = new Scanner(System.in);
        String enteredValue = input.nextLine();
        try{
            System.out.printf("The corresponding decimal value of %s is %d", enteredValue, bin2Dec(enteredValue));
        }catch (BinaryFormatException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int bin2Dec(String bin) throws BinaryFormatException{
        int decimal = 0;
        int exponent = 0;
        for(int i = bin.length() - 1; i >= 0; i--){
            int value = (bin.charAt(i) - '0');
            if(value == 1 || value == 0){
                decimal += value * (int)(Math.pow(2, exponent));
                exponent += 1;
            }else throw new BinaryFormatException("Not a binary " + value);
        }
        return decimal;
    }


}