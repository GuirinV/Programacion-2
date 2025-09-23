/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación
    private Usuario usuario; // Asociación bidireccional
    
    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Método para establecer la batería (agregación)
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    // Getters y setters
    public String getImei() { 
        return imei; 
    }
    
    public void setImei(String imei) { 
        this.imei = imei; 
    }
    
    public String getMarca() { 
        return marca; 
    }
    
    public void setMarca(String marca) { 
        this.marca = marca; 
    }
    
    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    
    public Bateria getBateria() { 
        return bateria; 
    }
    
    public Usuario getUsuario() { 
        return usuario; 
    }
    
    public void setUsuario(Usuario usuario) { 
        this.usuario = usuario;
        // Establecer la referencia bidireccional
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    // Método para mostrar información del celular
    public void mostrarInformacion() {
        System.out.println("Celular: " + marca + " " + modelo);
        System.out.println("IMEI: " + imei);
        if (bateria != null) {
            System.out.println("Bateria: " + bateria.getModelo() + " - " + bateria.getCapacidad() + "mAh");
        }
        if (usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre() + " - DNI: " + usuario.getDni());
        }
    }
}