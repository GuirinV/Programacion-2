/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;  // Composición
    private Propietario propietario; // Asociación bidireccional
    
    // Constructor con composición
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); // Composición: creación interna
    }
    
    // Método para establecer relación bidireccional
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        // Establecer referencia bidireccional
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    // Método para mostrar información completa
    public void mostrarEspecificaciones() {
        System.out.println("COMPUTADORA:");
        System.out.println("   Marca: " + marca);
        System.out.println("   Nro Serie: " + numeroSerie);
        
        if (placaMadre != null) {
            System.out.println("   Placa Madre: " + placaMadre);
        }
        
        if (propietario != null) {
            System.out.println("   Propietario: " + propietario.getNombre());
        } else {
            System.out.println("   Propietario: No asignado");
        }
        System.out.println("---");
    }
    
    // Método para encender la computadora
    public void encender() {
        System.out.println("Encendiendo computadora " + marca + "..." );
        if (placaMadre != null) {
            System.out.println("   Placa madre " + placaMadre.getModelo() + " inicializada");
        }
        System.out.println("   Sistema operativo cargado");
        System.out.println("   Computadora lista para usar");
        System.out.println("---");
    }
    
    // Método para realizar mantenimiento
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento a " + marca + "...");
        System.out.println("   Limpieza de componentes internos");
        if (placaMadre != null) {
            System.out.println("   Revision de placa madre: " + placaMadre.getModelo());
        }
        System.out.println("   Actualizacion de drivers");
        System.out.println("   Mantenimiento completado");
        System.out.println("---");
    }
}