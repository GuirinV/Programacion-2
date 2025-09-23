/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario2 usuario; // Ahora usa Usuario2
    
    // Constructor
    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }
    
    // Método para establecer agregación con Usuario2
    public void setUsuario(Usuario2 usuario) {
        this.usuario = usuario;
    }
    
    // Getters y Setters
    public String getCodigoHash() { return codigoHash; }
    public void setCodigoHash(String codigoHash) { this.codigoHash = codigoHash; }
    
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public Usuario2 getUsuario() { return usuario; }
    
    @Override
    public String toString() {
        return "FirmaDigital[" + codigoHash.substring(0, 8) + "...] - " + fecha;
    }
    
    // Método para verificar firma
    public void verificarFirma() {
        System.out.println(" Verificando firma digital...");
        System.out.println("   Hash: " + codigoHash);
        System.out.println("   Fecha: " + fecha);
        if (usuario != null) {
            System.out.println("   Firmado por: " + usuario.getNombre());
        }
        System.out.println("   Firma valida");
    }
}
