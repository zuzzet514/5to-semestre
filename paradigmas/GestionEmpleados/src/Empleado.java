public class Empleado {
    // Variables privadas que todos los empleados tienen
    private String nombre;
    private int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método sobrescrito para devolver una representación en forma de cadena
    // del objeto Empleado,
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nId: " + id + "\nSalario: " + salario;
    }
}
