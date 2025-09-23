/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;
    
    // Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getDuracionMin() { return duracionMin; }
    public void setDuracionMin(int duracionMin) { this.duracionMin = duracionMin; }
    
    @Override
    public String toString() {
        return nombre + " (" + duracionMin + " min)";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" PROYECTO: " + nombre);
        System.out.println("  Duracion: " + duracionMin + " minutos");
        System.out.println("  Tamanio estimado: " + calcularTamañoEstimado() + " GB");
    }
    
    // Método para calcular tamaño estimado
    private double calcularTamañoEstimado() {
        return duracionMin * 0.5; // 0.5 GB por minuto
    }
    
    // Método para verificar si el proyecto es largo
    public boolean esProyectoLargo() {
        return duracionMin > 30;
    }
}