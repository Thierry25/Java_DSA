import java.util.Collection;

public interface Tree<E> extends Collection<E> {
    boolean search(E e);
    boolean insert(E e);
    boolean delete(E e);
    int getSize();
    void inorder();
    void postorder();
    void preorder();
    boolean isEmpty();

    @Override
    default boolean contains(Object e){
        return search((E) e);
    }

    @Override
    default boolean add(E e){
        return insert(e);
    }

    @Override
    default boolean remove(Object e){
        return delete((E) e);
    }

    @Override
    default int size(){
        return getSize();
    }

    @Override
    default boolean containsAll(Collection<?> c){
        return false;
    }

    @Override
    default boolean addAll(Collection<? extends E> c){
        return false;
    }

    @Override
    default boolean removeAll(Collection<?> c){
        return false;
    }

    @Override
    default boolean retainAll(Collection<?> c){
        return false;
    }

    @Override
    default Object[] toArray(){
        return null;
    }

    @Override
    default <T> T[] toArray(T[] array){
        return null;
    }
}
