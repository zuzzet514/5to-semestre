package primero;

public class WarriorFactory extends ConcreteCharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}


