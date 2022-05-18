import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//       List<Integer> list = new ArrayList<>();
//       list.add(2);
//       list.add(4);
//       list.add(6);
//       list.add(1);
//       list.add(28);
//       list.add(10);
//       list.add(3);
//       list.add(14);
//       list.add(5);
//        System.out.println(findLargest(list));
        int[] arr = {2, 4, 6, 1, 18, 10, 3, 14};
        System.out.println(findLargest(arr));

    }

//    public static int findLargest(List<Integer> list){
//        if(list.size() == 0) return 0;
//        return Math.max(list.get(0), findLargest(list.subList(1, list.size())));
//    }

    public static int findLargest(int[] arr){
        return findLargest(arr, arr.length -1);
    }

    public static int findLargest(int[] arr, int index){
        if(index < 0) return 0;
        return Math.max(arr[index], findLargest(arr, index -1));
    }
}