public class EmpleadoTiempoParcial extends Empleado implements IEmpleado {

    private int horasPorSemana;

    public EmpleadoTiempoParcial(String nombre, int id, double salario, int horasPorSemana) {
        super(nombre, id, salario);
        this.horasPorSemana = horasPorSemana;
    }

    public double calcularSalario() {
        return 0.0;
    }

    @Override
    public void calcularIncentivo() {

    }
}
