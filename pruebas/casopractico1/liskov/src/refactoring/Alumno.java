package refactoring;

public class Alumno extends Persona implements Actividad {
    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Calificacion: " + calificacion);
    }

    @Override
    public void realizarExmaen() {
        System.out.println(getNombre() +  " está realizando un examen");
    }
}
