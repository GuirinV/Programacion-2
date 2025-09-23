/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    // Getters y setters
    public String getImagen() { 
        return imagen; 
    }
    
    public void setImagen(String imagen) { 
        this.imagen = imagen; 
    }
    
    public String getFormato() { 
        return formato; 
    }
    
    public void setFormato(String formato) { 
        this.formato = formato; 
    }
}