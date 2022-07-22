import java.util.Iterator;

public class DoublyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(E[] elements) {
        for (E el : elements) add(el);
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head.previous = newNode;
        head = newNode;

        size++;
        if (tail == null) tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;

        size++;
        if (head == null) head = tail;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index == size - 1) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            Node<E> newNode = new Node<>(e);
            current.next = newNode;
            newNode.previous = current;
            newNode.next = temp;
            temp.previous = newNode;

            size++;
        }
    }

    public E removeFirst() {
        if (size < 0) return null;

        Node<E> toRemove = head;
        head = toRemove.next;
        toRemove.next = null;
        head.previous = null;

        size--;
        return toRemove.element;
    }

    public E removeLast() {
        if (size < 0) return null;
        Node<E> toRemove = tail;
        tail = toRemove.previous;
        tail.next = null;
        toRemove.previous = null;

        size--;
        return toRemove.element;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node<E> toRemove = current.next;
        current.next = toRemove.next;
        toRemove.next.previous = current;
        toRemove.next = null;
        toRemove.previous = null;

        size--;
        return toRemove.element;
    }

    public E getFirst() {
        if (size < 0) return null;
        return head.element;
    }

    public E getLast() {
        if (size < 0) return null;
        return tail.element;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) return null;
        if(index == 0) return getFirst();
        if(index == size - 1) return getLast();

        Node<E> current = head;
        for(int i = 1; i <= index; i++){
            current = current.next;
        }
        return current.element;
    }

    @Override
    public E set(int index, E e) {
        if(index < 0 || index >= size) return null;
        Node<E> current = head;
        for(int i = 1 ; i <= index; i++){
            current = current.next;
        }
        E oldData = current.element;
        current.element = e;
        return oldData;
    }

    @Override
    public int indexOf(Object e) {
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(e.equals(current.element)) return i;
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        int index = -1;
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(e.equals(current.element)) index = i;
            current = current.next;
        }
        return index;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object e) {
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(e.equals(current.element)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedListIterator();
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    private class DoublyLinkedListIterator implements Iterator<E> {
    }
}
