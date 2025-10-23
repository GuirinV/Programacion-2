/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author veron
 */
public class EmpleadoTemporal extends Empleado {
    private double horasExtras;
    private double pagoPorHoraExtra;
    
    public EmpleadoTemporal(String nombre, double salarioBase, 
                           double horasExtras, double pagoPorHoraExtra) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }
    
    @Override
    public double calcularSueldo() {
        return salarioBase + (horasExtras * pagoPorHoraExtra);
    }
}