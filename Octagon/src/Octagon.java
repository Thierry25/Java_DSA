public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{

    private double side;

    public Octagon(){
        this(0);
    }

    public Octagon(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2)) * this.side * this.side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
