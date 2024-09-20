package primero;

public class OrcFactory extends ConcreteCharacterFactory {

    @Override
    public Character createCharacter() {
        System.out.println("Orc created");
        return new Orc();
    }
}
