package ui;

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
