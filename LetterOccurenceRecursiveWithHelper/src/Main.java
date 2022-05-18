import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a word");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        char[] chars = value.toCharArray();
        System.out.println(count(chars, 'e'));
    }

    public static int count(char[] chars, char ch){
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int index){
        if(index < 0) return 0;
        return (chars[index] == ch ? 1 : 0) + count(chars, ch, index -1);
    }
}