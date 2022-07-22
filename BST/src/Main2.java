import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        printTree(tree);

        System.out.println("\nAfter deleting George");
        tree.delete("George");
        printTree(tree);

        System.out.println("\nAfter deleting Adam");
        tree.delete("Adam");
        printTree(tree);

        System.out.println("\nAfter deleting Michael");
        tree.delete("Michael");
        printTree(tree);

        for(String s: tree) System.out.print(s.toUpperCase(Locale.ROOT) + " ");
    }

    public static void printTree(BST<String> tree){
        System.out.print("Inorder (sorted)");
        tree.inorder();
        System.out.print("\nPostorder (sorted)");
        tree.postorder();
        System.out.print("\nPreorder (sorted)");
        tree.preorder();
        System.out.print("\nThe number of nodes is: " + tree.getSize());
        System.out.println();
    }
}
