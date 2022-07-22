import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    public static final int INITIAL_SIZE = 16;
    private E[] data = (E[]) new Object[INITIAL_SIZE];
    private int size = 0;

    public MyArrayList() {
    }

    public MyArrayList(E[] elements) {
        for (E el : elements) add(el);
    }

    @Override
    public void add(int index, E e) {
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException(String.format("Index: %s, Size: %s", index, size));

        ensureCapacity();

        for(int i = size - 1; i >= index; i--){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
        if(size >= data.length){
            E[] newData = (E[]) new Object[size * 2 + 1];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E oldData = data[index];

        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
        return oldData;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException(String.format("Index: %s, Size: %s", index, size));
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    @Override
    public E set(int index, E e) {
        checkIndex(index);
        E oldData = data[index];
        data[index] = e;
        return oldData;
    }

    @Override
    public int indexOf(Object e) {
        for(int i = 0; i < size -1; i++){
            if(e.equals(data[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for(int i = size -1; i >= 0; i--){
            if(e.equals(data[i])) return i;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object e) {
        for(int i = 0; i < size -1; i++){
            if(e.equals(data[i])) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0 ; i < size; i++){
            result.append(data[i]);
            if(i != size -1) result.append(", ");
        }
        return result + "]";
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }


    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    private class MyArrayListIterator implements Iterator<E> {
        private int current = 0;
        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public E next() {
            return data[current++];
        }
    }
}