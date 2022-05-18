import java.util.ArrayList;

public class GenericStack <E> extends ArrayList<E> {

    public boolean isEmpty(){
        return size() == 0;
    }

    public int getSize(){
        return size();
    }

    public E peek(){
        return super.get(getSize() -1);
    }

    public void push(E data){
        super.add(data);
    }

    public E pop(){
       E data = super.get(getSize() -1);
       super.remove(data);
       return data;
    }
}

