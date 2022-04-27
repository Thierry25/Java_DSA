import java.util.Date;

public abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    private final Date dateCreated;


    public GeometricObject(){
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }


    public abstract double getArea();

    public abstract double getPerimeter();
}
