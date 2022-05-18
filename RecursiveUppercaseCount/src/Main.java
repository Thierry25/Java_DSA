public class Main {
    public static void main(String[] args) {
        System.out.println(count("Hello world!"));
    }

    public static int count(String value){
        if(value.length() == 0) return 0;
        int countValue = 0;
        if(Character.isUpperCase(value.charAt(value.length() -1))) countValue +=1;
        return countValue + count(value.substring(0, value.length() - 1));
    }
}