public class Main {
    public static void main(String[] args) {
        Character guerrero = new Warrior("Mag", 100, 3, "Palmada aria");
        Character mago = new Wizard("bolita de fuego", "Merlin", 80,7);

        Warrior guerero1 = (Warrior) guerrero;

        guerrero.showStatusCharacter();
        mago.showStatusCharacter();

        guerero1.showStatusCharacter();
        guerero1.showStatusCharacter();

        // Character character = new Character();

    }
}