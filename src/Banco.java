/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Banco {
    private String nombre;
    private String cuit;
    
    // Constructor
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getCuit() {
        return cuit;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    // Método toString
    @Override
    public String toString() {
        return nombre + " (CUIT: " + cuit + ")";
    }
    
    // Método para mostrar información del banco
    public void mostrarInformacion() {
        System.out.println("BANCO: " + nombre);
        System.out.println("CUIT: " + cuit);
        System.out.println("---");
    }
}