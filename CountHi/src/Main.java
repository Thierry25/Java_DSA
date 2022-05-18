public class Main {
    public static void main(String[] args) {
        System.out.println(countHi("ihihihihih"));
    }

    public static int countHi(String str) {
        return countHi(str, str.length() -1 );
    }

    public static int countHi(String str, int index){
        if(index <= 0) return 0;
        int count = 0;
        if(str.charAt(index) == 'i' && str.charAt(index -1) == 'h' ) count += 1;
        return countHi(str, index - 1) + count;
    }

}