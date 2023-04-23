package main.java.com.zaychikov.animals;

// Класс-наследник с переопределением методов

public class Bird extends Animal {

    private String type;
    private int hunger;

    public int getHunger() {
        return (int) (Math.random() * 6);
    }

    public Bird(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void greeting() {
        System.out.println("KAR!");
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
        System.out.println("Flying with wings.");
    }
}