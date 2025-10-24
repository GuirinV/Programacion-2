/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author veron
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para " + nombre + " (" + email + "): " + mensaje);
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}