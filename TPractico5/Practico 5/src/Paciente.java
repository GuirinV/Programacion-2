/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Paciente {
    private String nombre;
    private String obraSocial;
    
    // Constructor
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getObraSocial() { return obraSocial; }
    public void setObraSocial(String obraSocial) { this.obraSocial = obraSocial; }
    
    @Override
    public String toString() {
        return nombre + " (" + obraSocial + ")";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("PACIENTE: " + nombre);
        System.out.println("  Obra Social: " + obraSocial);
    }
}
