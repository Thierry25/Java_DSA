package main;

public class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "ChoChorichoo!";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it, Boiled it, Barbecue it, Grilled it";
    }
}