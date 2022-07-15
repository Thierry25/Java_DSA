import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() -1);
    }

    public E pop(){
        E toRemove = list.get(getSize() -1);
        list.remove(toRemove);
        return toRemove;
    }

    public void add(E e) {
        list.add(e);
    }

    private boolean isEmpty(){
        return getSize() == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = 0; i < getSize(); i++){
            stringBuilder.append(list.get(i));
            if(i != getSize() - 1) stringBuilder.append(", ");
        }
        return stringBuilder + "]";
    }
}
