import java.util.Date;

public class House implements Cloneable, Comparable<House>{
    private final int id;
    private final double area;
    private final Date whenBuilt;

    public House(int id, double area){
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone(){
        try{
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(House o) {
        return getArea() > o.getArea() ? 1 : (getArea() < o.getArea() ? -1 : 0);
    }
}
