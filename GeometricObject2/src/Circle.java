public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        this(1.0);
        setFilled(false);
        setColor("blue");
    }

    public Circle(double radius){
        this.radius = radius;
        setFilled(false);
        setColor("blue");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
