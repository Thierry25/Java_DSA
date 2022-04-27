public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(10);

        // Display circle1
        System.out.println("\nCircle 1: ");
        System.out.println((circle1));

        // Display circle2
        System.out.println("\nCircle 2: ");
        System.out.println((circle2));

        // Display larger circle
        System.out.println("The larger of the two circles was " + Circle.max(circle1, circle2));

        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(4.2, 5);

        // Display rectangle 1
        System.out.println("\nRectangle 1: ");
        System.out.println((rectangle1));

        // Display circle2
        System.out.println("\nRectangle 2: ");
        System.out.println((rectangle2));

        // Display larger circle
        System.out.println(("\nThe larger of the two was " + GeometricObject.max(rectangle1, circle2)));
    }
}
