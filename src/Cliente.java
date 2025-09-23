/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Referencia bidireccional
    
    // Constructor
    public Cliente(String nombre, String dni) {
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
    
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    // Método para establecer relación bidireccional
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        // Establecer referencia bidireccional
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }
    
    // Método toString
    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
    
    // Método para mostrar información del cliente
    public void mostrarInformacion() {
        System.out.println("CLIENTE: " + nombre);
        System.out.println("DNI: " + dni);
        if (tarjeta != null) {
            System.out.println("Tarjeta: " + tarjeta.getNumero());
        } else {
            System.out.println("Tarjeta: No asignada");
        }
        System.out.println("---");
    }
}