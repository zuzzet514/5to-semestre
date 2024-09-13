package ui;

import java.util.Scanner;
import static ui.UIMenu.*;

public class UIMaestro {
    public static void maestroMenu() {

        int respuesta = 0;

        System.out.println("..::Maestro::..");


        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1 Agregar cursos");
            System.out.println("2 Listar mis cursos");
            System.out.println("3 salir");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Agregar curso");
                    break;
                case 2:
                    System.out.println("Listar mis cursos");
                    break;
                case 3:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (respuesta != 3);


    }

    public static void agregarTutoria() {
        System.out.println("Agregar Tutoria:");
        System.out.println("Ingresa la fecha del curso: [dd/mm/yyyy]");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        System.out.println("Ingresa la hora del curso: [00:00]");
        String hora = sc.nextLine();
    }

    public static void listarCursos() {
        System.out.println("Listado de cursos:");
    }

}
