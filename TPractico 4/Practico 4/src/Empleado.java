
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // Salario por defecto
    }

    // Método sobrecargado: porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Método sobrecargado: cantidad fija
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // Método toString
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario;
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
