package main.java.com.zaychikov.animals;

// Класс-наследник с переопределением методов

public class Bird extends Animal {
    private String type;

    public Bird(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void greeting() {
        System.out.println("KAR!");
    }

    @Override
    public void move() {
        System.out.println("Flying with wings.");
    }
}