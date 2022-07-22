import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class BST<E> implements Tree<E>{

    private Node<E> root;
    private Comparator<E> c;
    private int size = 0;

    public BST(){
        this.c = (e1, e2) -> ((Comparable<E>) e1).compareTo(e2);
    }

    public BST(Comparator<E> c){
        this.c = c;
    }

    public BST(E[] elements){
        this.c = (e1, e2) -> ((Comparable<E>) e1).compareTo(e2);
        for(E e: elements) add(e);
    }

    @Override
    public boolean search(E e) {
        Node<E> current = root;

        while(current != null){
            if(c.compare(e, current.element) < 0){
                current = current.left;
            }else if(c.compare(e, current.element) > 0){
                current = current.right;
            }else return true;
        }
        return false;
    }

    @Override
    public boolean insert(E e) {
        if(root == null){
            root = createNewNode(e);
        }else{
            Node<E> current = root;
            Node<E> parent = null;

            while(current != null){
                if(c.compare(e, current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if(c.compare(e, current.element) > 0){
                    parent = current;
                    current = current.right;
                }else return false;
            }

            if(c.compare(e, parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);

        }
        size++;
        return true;
    }

    private Node<E> createNewNode(E e) {
        return new Node<>(e);
    }

    @Override
    public boolean delete(E e) {
        Node<E> current = root;
        Node<E> parent = null;

        while(current != null){
            if(c.compare(e, current.element) < 0){
                parent = current;
                current = current.left;
            }else if(c.compare(e, current.element) > 0){
                parent = current;
                current = current.right;
            }else break;
        }

        if(current == null) return false;

        // Case 1: Delete a leaf node
        if(current.left == null && current.right == null){
            if(c.compare(e, parent.element) < 0)
                parent.left = null;
            else
                parent.right = null;
        } // Case 2: Node has one child
        else if(current.left == null){
            if(c.compare(e, parent.element) < 0)
                parent.left = current.right;
            else
                parent.right = current.right;
        }else if(current.right == null){
            if(c.compare(e, parent.element) < 0)
                parent.left = current.left;
            else
                parent.right = current.left;
        }else{
            // Case 3: Node has two children
            Node<E> parentMaxOfLeftSubtree = current;
            Node<E> maxOfLeftSubtree = current.left;

            while(maxOfLeftSubtree.right != null){
                parentMaxOfLeftSubtree = maxOfLeftSubtree;
                maxOfLeftSubtree = maxOfLeftSubtree.right;
            }

            current.element = maxOfLeftSubtree.element;
            if(parentMaxOfLeftSubtree.right == maxOfLeftSubtree){
                parentMaxOfLeftSubtree.right = maxOfLeftSubtree.left;
            }else{
                parentMaxOfLeftSubtree.left = maxOfLeftSubtree.left;
            }
        }

        size--;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node<E> root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    @Override
    public void postorder() {
        postorder(root);
    }

    private void postorder(Node<E> root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    public ArrayList<Node<E>> getPath(E e){
        ArrayList<Node<E>> list = new ArrayList<>();

        Node<E> current = root;

        while(current != null){
            list.add(current);
            if(c.compare(e, current.element) < 0){
                current = current.left;
            }else if(c.compare(e, current.element) > 0){
                current = current.right;
            }else break;
        }

        return list;
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    private void preorder(Node<E> root){
        if(root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new InorderIterator();
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    public E getSmallest(){
        if(root == null) return null;

        Node<E> current = root;
        Node<E> parent = null;

        while(current != null) {
            parent = current;
            current = current.left;
        }

        return parent.element;
    }

    public E getLargest(){
        if(root == null) return null;

        Node<E> current = root;
        Node<E> parent = null;

        while(current != null) {
            parent = current;
            current = current.right;
        }

        return parent.element;
    }

    private class InorderIterator implements Iterator<E> {
        private ArrayList<E> list = new ArrayList<>();
        private int current = 0;

        public InorderIterator(){
            inorder();
        }

        private void inorder(){
            inorder(root);
        }

        private void inorder(Node<E> root){
            if(root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }

        @Override
        public boolean hasNext() {
            return current < list.size();
        }

        @Override
        public E next() {
            return list.get(current++);
        }
    }
}