public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto chambeador = new EmpleadoTiempoCompleto("Juan", 101, 1500.0,150, 160);
        EmpleadoTiempoParcial chambeadorParcial = new EmpleadoTiempoParcial("Ana", 202, 18.0, 15);

        System.out.println(chambeador);
        System.out.println(chambeador.calcularSalario() + "\n");
        System.out.println(chambeadorParcial);
        System.out.println(chambeadorParcial.calcularSalario());

    }
}