import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {
        System.out.println(isPalindrome("abdxcxdba"));
    }

    public static boolean isPalindrome(String s){
        if(s.length() <= 1) return true;
        if(s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() -1));
    }

}