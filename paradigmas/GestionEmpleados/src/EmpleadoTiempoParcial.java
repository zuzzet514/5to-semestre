public class EmpleadoTiempoParcial extends Empleado implements IEmpleado {

    private int horasPorSemana;

    public EmpleadoTiempoParcial(String nombre, int id, double salario, int horasPorSemana) {
        super(nombre, id, salario);
        this.horasPorSemana = horasPorSemana;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    public double calcularSalario() {
        return horasPorSemana * this.getSalario();
    }

    @Override
    public double calcularIncentivo() {
        return calcularSalario() * 0.03;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras: " + horasPorSemana + "\n";
    }
}
