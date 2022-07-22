import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1,1,0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){
        if(arr.length > 1){
            int[] firstPart = new int[arr.length / 2]; //{10,9,8,7,6,5}
            System.arraycopy(arr, 0, firstPart, 0, firstPart.length);
            mergeSort(firstPart);

            int[] secondPart = new int[arr.length - arr.length / 2];
            System.arraycopy(arr, arr.length / 2, secondPart, 0, secondPart.length);
            mergeSort(secondPart);

            merge(firstPart, secondPart, arr);
        }
    }

    private static void merge(int[] firstPart, int[] secondPart, int[] arr) {
        int firstIdx = 0, secondIdx = 0, arrIdx = 0;

        while(firstIdx < firstPart.length && secondIdx < secondPart.length){
            if(firstPart[firstIdx] < secondPart[secondIdx]){
                arr[arrIdx++] = firstPart[firstIdx++];
            }else{
                arr[arrIdx++] = secondPart[secondIdx++];
            }
        }

        while(firstIdx < firstPart.length){
            arr[arrIdx++] = firstPart[firstIdx++];
        }
        while(secondIdx < secondPart.length)
            arr[arrIdx++] = secondPart[secondIdx++];
    }

}

