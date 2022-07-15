import java.util.Collection;

public interface MyList<E> extends Collection<E>{
    void add(int index, E e);
    E remove(int index);
    E get(int index);
    E set(int index, E e);
    int indexOf(Object e);
    int lastIndexOf(E e);

    @Override
    default boolean add(E e){
        add(size(), e);
        return true;
    }

    @Override
    default boolean isEmpty(){
        return size() == 0;
    }

    @Override
    default boolean remove(Object e){
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }else return false;
    }


    @Override
    default Object[] toArray() {
        return new Object[0];
    }

    @Override
    default  <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    default boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    default boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    default boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    default boolean retainAll(Collection<?> c) {
        return false;
    }
}