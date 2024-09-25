public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado {
    // variables privadas que todos los empleados de tiempo completo tienen
    private int horasTrabajadas; // Horas trabajadas por el empleado
    private int horasBase; // Horas base (ej. 160 horas al mes)


    public EmpleadoTiempoCompleto(String nombre, int id, double salario, int horasTrabajadas, int horasBase) {
        super(nombre, id, salario); // Llama al constructor de la clase base 'Empleado' para inicializar nombre, id y salario
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

    // hace una regla de 3 para calcular el salario en base a las horas trabajadas y las horas base
    public double calcularSalario() {
        return (horasTrabajadas * this.getSalario()) / this.horasBase;
    }

    // Implementación del método calcularIncentivo de la interfaz IEmpleado
    // Calcula el incentivo como el 5% del salario calculado
    @Override
    public double calcularIncentivo() {
        return this.calcularSalario() * 0.05;
    }

    // Sobrescribe el méto-do toString() para incluir la información específica de la clase
    @Override
    public String toString() {
        /* Llama al méto-do toString() de la clase padre 'Empleado' y agrega las horas trabajadas y horas base */
        return super.toString() + "\nHoras trabajadas: " + horasTrabajadas + "\nHoras base: " + horasBase + "\n";
    }
}
