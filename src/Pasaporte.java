/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
    }
    
    // Getters y setters
    public String getNumero() { 
        return numero; 
    }
    
    public void setNumero(String numero) { 
        this.numero = numero; 
    }
    
    public String getFechaEmision() { 
        return fechaEmision; 
    }
    
    public void setFechaEmision(String fechaEmision) { 
        this.fechaEmision = fechaEmision; 
    }
    
    public Foto getFoto() { 
        return foto; 
    }
    
    // *** VERIFICAR ESTE MÉTODO ***
    public Titular getTitular() { 
        return titular; 
    }
    
    // *** VERIFICAR ESTE MÉTODO ***
    public void setTitular(Titular titular) { 
        this.titular = titular;
        // Establecer la referencia bidireccional
        if (titular != null && titular.getPasaporte() != this) {  // <- getPasaporte() no getPassporte()
            titular.setPasaporte(this);  // <- setPasaporte() no setPassporte()
        }
    }
}