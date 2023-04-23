package main.java.com.zaychikov.animals;

// Абстрактный класс с приватными полями и методами

public abstract class Animal {
    private String name;
    private int age;
    private int hunger;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void greeting();

    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public abstract void feeding();

    public abstract void move();
}

