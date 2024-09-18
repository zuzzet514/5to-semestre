import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // D
        CharacterFactory factory = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your character type: (1) Warrior, (2) Wizard");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                factory = new WarriorFactory();
                break;
            case 2:
                factory = new WizardFactory();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        Character character = factory.createCharacter();

        character.attack();
        character.defend();
    }
}