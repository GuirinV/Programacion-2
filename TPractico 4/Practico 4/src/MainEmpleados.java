/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */

public class MainEmpleados {
    public static void main(String[] args) {
        // Crear empleados con ambos constructores
        Empleado e1 = new Empleado(1, "Juan Lopez", "Gerente", 80000);
        Empleado e2 = new Empleado("Juan Perez", "Analista");
        Empleado e3 = new Empleado("Veronica Guirin", "Desarrollador");

        // Aplicar métodos sobrecargados
        e2.actualizarSalario(10); // aumento del 10%
        e3.actualizarSalario(5000); // aumento fijo

        // Mostrar información
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
