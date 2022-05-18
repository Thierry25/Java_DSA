public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abdxcxdba"));
    }

  public static boolean isPalindrome(String value){
        return isPalindrome(value, 0, value.length() - 1);
  }

  public static boolean isPalindrome(String value, int low, int high){
        if(high <= low) return true;
        if(value.charAt(low) != value.charAt(high)) return false;
        return isPalindrome(value, low + 1, high - 1);
  }
}