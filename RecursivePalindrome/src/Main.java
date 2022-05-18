public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("losjl"));
    }

    public static boolean isPalindrome(String value){
        if(value.length() <= 1) return true;
        if(value.charAt(0) != value.charAt(value.length() -1)) return false;
        return isPalindrome(value.substring(1, value.length() - 1));
    }
}