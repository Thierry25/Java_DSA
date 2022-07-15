import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("America");
        System.out.println("(1) " + list);

        list.add(0, "Canada");
        System.out.println("(2) " + list);

        list.add("Russia");
        System.out.println("(3) " + list);

        list.addLast("France");
        System.out.println("(4) " + list);

        list.add(2, "Germany");
        System.out.println("(5) " + list);

        list.add(5, "Norway");
        System.out.println("(6) " + list);

        list.add(0, "Poland");
        System.out.println("(7) " + list);

        list.remove(0);
        System.out.println("(8) " + list);

        list.remove(2);
        System.out.println("(9) " + list);

        list.remove(list.size() - 1);
        System.out.println("(10) " + list + "\n(11)");

        for(String s: list){
            System.out.print(s.toUpperCase(Locale.ROOT) + " " );
        }

        System.out.println("\n(12) " + list.getFirst());
        System.out.println("(13) " + list.getLast());
        System.out.println("(14) " + list.indexOf("Russia"));
        System.out.println("(15) " + list.indexOf("America"));
        list.set(2, "Taiwan");
        System.out.println("(16) " + list);
        list.remove("America");
        System.out.println("(17) " + list);
        System.out.println("(18) "+ list.get(0));
        System.out.println("(18) "+ list.contains("France"));

    }
}