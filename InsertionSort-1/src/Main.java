import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        insertionSort(new int[]{10, 9, 8, 7, 18, 1, 0});
    }

    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
        System.out.println(Arrays.toString(list));
    }
}