 public class Main {
    public static void main(String[] args) {
        System.out.println("hola");

        Maestro maistro = new Maestro();
        maistro.nombre = "Morales";
        maistro.mostrarNombre();
        maistro.mostrarId();

        Maestro.id++;

        Maestro maistro2 = new Maestro();
        maistro2.nombre = "Dr Nava";
        maistro2.mostrarNombre();
        maistro2.mostrarId();

        Maestro.id++;

        maistro.mostrarId();
    }
}