/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;            // Agregación
    private Conductor conductor;    // Asociación bidireccional
    
    // Constructor
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;         // Vehículo tiene un Motor (agregación)
        this.conductor = null;      // Inicialmente sin conductor
    }
    
    // Método para asignar conductor (bidireccional)
    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
        // Podríamos agregar lógica para que el conductor también conozca el vehículo
        // si quisiéramos una bidireccionalidad completa
    }
    
    // Método para remover conductor
    public void removerConductor() {
        this.conductor = null;
    }
    
    // Getters y Setters
    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }
    
    public Conductor getConductor() { return conductor; }
    
    @Override
    public String toString() {
        String infoConductor = (conductor != null) ? conductor.toString() : "Sin conductor asignado";
        return "Vehiculo: " + modelo + " - Patente: " + patente +
               "\n" + motor +
               "\nConductor: " + infoConductor;
    }
}