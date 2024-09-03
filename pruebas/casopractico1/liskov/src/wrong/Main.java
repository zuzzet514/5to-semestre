package wrong;

public class Main {
    public static void realizarActividades(Persona persona) {
        persona.realizarExamen();
    }
    public static void main(String[] args) {
        Persona alumno = new Alumno("Rick", 0);
        Persona maestro = new Maestro("jvergara", "introducción a la programación");

        realizarActividades(alumno);
        realizarActividades(maestro);

    }
}