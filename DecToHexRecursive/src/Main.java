public class Main {
    public static void main(String[] args) {
        System.out.println(dec2Hex(1212));
    }

    public static String dec2Hex(int value){
        if(value <= 0) return "";
        return dec2Hex(value / 16) + dec2HexChar(value % 16) ;
    }

    public static char dec2HexChar(int value) {
        if (value >= 10 && value <=15)
            return (char)('A' + value - 10);
        else
            return (char)('0' + value);
    }
}