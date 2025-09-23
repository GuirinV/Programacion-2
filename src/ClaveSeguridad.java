/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    // Constructor
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    
    public String getUltimaModificacion() { return ultimaModificacion; }
    public void setUltimaModificacion(String ultimaModificacion) { 
        this.ultimaModificacion = ultimaModificacion; 
    }
    
    // Método para verificar clave
    public boolean verificarClave(String claveIngresada) {
        return this.codigo.equals(claveIngresada);
    }
    
    // Método para cambiar clave
    public void cambiarClave(String nuevaClave, String fechaModificacion) {
        this.codigo = nuevaClave;
        this.ultimaModificacion = fechaModificacion;
        System.out.println(" Clave actualizada el: " + fechaModificacion);
    }
    
    @Override
    public String toString() {
        return "ClaveSeguridad[***" + codigo.substring(codigo.length() - 2) + "] - Mod: " + ultimaModificacion;
    }
}
