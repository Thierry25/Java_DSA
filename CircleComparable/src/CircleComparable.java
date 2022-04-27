public class CircleComparable extends GeometricObject implements Comparable<CircleComparable>{
    private double radius;

    public CircleComparable(){
        this(1.0);
    }

    public CircleComparable(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.radius == ((CircleComparable) obj).radius);
    }

    @Override
    public int compareTo(CircleComparable o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
