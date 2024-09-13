package ui;

import model.Maestro;
import model.Secretaria;
import model.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;














import static ui.UIEstudiante.*;
import static ui.UIMaestro.*;
import static ui.UISecretaria.*;

public class UIMenu {
    public static ArrayList<Maestro> maestros = new ArrayList<>();
    public static ArrayList<Secretaria> secretarias = new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static Maestro maestroLogeado;
    public static Estudiante estudianteLogeado;
    public static Secretaria secretariaLogeado;


    public static void mostrarMenu() {
        int respuesta;



        do {
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Seleccione una opcion:");

            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("3. Secretaria");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);

            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta) {
                case 1:
                    loginUsuario(1); break;
                case 2:
                    loginUsuario(2); break;
                case 3:
                    loginUsuario(3); break;
                case 0:
                    System.out.println("..::Bye::.."); break;
                default:
                    System.out.println("Por favor ingresa un opción válida");
            }
        } while (respuesta != 0);

    }

    public static void loginUsuario(int tipoUsuario) {


        boolean bandera= true;
        do {
            System.out.println("Ingresa tu correo:");
            Scanner sc = new Scanner(System.in);
            String correoUsuario = sc.nextLine();

            if (tipoUsuario == 1) {
                for (Maestro maestro : maestros) {
                    if (maestro.getCorreo().equals(correoUsuario)) {
                        // meastro con acceso
                        System.out.println("Hola maestro: " + maestro.getNombre());
                        maestroMenu();
                    }
                }
            }

            if (tipoUsuario == 2) {
                for (Estudiante estudiante : estudiantes) {
                    if (estudiante.getCorreo().equals(correoUsuario)) {
                        // estudiante con acceso
                        System.out.println("Hola estudiante: " + estudiante.getNombre());
                        estudianteMenu();
                    }
                }
            }

            if (tipoUsuario == 3) {
                for (Secretaria secretaria : secretarias) {
                    if (secretaria.getCorreo().equals(correoUsuario)) {
                        // secretaria con acceso
                        System.out.println("Hola secretaria: " + secretaria.getNombre());
                        secretariaMenu();
                    }
                }
            }
        } while (!bandera);


    }




}
