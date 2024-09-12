public class Estudiante extends Usuario {

    String matricula;

    public Estudiante(String nombre, String matricula, String correo, String telefono) {
        super(nombre,correo, telefono);
        this.matricula = matricula;
    }
}
