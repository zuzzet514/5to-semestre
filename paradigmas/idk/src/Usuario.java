public abstract class Usuario extends Object {
    private String nombre;
    private String correo;
    private String telefono;

    public Usuario(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCorreo: " + correo;
    }


}
