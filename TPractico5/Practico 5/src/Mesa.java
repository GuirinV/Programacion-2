/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Mesa {
    private int numero;
    private int capacidad;
    
    // Constructor
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    // Getters
    public int getNumero() {
        return numero;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Mesa #" + numero + " (" + capacidad + " personas)";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("MESA:");
        System.out.println("   Numero: " + numero);
        System.out.println("   Capacidad: " + capacidad + " personas");
        System.out.println("---");
    }
    
    // Método para verificar si la mesa está disponible
    public boolean estaDisponible() {
        System.out.println("Verificando disponibilidad de " + this + "...");
        // Simulamos que siempre está disponible para este ejemplo
        return true;
    }
}