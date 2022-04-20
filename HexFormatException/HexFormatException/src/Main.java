import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a hex value that you would like to test: ");
        String enteredValue = input.nextLine();
        try{
            System.out.println(hex2Dec(enteredValue));
        }catch (HexFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public static int hex2Dec(String hex) throws HexFormatException{
        int decimal = 0;
        for(int i = 0; i < hex.length(); i++){
            decimal = decimal * 16 + getHexValue(hex.charAt(i));
        }
        return decimal;
    }

    public static int getHexValue(char c) throws HexFormatException{
        return switch (Character.toUpperCase(c)){
            case 'A' -> 10;
            case 'B' -> 11;
            case 'C' -> 12;
            case 'D' -> 13;
            case 'E' -> 14;
            case 'F' -> 15;
            case '0', '1', '2','3','4','5','6','7','8','9' -> c - '0';
            default -> throw new HexFormatException("Not a hex value " + c);
        };
    }
}