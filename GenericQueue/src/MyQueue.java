import java.util.LinkedList;

public class MyQueue<E>{
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E e){
        list.addLast(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public int size(){
        return getSize();
    }

    private int getSize() {
        return list.size();
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < getSize(); i++){
            result.append(list.get(i));
            if(i != getSize() -1) result.append(", ");
        }
        return result + "]";
    }
}
