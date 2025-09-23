/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Autor {
    private String nombre;
    private String nacionalidad;
    
    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    // Método toString para mostrar información
    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}