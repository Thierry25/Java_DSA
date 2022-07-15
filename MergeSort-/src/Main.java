import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10,9, 8, 7, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
            mergeSort(firstHalf);

            int[] secondHalf = new int[list.length - list.length / 2];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalf.length);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }

    }

    public static void merge(int[] firstHalf, int[] secondHalf, int[] original){
        int first = 0;
        int second = 0;
        int ori = 0;

        while(first < firstHalf.length && second < secondHalf.length){
            if(firstHalf[first] < secondHalf[second]) original[ori++] = firstHalf[first++];
            else original[ori++] = secondHalf[second++];
        }

        while(first < firstHalf.length) original[ori++] = firstHalf[first++];
        while(second < secondHalf.length) original[ori++] = secondHalf[second++];
    }
}