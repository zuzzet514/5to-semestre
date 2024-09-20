package primero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        CharacterFactory factory = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your character type: (1) primero.Warrior, (2) primero.Wizard");
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

         */

        /*
        MyCharacterFactory factory = new MyCharacterFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a charcter: ");
        int choice = sc.nextInt();

        Character c = factory.createCharacter(choice);
        c.attack();

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a character:");
        int choice = sc.nextInt();
        ConcreteCharacterFactory factory = null;
        switch (choice) {
            case 1:
                factory = new ConcreteCharacterFactory();
                break;
            case 2:
                factory = new WizardFactory();
                break;
            case 3:
                factory = new OrcFactory();
                break;
            default:
                factory = new ConcreteCharacterFactory();
        }

        factory.createCharacter();

    }
}