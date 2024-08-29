public class Maestro {
    //Atributos
    static int id;
    String nombre;
    String especialidad;

    public Maestro() {
        System.out.println("hola yo me ejecuté primero");
        id++;
    }

    // comportamientos métodos
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public void mostrarId() {
        System.out.println("ID:"+ id);
    }

}
