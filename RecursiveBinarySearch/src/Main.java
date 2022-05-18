public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 12));
    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        return binarySearch(list, key, low, high);
    }

    public static int binarySearch(int[] list, int key, int low, int high){
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if(key < list[mid]) return binarySearch(list, key, low, mid - 1);
        if(key == list[mid]) return mid;
        return binarySearch(list, key, mid + 1, high);
    }
}