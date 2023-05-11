package main.java.com.zaychikov.home_work_3.animals;

import main.java.com.zaychikov.home_work_3.interfaces.CanClimb;
import main.java.com.zaychikov.home_work_3.interfaces.LovelyEat;

import java.time.LocalTime;

public class Monkey implements CanClimb, LovelyEat {

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

    @Override
    public void eat() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.parse(String.valueOf(LocalTime.of(6, 0)))) && currentTime.isBefore(LocalTime.of(22, 0))) {
            System.out.println("Time to eat banana!");
        } else {
            System.out.println("I want a sleep...");
        }
    }
}