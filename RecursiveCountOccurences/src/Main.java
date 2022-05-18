public class Main {
    public static void main(String[] args) {
        System.out.println(count("Heele werede", 'e'));
    }

    public static int count(String str, char a){
        return count(str, a, str.length());
    }

    public static int count(String str, char a, int index){
        if(str.length() == 0) return 0;
        int countValue = 0;
        if(str.charAt(index - 1) == a) countValue += 1;
        return countValue + count(str.substring(0, index -1 ), a, index - 1);
    }

}