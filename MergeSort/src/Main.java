import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArr = new int[6];
        int i = 6;
        int k = 0;
        while(i > 0){
            testArr[k++] = i;
            i--;
        }

        mergeSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }

   public static void mergeSort(int[] arr){
        if(arr.length > 1){
            int[] firstHalf = new int[arr.length /2];
            System.arraycopy(arr, 0, firstHalf, 0, firstHalf.length);
            int[] secondHalf = new int[arr.length - arr.length /2];
            System.arraycopy(arr, arr.length/2, secondHalf, 0, secondHalf.length);
            mergeSort(firstHalf);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, arr);
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