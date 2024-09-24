public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado {
    private int horasTrabajadas;
    private int horasBase;

    public EmpleadoTiempoCompleto(String nombre, int id, double salario, int horasTrabajadas, int horasBase) {
        super(nombre, id, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.horasBase = horasBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasBase() {
        return horasBase;
    }

    public void setHorasBase(int horasBase) {
        this.horasBase = horasBase;
    }

    public double calcularSalario() {
        return (horasTrabajadas * this.getSalario() ) / this.horasBase;
    }

    @Override
    public double calcularIncentivo() {
        return this.calcularSalario() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras trabajadas: " + horasTrabajadas + "\nHoras base: " + horasBase + "\n";
    }
}
