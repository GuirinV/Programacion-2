/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Artista {
    private String nombre;
    private String genero;
    
    // Constructor
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    
    @Override
    public String toString() {
        return nombre + " (" + genero + ")";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("ARTISTA: " + nombre);
        System.out.println("Genero: " + genero);
    }
}