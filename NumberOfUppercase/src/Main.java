import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a word");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        char[] chars = value.toCharArray();
        System.out.println(count(chars));
    }

    public static int count(char[] chars){
        return count(chars, chars.length -1);
    }

    public static int count(char[] chars, int index){
        if(index < 0) return 0;
        int countVal = 0;
        if(Character.isUpperCase(chars[index])) countVal += 1;
        return countVal + count(chars, index -1);
    }
}