package com.ltech;

public class Equation {

    private double a, b, c;

    public Equation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1(){
        if(getDiscriminant() > 0){
            return ((this.b * -1) - (Math.sqrt(getDiscriminant())) / (2 * a));
        }else if(getDiscriminant() == 0){
            return ((this.b * -1) - 2 * a);
        }
        return 0;
    }
    public double getRoot2(){
        if(getDiscriminant() > 0){
            return ((this.b * -1) + (Math.sqrt(getDiscriminant())) / (2 * a));
        }else if(getDiscriminant() == 0) return getRoot1();
        return 0;
    }
}
