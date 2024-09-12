import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario {
    //Atributos

    private int numPersonal;
    private String especialidad;

    public Maestro(String nombre, String correo, int numPersonal) {
        super(nombre, correo);
        this.numPersonal = numPersonal;
    }

    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }

    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public void setTutoriasDisponibles(ArrayList<TutoriasDisponibles> tutoriasDisponibles) {
        this.tutoriasDisponibles = tutoriasDisponibles;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addTutoriasDisponibles(Date fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    public ArrayList<TutoriasDisponibles> getCursosDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles {
        private int id;
        private Date fecha;
        private String hora;

        public TutoriasDisponibles(Date fecha, String hora) {
            this.id = id;
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        @Override
        public String toString() {
            return "Fecha:  " + this.fecha + " Hora: " + this.hora + "\n";
        }
    }

    @Override
    public String toString() {

        return super.toString() + "\nno. de personal: " + numPersonal + "\ncursos disponibles: " + "\ncursos disponibles son: \n" + tutoriasDisponibles.toString();


    }
}
