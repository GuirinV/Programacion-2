/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Bateria {
    private String modelo;
    private int capacidad; // en mAh
    
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    // Getters y setters
    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    
    public int getCapacidad() { 
        return capacidad; 
    }
    
    public void setCapacidad(int capacidad) { 
        this.capacidad = capacidad; 
    }
}