/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Profesional {
    private String nombre;
    private String especialidad;
    
    // Constructor
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    
    @Override
    public String toString() {
        return "Dr./Dra. " + nombre + " - " + especialidad;
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("PROFESIONAL: " + nombre);
        System.out.println("   Especialidad: " + especialidad);
    }
    
    // Método para realizar diagnóstico
    public void realizarDiagnostico(Paciente paciente) {
        System.out.println(" Realizando diagnostico a " + paciente.getNombre());
        System.out.println("   Profesional: " + nombre + " (" + especialidad + ")");
        System.out.println("    Diagnostico en proceso...");
    }
}