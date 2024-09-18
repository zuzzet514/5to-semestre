public class WizardFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Wizard();
    }
}
