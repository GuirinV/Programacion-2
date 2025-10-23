/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author veron
 */
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    // Método abstracto para calcular sueldo
    public abstract double calcularSueldo();
    
    public String getNombre() {
        return nombre;
    }
}