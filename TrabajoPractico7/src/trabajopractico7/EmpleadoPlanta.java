/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author veron
 */
public class EmpleadoPlanta extends Empleado {
    private double bonoAntiguedad;
    
    public EmpleadoPlanta(String nombre, double salarioBase, double bonoAntiguedad) {
        super(nombre, salarioBase);
        this.bonoAntiguedad = bonoAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return salarioBase + bonoAntiguedad;
    }
}