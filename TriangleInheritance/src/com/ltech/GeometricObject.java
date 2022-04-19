package com.ltech;

import java.util.Date;

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private final Date dateCreated;

    public GeometricObject(){
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
