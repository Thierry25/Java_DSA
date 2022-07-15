import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr){
        if(arr.length > 1){
            int[] firstPart = new int[arr.length / 2];
            System.arraycopy(arr, 0, firstPart, 0, firstPart.length);
            mergeSort(firstPart);

            int[] secondPart = new int[arr.length - arr.length / 2];
            System.arraycopy(arr, arr.length / 2, secondPart, 0, secondPart.length);
            mergeSort(secondPart);

            merge(firstPart, secondPart, arr);
        }
    }

    private static void merge(int[] first, int[] second, int[] temp){
        int firstIdx = 0, secondIdx = 0, tempIdx = 0;

        while(firstIdx < first.length && secondIdx < second.length){
            if(first[firstIdx] < second[secondIdx]){
                temp[tempIdx++] = first[firstIdx++];
            }else{
                temp[tempIdx++] = second[secondIdx++];
            }
        }

        while(firstIdx < first.length){
            temp[tempIdx++] = first[firstIdx++];
        }

        while(secondIdx < second.length){
            temp[tempIdx++] = second[secondIdx++];
        }
    }
}

