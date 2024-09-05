package ui;
import java.util.Scanner;

public class UIMenu {

    public final static String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void mostrarMenu() {
        int respuesta;


        do {
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Seleccione una opcion:");

            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("3. Salir");

            Scanner sc = new Scanner(System.in);

            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta) {
                case 1:
                    System.out.println("..:: Maestros ::.. "); break;
                case 2:
                    estudianteMenu(); break;
                case 3:
                    System.out.println("..:: Bye ::.."); break;
                default:
                    System.out.println("Mayate");
            }
        } while (respuesta != 3);
    }

    public static void estudianteMenu() {
        int respuesta;

        do {
            System.out.println("..:: Estudiantes ::.. ");
            System.out.println("1. Angendar tutoría");
            System.out.println("2. Mis tutorías");
            System.out.println("0. Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta) {
                case 1:
                    System.out.println("..:: Agnedar tutoría ::..");
                    for (String s: MESES) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Mis tutorías"); break;
                case 0:
                    System.out.println("..:: Cancelar :.."); break;
                default:
                    System.out.println("Mayate");
            }
        } while (respuesta != 0);
    }
}
