import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escoge una opción: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Saliendo"); break;
            }

            System.out.println("Ingresa un valor: ");
            int num1 = sc.nextInt();
            System.out.println("Ingresa otro valor: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1: calc.setOperation(new BasicOperations.Addition()); break;
                case 2: calc.setOperation(new BasicOperations.Subtraction()); break;
                case 3: calc.setOperation(new BasicOperations.Multiplication()); break;
                case 4: calc.setOperation(new BasicOperations.Division()); break;
                case 5: break;
                default:
                    System.out.println("Opción invalida"); break;
            }
        }
    }
}