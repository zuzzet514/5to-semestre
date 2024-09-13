package model;

import java.util.Date;

public class CitaMestro implements IAgendandable {

    private int id;
    private Maestro maetsro;
    private Estudiante estudiante;
    private Date fecha;
    private String hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Maestro getMaetsro() {
        return maetsro;
    }

    public void setMaetsro(Maestro maetsro) {
        this.maetsro = maetsro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
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
    public void agendar(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
}
