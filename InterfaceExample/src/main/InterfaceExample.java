package main;

public class InterfaceExample {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        for (Object object : objects) {
            if (object instanceof Edible) System.out.println(((Edible) object).howToEat());
            if (object instanceof Animal) System.out.println(((Animal) object).sound());
        }
    }



}
