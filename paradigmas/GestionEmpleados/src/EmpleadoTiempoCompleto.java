public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado {
    private int horasTrabajadas;

    public EmpleadoTiempoCompleto(String nombre, int id, double salario, int horasTrabajadas) {
        super(nombre, id, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        return 0.0;
    }

    @Override
    public void calcularIncentivo() {

    }
}
