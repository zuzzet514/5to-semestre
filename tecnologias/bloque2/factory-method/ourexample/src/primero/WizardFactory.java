package primero;


public class WizardFactory extends ConcreteCharacterFactory {
    @Override
    public Character createCharacter() {
        System.out.println("Wizard created");
        return new Wizard();
    }
}
