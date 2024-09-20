package primero;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
