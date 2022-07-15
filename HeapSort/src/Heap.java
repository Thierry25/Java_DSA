import java.util.ArrayList;
import java.util.Comparator;

public class Heap<E> {
    private ArrayList<E> list = new ArrayList<>();
    private Comparator<E> c;

    public Heap(){
        this.c = (e1, e2) -> ((Comparable) e1).compareTo(e2);
    }

    public Heap(E[] elements){
        this.c = (e1, e2) -> ((Comparable) e1).compareTo(e2);
        for(E el: elements){
            add(el);
        }
    }

    private void add(E e) {
        list.add(e);
        int currentIndex = list.size() -1;

        while(currentIndex > 0){
            int parentIndex = (currentIndex - 1) / 2;
            if(c.compare(list.get(currentIndex), list.get(parentIndex)) > 0){
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }else break;
            currentIndex = parentIndex;
        }
    }
    // Remove root
    private E remove(){
        E toRemove = list.get(0);
        list.set(0, list.get(list.size() -1));
        list.remove(list.size() -1);

        int currentIndex = 0;
        while(currentIndex < list.size()) {
            int leftChildIndex = (2 * currentIndex) + 1;
            int rightChildIndex = (2 * currentIndex) + 2;

            if (leftChildIndex >= list.size()) break;
            int maxIndex = leftChildIndex;

            if(rightChildIndex < list.size()){
                if(c.compare(list.get(maxIndex), list.get(rightChildIndex)) < 0){
                    maxIndex = rightChildIndex;
                }
            }

            if(c.compare(list.get(maxIndex), list.get(currentIndex)) >0){
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
            }else break;
        }
        return toRemove;
    }
}


