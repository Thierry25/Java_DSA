import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());

        System.out.print("\nIs Peter in the tree? " + tree.search("Peter"));

        System.out.print("\nA path from the root to Peter is: ");
        ArrayList<Node<String>> path = tree.getPath("Peter");
        for(int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");

//        Integer[] numbers = {2,4,3,1,8,5,6,7};
//        BST<Integer> intTree = new BST<>(numbers);
//        System.out.print("\nInorder (sorted): ");
//        intTree.inorder();

        Integer[] numbers = {12,10,15,8,11,13,18,7,16,25,15,17,22,26,20,24,23,30};
        BST<Integer> intTree = new BST<>(numbers);
        intTree.delete(11);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();
        intTree.delete(8);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();
        intTree.delete(18);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();
        System.out.println("\nThe smallest element is " + intTree.getSmallest());
        System.out.println("The largest element is " + intTree.getLargest());
    }
}