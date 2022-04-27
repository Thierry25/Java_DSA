public class Main {
    public static void main(String[] args) {
        CircleComparable circleComparable = new CircleComparable(10);
        CircleComparable circleComparable1 = new CircleComparable(11);

        System.out.println(circleComparable1.equals(circleComparable));
        System.out.println(circleComparable.getArea());
        System.out.println(circleComparable1.getArea());
    }
}
