/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Usuario2 {
    private String nombre;
    private String email;
    
    // Constructor
    public Usuario2(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    @Override
    public String toString() {
        return nombre + " (" + email + ")";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" USUARIO: " + nombre);
        System.out.println("   Email: " + email);
    }
}