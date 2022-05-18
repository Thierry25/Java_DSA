import java.util.ArrayList;

public class GenericStack<E>{
    private ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() -1);
    }

    public E pop(){
        E element = list.get(getSize() -1);
        list.remove(element);
        return element;
    }

    public void push(E element){
        list.add(element);
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }
}
