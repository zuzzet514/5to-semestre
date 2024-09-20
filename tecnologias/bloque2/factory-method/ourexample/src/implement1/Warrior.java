package implement1;

import primero.Character;

public class Warrior implements Character {

    @Override
    public void attack() {
        System.out.println("primero.Warrior attacks with a sword!");
    }

    @Override
    public void defend() {
        System.out.println("primero.Warrior block with a shield!");
    }
}



