package main.java.com.zaychikov.home_work_3.animals;

// Класс-наследник с переопределением методов

public class Cat extends Animal {

    private String color;
    private int hunger;

    public int getHunger() {
        return (int) (Math.random() * 6);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void greeting() {
        System.out.println("Meow!");
    }

    @Override
    public void feeding() {
        for (int i = 0; i < 1; i++) {
            if (getHunger() <= 3) {
                System.out.println("Please feed me");
            } else {
                System.out.println("Man, i'm not a hunger");
            }
        }
    }

    @Override
    public void move() {
        System.out.println("Walking on four legs.");
    }
}