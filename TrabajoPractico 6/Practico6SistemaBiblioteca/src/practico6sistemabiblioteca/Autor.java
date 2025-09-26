/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6sistemabiblioteca;

/**
 *
 * @author veron
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public void mostrarInfo() {
        System.out.println("==========================================");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("==========================================");
    }
    
    // GETTERS
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    
    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}