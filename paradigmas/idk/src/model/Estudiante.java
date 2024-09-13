package model;

public class Estudiante extends Usuario {

    String matricula;

    public Estudiante(String nombre, String matricula, String correo, String telefono) {
        super(nombre,correo, telefono);
        this.matricula = matricula;
    }

    public Estudiante(String matricula, String nombre, String correo) {
        super(nombre, correo);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatricula: " + matricula;
    }
}
