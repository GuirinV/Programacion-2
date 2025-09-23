/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Referencia bidireccional
    
    // Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public Computadora getComputadora() {
        return computadora;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    // Método para establecer relación bidireccional
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        // Establecer referencia bidireccional
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
    // Método toString
    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("PROPIETARIO:");
        System.out.println("   Nombre: " + nombre);
        System.out.println("   DNI: " + dni);
        if (computadora != null) {
            System.out.println("   Computadora: " + computadora.getMarca() + " " + computadora.getNumeroSerie());
        } else {
            System.out.println("   Computadora: No asignada");
        }
        System.out.println("---");
    }
}