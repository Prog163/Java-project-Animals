package main.java.com.zaychikov.home_work_3.animals;

// Класс-наследник с переопределением методов

public class Dog extends Animal {

    private String breed;
    private int hunger;

    public int getHunger() {
        return (int) (Math.random() * 6);
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void greeting() {
        System.out.println("Woof woof!");
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
        System.out.println("Running on the street with other dogs.");
    }
}
