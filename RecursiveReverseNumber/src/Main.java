public class Main {
    public static void main(String[] args) {
        reverseNum(541);
    }

    public static void reverseNum(int value){
       if(value != 0){
           System.out.print(value % 10);
           value /= 10;
           reverseNum(value);
       }
    }
}