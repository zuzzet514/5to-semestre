public class EmpleadoTiempoParcial extends Empleado implements IEmpleado {
    // Variable privada que almacena las horas trabajadas por semana
    private int horasPorSemana;

    public EmpleadoTiempoParcial(String nombre, int id, double salario, int horasPorSemana) {
        // Llama al constructor de la clase base 'Empleado' para inicializar nombre, id y salario
        super(nombre, id, salario);
        this.horasPorSemana = horasPorSemana;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    // Méto-do que calcula el salario en función de las horas trabajadas por semana
    // Multiplica las horas trabajadas por el salario por hora
    public double calcularSalario() {
        return horasPorSemana * this.getSalario();
    }

    // Implementación del método calcularIncentivo de la interfaz IEmpleado
    // Calcula el incentivo como el 3% del salario calculado
    @Override
    public double calcularIncentivo() {
        return calcularSalario() * 0.03;
    }

    // Sobrescribe el mét-odo toString() para incluir la información específica de la clase
    @Override
    public String toString() {
        // Llama al mét-odo toString() de la clase base 'Empleado' y agrega las horas trabajadas por semana
        return super.toString() + "\nHoras: " + horasPorSemana + "\n";
    }
}
