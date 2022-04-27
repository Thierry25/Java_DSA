public class Rectangle extends GeometricObject{
    private double length;
    private double width;

    public Rectangle(){
        this(1.0, 1.0);
        setColor("white");
        System.out.println("Created on " + getDateCreated());
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Created on " + getDateCreated());
        setColor("black");
        setFilled(true);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length * this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
