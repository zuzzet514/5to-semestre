public class Wizard implements Character {

    @Override
    public void attack() {
        System.out.println("Wizard casts a fireball!");
    }

    @Override
    public void defend() {
        System.out.println("Wizar creates magical barrier!");
    }
}
