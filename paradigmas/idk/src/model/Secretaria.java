package model;

import java.util.Date;

public class Secretaria extends Usuario {
    private String area;
    private String turno;

    public Secretaria(String nombre, String correo, String telefono, String area, String turno) {
        super(nombre, correo, telefono);
        this.area = area;
        this.turno = turno;
    }

    public Secretaria(String nombre, String correo, String area, String turno) {
        super(nombre, correo);
        this.area = area;
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Area " + area + "\nTurno " + turno;
    }

    public static class TutoriasDisponibles extends CitaTutoria {

        public TutoriasDisponibles(Date fecha, String hora) {
            super(fecha, hora);
        }
    }
}
