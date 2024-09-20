package ui;

import model.Maestro;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;
import static ui.UIMenu.*;

public class UIMaestro {

    public static AbstractList<Maestro> maestrosConTutorias = new ArrayList<>();

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
                    agregarTutoria();
                    break;
                case 2:
                    listarTutorias();
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

        boolean banderaExterna = false;
        do {
            System.out.println("Ingresa la fecha del curso: [dd/mm/yyyy]");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("Ingresa la hora del curso: [00:00]");
            String hora = sc.nextLine();

            boolean banderaInterna = true;
            do {
                System.out.println("La tutoria es: " + fecha + " " + hora);
                System.out.println("""
                1. para agregar tutoria
                2. para cambiar tutoria""");
                int respuesta = sc.nextInt();
                if (respuesta == 2) {
                    banderaInterna = false;
                } else if (respuesta == 1) {
                    banderaExterna = false;
                    banderaInterna = false;
                    maestroLogeado.addTutoriasDisponibles(fecha, hora);
                    consultarMaestroContutoria(maestroLogeado);
                } else {
                    System.out.println("Opcion no valida");
                }
            } while (banderaInterna);
        } while (banderaExterna);



    }

    private static void consultarMaestroContutoria(Maestro maestro) {
        if(!maestrosConTutorias.contains(maestro)) {
            maestrosConTutorias.add(maestro);
        }
    }

    public static void listarTutorias() {
        System.out.println("Listado de tutorias:");

        if (maestroLogeado.getTutoriasDisponibles().size() == 0) {
            System.out.println("No hay registros.\n");
        }
        //maestroLogeado.getTutoriasDisponibles().forEach(System.out::println);
        int j = 1;
        for (int i = 0; i < maestroLogeado.getTutoriasDisponibles().size(); i++) {
            System.out.println(j + ".-" + maestroLogeado.getTutoriasDisponibles().get(i).getFecha() + " " + maestroLogeado.getTutoriasDisponibles().get(i).getHora()+ "\n");
            j++;
        }

    }

}
