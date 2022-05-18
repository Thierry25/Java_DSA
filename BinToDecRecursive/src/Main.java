public class Main {
    static int pow = 0;
    public static void main(String[] args) {
        System.out.println(bin2Dec("10"));
    }

    public static int bin2Dec(String binaryString){
        return bin2Dec(binaryString, 0,binaryString.length() -1);
    }

    public static int bin2Dec(String binaryString, int low, int high){
       if(high < low) return 0;
//       return bin2Dec(binaryString, low, high - 1) * 2
//               + (binaryString.charAt(high));
    }

}