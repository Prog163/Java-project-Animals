package main.java.com.zaychikov.animals;

// Класс-наследник с переопределением методов

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void greeting() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("Walking on four legs.");
    }
}