package implement1;

import primero.Character;

public class Wizard implements Character {

    @Override
    public void attack() {
        System.out.println("primero.Wizard casts a fireball!");
    }

    @Override
    public void defend() {
        System.out.println("Wizar creates magical barrier!");
    }
}
