package model;

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

    public void setTutoriasDisponibles(ArrayList<TutoriasDisponibles> tutoriasDisponibles) {
        this.tutoriasDisponibles = tutoriasDisponibles;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addTutoriasDisponibles(String fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    public ArrayList<TutoriasDisponibles> getCursosDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles extends CitaTutoria {

        public TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }
    }

    @Override
    public String toString() {

        return super.toString() + "\nno. de personal: " + numPersonal + "\ncursos disponibles: " + "\ncursos disponibles son: \n" + tutoriasDisponibles.toString();


    }
}
