import java.util.ArrayList;
import java.util.Date;

public class Maestro {
    //Atributos
    private static int ID = 1;
    private int id;
    private String nombre;
    private String especialidad;

    public Maestro() {
        System.out.println("hola yo me ejecuté primero");
        this.id = ID++;
        id++;
    }

    // comportamientos métodos
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public void mostrarId() {
        System.out.println("ID:"+ id);
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Maestro.ID = ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public static class TutoriasDisponibles {
        private int id;
        private Date fecha;
        private String hora;

        public TutoriasDisponibles(int id, Date fecha, String hora) {
            this.id = id;
            this.fecha = fecha;
            this.hora = hora;
        }
    }

}
