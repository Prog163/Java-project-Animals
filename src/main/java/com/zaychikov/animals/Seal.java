package main.java.com.zaychikov.animals;

import main.java.com.zaychikov.interfaces.CanSwim;

public class Seal  implements CanSwim {

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

}
