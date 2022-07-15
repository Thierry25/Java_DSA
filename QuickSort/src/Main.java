import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 8, 4, 0, 1, 6, 7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length -1);
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex){
        if(lowIndex >= highIndex) return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);

        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        swap(arr, leftPointer, highIndex);
        quickSort(arr, 0, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        return leftPointer;
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}