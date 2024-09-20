package ui;
import model.Maestro;
import ui.UIMaestro.*;

import java.util.Scanner;

public class UIEstudiante {
    public final static String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void estudianteMenu() {
        int respuesta;

        do {
            System.out.println("..:: Estudiantes ::.. ");
            System.out.println("1. Agendar tutoría");
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
            }
        } while (respuesta != 0);
    }

    public static void agendarTutoria() {
        System.out.println("..:: Agendar Tutoria ::.. ");

        int respuestaConfirmacion = 0;
        do{
            System.out.println("Seleccione un maestro: ");
            int i = 1;
            for (Maestro maestro : UIMaestro.maestrosConTutorias){
                System.out.println(i + " " + maestro.getNombre());
                i++;
            }
            Scanner sc = new Scanner(System.in);
            int respuestaMaestro = sc.nextInt();

            Maestro maestroSeleccionado = UIMaestro.maestrosConTutorias.get(respuestaMaestro-1);

            System.out.println("Seleccione una tutoria:");
            i = 1;
            for (Maestro.TutoriasDisponibles td : maestroSeleccionado.getTutoriasDisponibles()){
                System.out.println(i + ".- " + td.getFecha() + " " + td.getHora());
                i++;
            }
            int tutoriaSeleccionado = sc.nextInt();

            do{
                System.out.println("Maestro: " + maestroSeleccionado.getNombre() + ", Tutoria: " +
                        maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionado-1));
                System.out.println("1.- Para continuar.\n2.- Cambiar tutoria. ");
                respuestaConfirmacion = sc.nextInt();
            }while (respuestaConfirmacion < 1 || respuestaConfirmacion > 2);

            if (respuestaConfirmacion == 1) {
                Maestro.TutoriasDisponibles ts = maestroSeleccionado
                        .getTutoriasDisponibles().get(tutoriaSeleccionado-1);
                UIMenu.estudianteLogeado.addTutoriaMaestro(maestroSeleccionado, ts.getDate(), ts.getHora());
            }
        }while (respuestaConfirmacion != 1);


    }

    private static void listarMisTutorias() {

    }
}
