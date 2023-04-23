package main.java.com.zaychikov.animals;

// Класс-наследник с переопределением методов

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void greeting() {
        System.out.println("Woof woof!");
    }

    @Override
    public void move() {
        System.out.println("Running on the street with other dogs.");
    }
}
