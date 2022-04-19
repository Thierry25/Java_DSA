package com.company;

public class ClassDataArray {
    private Person[] persons;

    public ClassDataArray(int max) {
        this.persons = new Person[max];
    }

    public Person[] getPersons() {
        return persons;
    }

    public Person findLastName(String lastName){
        for(Person p: persons) if(p.getLastName().equals(lastName)) return p;
        return null;
    }
}
