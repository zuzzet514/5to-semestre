public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto chambeador = new EmpleadoTiempoCompleto("Juan", 101, 1500.0,160, 160);
        EmpleadoTiempoParcial chambeadorParcial = new EmpleadoTiempoParcial("Ana", 202, 18.0, 15);

        System.out.println(chambeador);
        System.out.println("El salario de " + chambeador.getNombre()+ " es $" + chambeador.calcularSalario() + " con un incentivo de $"
                + chambeador.calcularIncentivo()+"\n");

        System.out.println(chambeadorParcial);
        System.out.println("El salario de " + chambeadorParcial.getNombre()+ " es $" + chambeadorParcial.calcularSalario()
                + " con un incentivo de $" + chambeadorParcial.calcularIncentivo() + "\n");


        EmpleadoTiempoCompleto milo = new EmpleadoTiempoCompleto("Milo", 514, 3500.55, 241, 250);
        System.out.println(milo.getNombre() + " debe trabajar " + milo.getHorasBase() + " horas al mes para ganar $" + milo.getSalario() +
                ". Este mes trabajó " + milo.getHorasTrabajadas() + " horas por lo que tiene $" + milo.calcularSalario() +
                " de salario y $" + milo.calcularIncentivo() + " de incentivo\n");

        EmpleadoTiempoParcial rosa = new EmpleadoTiempoParcial("Rosa", 921, 35, 20);
        System.out.println(rosa.getNombre() + " gana $" + rosa.getSalario() + " por hora. Trabaja " + rosa.getHorasPorSemana() +
                " horas a la semana por lo que tiene $" + rosa.calcularSalario() +
                " de salario y $" + rosa.calcularIncentivo() + " de incentivo");

    }
}