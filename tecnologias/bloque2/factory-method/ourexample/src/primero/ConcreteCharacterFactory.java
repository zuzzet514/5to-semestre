package primero;

public class ConcreteCharacterFactory {
    public Character createCharacter() {
        System.out.println("Warrior created!");
        return new Warrior();
    }
}
