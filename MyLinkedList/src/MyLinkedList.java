import java.util.Iterator;
public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(E[] elements) {
        for (E el : elements) add(el);
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;

        size++;
        if (tail == null) tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        tail.next = newNode;
        tail = newNode;

        size++;
        if (head == null) head = tail;
    }

    @Override
    public void add(int index, E e) {
        if (index < 0) return;
        else if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            Node<E> newNode = new Node<>(e);
            current.next = newNode;
            newNode.next = temp;

            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) return null;
        Node<E> toRemove = head;
        head = toRemove.next;
        toRemove.next = null;

        size--;
        // if(head == null) tail = null;
        return toRemove.element;
    }

    public E removeLast() {
        if (size == 0) return null;
        E toRemove = tail.element;
        Node<E> current = head;
        for (int i = 1; i < size - 1; i++) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
        return toRemove;
    }

    @Override
    public E remove(int index) {
        if (index < 0) return null;
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node<E> toRemove = current.next;
        current.next = toRemove.next;
        toRemove.next = null;
        size--;
        return toRemove.element;
    }

    public E getFirst() {
        if (size < 0) return null;
        return head.element;
    }

    public E getLast(){
        if(size < 0) return null;
        return tail.element;
    }

    @Override
    public E get(int index) {
        if(index < 0) return null;
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
        if(index < 0) return null;

        Node<E> current = head;
        for(int i = 1; i <= index; i++){
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
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            //assert current != null;
            result.append(current.element);
            current = current.next;
            result.append(current != null ? ", " : "]");
        }
        return result.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    private class MyLinkedListIterator implements Iterator<E> {
        private Node<E> current;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }
    }
}


/*
public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(E[] el) {
        for (E e : el) add(e);
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;

        size++;
        if (tail == null) tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        tail.next = newNode;
        tail = newNode;

        size++;
        if (head == null) head = tail;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            Node<E> newNode = new Node<>(e);
            current.next = newNode;
            newNode.next = temp;

            size++;
        }

    }

    public E getFirst() {
        if (size == 0) return null;
        return head.element;
    }

    public E getLast() {
        if (size == 0) return null;
        return tail.element;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) return null;
        if (index == 0) return getFirst();
        if (index == size - 1) return getLast();
        //1
        Node<E> current = head;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public E removeFirst() {
        if (size == 0) return null;

        Node<E> current = head;
        head = current.next;
        current.next = null;
        size--;
        return current.element;
    }

    public E removeLast() {
        if (size == 0) return null;

        E oldData = tail.element;
        Node<E> current = head;
        for(int i = 1; i < size -1; i++){
            current = current.next;
        }
        tail = current;
        current.next = null;
        size--;

        return oldData;
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index >= size) return null;
        if(index == 0) return removeFirst();
        if(index == size -1) return removeLast();

        Node<E> current = head;
        for(int i = 1; i < index; i++){
            current = current.next;
        }
        // This is the node that we need to remove
        Node<E> toRemove = current.next;
        current.next = toRemove.next;
        toRemove.next = null;

        size--;
        return toRemove.element;
    }

    @Override
    public E set(int index, E e) {
        if(index < 0 || index >= size) return null;
        Node<E> current = head;
        for(int i = 1; i <= index; i++){
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
    public boolean contains(Object o) {
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(o.equals(current.element)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            result.append(current.element);
            current = current.next;
            if(current != null) {
                result.append(", ");
            }else {
                result.append("]");
            }
        }
        return result.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public void clear() {

    }

    private class MyLinkedListIterator implements Iterator<E> {
        private Node<E> current = head;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }
    }
}
*/