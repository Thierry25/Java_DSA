package main;

public abstract class Fruit implements Edible {
    public String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    // Define an abstract method here if needed
}
