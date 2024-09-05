public class Maestro {
    //Atributos
    static int ID = 1;
    int id;
    String nombre;
    String especialidad;

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

}
