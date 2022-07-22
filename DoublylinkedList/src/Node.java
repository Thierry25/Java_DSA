public class Node<E>{
    E element;
    Node<E> next;
    Node<E> previous;

    public Node(E element){
        this.element = element;
    }
}
