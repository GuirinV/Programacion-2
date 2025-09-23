/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class ClienteRestaurante {
    private String nombre;
    private String telefono;
    
    // Constructor
    public ClienteRestaurante(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Método toString
    @Override
    public String toString() {
        return nombre + " (Tel: " + telefono + ")";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("CLIENTE:");
        System.out.println("   Nombre: " + nombre);
        System.out.println("   Telefono: " + telefono);
        System.out.println("---");
    }
}