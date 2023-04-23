package main.java.com.zaychikov.animals;

import main.java.com.zaychikov.interfaces.CanSwim;

public class Seal  implements CanSwim {
    @Override
    public void swim() {
        System.out.println("Seals is a good swimmers with flippers.");
    }
}
