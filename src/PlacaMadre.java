/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;
    
    // Constructor
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    // Getters
    public String getModelo() {
        return modelo;
    }
    
    public String getChipset() {
        return chipset;
    }
    
    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
    
    // Método toString
    @Override
    public String toString() {
        return modelo + " (" + chipset + ")";
    }
    
    // Método para mostrar información
    public void mostrarEspecificaciones() {
        System.out.println("PLACA MADRE:");
        System.out.println("   Modelo: " + modelo);
        System.out.println("   Chipset: " + chipset);
    }
}