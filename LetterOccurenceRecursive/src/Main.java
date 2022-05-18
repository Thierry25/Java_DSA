public class Main {
    public static void main(String[] args) {
        System.out.println(count("Welcomeee", 'e'));
    }

    public static int count(String str, char c){
        if(str.length() == 0) return 0;
        int count = 0;
        if(str.charAt(str.length() - 1) == c) count += 1;
        return count(str.substring(0, str.length() - 1), c) + count;
    }
}