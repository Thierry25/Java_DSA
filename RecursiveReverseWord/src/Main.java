public class Main {
    public static void main(String[] args) {
       reverseDisplay("Daniel");
    }

    public static void reverseDisplay(String value){
        if(value.length() > 0) {
            System.out.print(value.charAt(value.length() -1));
            reverseDisplay(value.substring(0,value.length() - 1));
        }
    }
}