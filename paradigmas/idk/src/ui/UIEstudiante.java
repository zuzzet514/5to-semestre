package ui;
import ui.UIMaestro.*;

import java.util.Scanner;

public class UIEstudiante {
    public final static String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

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
                    agendarTutoria();
                case 2:
                    listarMisTutorias();
                case 0:
                    System.out.println("..:: Bye :.."); break;
                default:
                    System.out.println("Mayate");
            }
        } while (respuesta != 0);
    }

    private static void agendarTutoria() {
        System.out.println("Escoge un maestro: ");


    }

    private static void listarMisTutorias() {

    }
}
