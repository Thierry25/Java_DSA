public class Main {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 5, 7, 11, 13, 17, 23, 31};
        System.out.println(binarySearch(list, 10));
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key){
        int low = 0;
        int high = list.length -1;
        while(low <= high){
            int middle = (low + high) / 2;
            if(list[middle] == key) return middle;
            else if(list[middle].compareTo(key) < 0) low = middle +1;
            else high = middle - 1;
        }
        return -1;
    }
}