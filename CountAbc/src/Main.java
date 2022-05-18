import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(countAbc("abcxxabc"));
    }

    public static int countAbc(String str) {
        return countAbc(str, str.length() -1);
    }

    public static int countAbc(String str, int index){
        if(index < 0) return 0;
        int count = 0;
        if(index >= 2 && ((str.charAt(index) == 'c' || str.charAt(index) == 'a')
        && str.charAt(index -1) == 'b' && str.charAt(index -2) == 'a')){
            count += 1;
            index -= 2;
        }
        return countAbc(str, index - 1) + count;
    }

}