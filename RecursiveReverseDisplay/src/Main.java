public class Main {
    public static void main(String[] args) {
        reverseDisplay("Hello world!");
    }

    public static void reverseDisplay(String value){
        if(value.length() > 0){
            int index = value.length() -1;
            reverseDisplay(value, index);
        }
    }

    public static void reverseDisplay(String value, int index){
        System.out.print(value.charAt(index));
        reverseDisplay(value.substring(0, index));
    }
}