public class Materia {
    private string nombre;
    private double calificacion;

    public Materia(string nombre) {
        this.nombre =  nombre;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }



}