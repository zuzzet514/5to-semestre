package wrong;

public class Alumno extends Persona {
    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void mostarInfo() {
        super.mostrarInfo();
        System.out.println("Calificacion: " + calificacion);
    }

    public void realizarExamen() {
        System.out.println(getNombre() + "está realizando un examen");
    }
}
