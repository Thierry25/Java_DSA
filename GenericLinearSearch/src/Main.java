public class Main {
    public static void main(String[] args) {
       String[] list = {"Haha", "Thierry", "Lol"};
        System.out.println(linearSearch(list, "lol"));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for(int i = 0; i < list.length; i++){
            if(list[i] == key) return i;
        }
        return -1;
    }
}