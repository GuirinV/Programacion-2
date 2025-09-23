/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Referencia bidireccional
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y setters - CORREGIR NOMBRES
    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public String getDni() { 
        return dni; 
    }
    
    public void setDni(String dni) { 
        this.dni = dni; 
    }
    
    // *** CORREGIR ESTE MÉTODO ***
    public Pasaporte getPasaporte() {  // <- getPasaporte() no getPassporte()
        return pasaporte; 
    }
    
    // *** CORREGIR ESTE MÉTODO ***
    public void setPasaporte(Pasaporte pasaporte) {  // <- setPasaporte() no setPassporte()
        this.pasaporte = pasaporte;
        // Establecer la referencia bidireccional
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
}