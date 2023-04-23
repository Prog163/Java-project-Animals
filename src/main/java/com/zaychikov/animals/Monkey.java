package main.java.com.zaychikov.animals;

import main.java.com.zaychikov.interfaces.CanClimb;

public class Monkey implements CanClimb {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void climb() {
        System.out.println("Monkey " + name + " said: " + "Monkeys very good climbing trees with hands and feet.");
    }
}