package main.java.com.zaychikov.home_work_3.animals;

import main.java.com.zaychikov.home_work_3.interfaces.CanSwim;
import main.java.com.zaychikov.home_work_3.interfaces.LovelyEat;

import java.time.LocalTime;

public class Seal implements CanSwim, LovelyEat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Seal " + name + " said: " + "Seals is a good swimmers with flippers.");
    }

    @Override
    public void eat() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.parse(String.valueOf(LocalTime.of(6, 0)))) && currentTime.isBefore(LocalTime.of(22, 0))) {
            System.out.println("Time to eat fish!");
        } else {
            System.out.println("I want a sleep...");
        }
    }
}
