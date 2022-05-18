import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(3);
       list.add(5);
       list.add(7);
       list.add(9);
       list.add(11);
       list.add(1);
        System.out.println(removeDuplicates(list));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
       ArrayList<E> newList = new ArrayList<>();
       for(E data: list){
           if(!newList.contains(data)) newList.add(data);
       }
       return newList;
    }


}