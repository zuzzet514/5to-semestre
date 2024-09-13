package model;

public class Estudiante extends Usuario {

    private String matricula;
    private String semestre;


    public Estudiante(String nombre, String matricula, String correo, String telefono, String semestre) {
        super(nombre,correo, telefono);
        this.matricula = matricula;
        this.semestre = semestre;
    }

    public Estudiante(String matricula, String nombre, String correo) {
        super(nombre, correo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatricula: " + matricula;
    }
}
