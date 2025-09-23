/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Contribuyente {
    private String nombre;
    private String cui;
    
    // Constructor
    public Contribuyente(String nombre, String cui) {
        this.nombre = nombre;
        this.cui = cui;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getCui() { return cui; }
    public void setCui(String cui) { this.cui = cui; }
    
    @Override
    public String toString() {
        return nombre + " (CUI: " + cui + ")";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" CONTRIBUYENTE: " + nombre);
        System.out.println(" CUI: " + cui);
    }
}