package main.java.com.zaychikov.animals;

import main.java.com.zaychikov.interfaces.CanClimb;

public class Monkey implements CanClimb {
    @Override
    public void climb() {
        System.out.println("Monkeys very good climbing trees with hands and feet.");
    }
}