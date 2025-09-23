/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Titular10 {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Referencia bidireccional
    
    // Constructor
    public Titular10(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    
    public CuentaBancaria getCuenta() { return cuenta; }
    
    // Método para establecer relación bidireccional
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        // Establecer referencia bidireccional
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }
    
    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" TITULAR: " + nombre);
        System.out.println("    DNI: " + dni);
        if (cuenta != null) {
            System.out.println("    Cuenta: " + cuenta.getCbu());
            System.out.println("    Saldo: $" + cuenta.getSaldo());
        } else {
            System.out.println("   Sin cuenta asociada");
        }
    }
}