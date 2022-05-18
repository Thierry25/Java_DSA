public class Main {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(ar, 12));
    }

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int middle = (low + high) / 2;
            if(key < middle) high = middle -1;
            else if(key == middle) return middle;
            else low = middle + 1;
        }
        return -1;
    }
}