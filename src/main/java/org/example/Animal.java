package org.example;

public class Animal {
    private String name;
    private boolean dog;

    public Animal(String name, boolean dog) {
        this.name = name;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }
    public boolean isDog() {
        return dog;
    }

    public String toString() {
        return  name + " is a dog = " + dog; // to string Override?
    }
}



