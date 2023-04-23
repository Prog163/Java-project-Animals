package main.java.com.zaychikov;

import main.java.com.zaychikov.animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog("Big Boy", 3, "Labrador"));
        zoo.add(new Cat("Potato", 5, "Brown"));
        zoo.add(new Bird("Mike", 2, "Raven"));

        for (Animal animal : zoo) {
            animal.greeting();
            animal.speak();
            animal.move();
            animal.feeding();
            System.out.println();
        }

        Seal seal = new Seal();
        Monkey monkey = new Monkey();
        seal.swim();
        System.out.println();
        monkey.climb();
    }
}
