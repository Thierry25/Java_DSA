package main;

public class Main {
    public static void main(String[] args) {
        System.out.println(decToHex(12323223));
    }

    public static String decToHex(int number){
        StringBuilder stringBuilder = new StringBuilder();
        while(number > 0){
            stringBuilder.append(getChar(number % 16));
            number /= 16;
        }
        return stringBuilder.reverse().toString();
    }

    public static char getChar(int value){
        if(value >= 0 && value <=9) return (char) ('0' + value);
        else if(value == 10) return 'A';
        else if(value == 11) return 'B';
        else if(value == 12) return 'C';
        else if(value == 13) return 'D';
        else if(value == 14) return 'E';
        else if(value == 15) return 'F';
        throw new NumberFormatException("Not a valid value");
    }
}
