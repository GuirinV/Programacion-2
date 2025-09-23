/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class CodigoQR {
    private String valor;
    private Usuario13 usuario; // Ahora usa Usuario13
    
    // Constructor
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    // Método para establecer asociación unidireccional
    public void setUsuario(Usuario13 usuario) { // Ahora usa Usuario13
        this.usuario = usuario;
    }
    
    // Getters y Setters
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
    
    public Usuario13 getUsuario() { return usuario; } // Ahora retorna Usuario13
    
    @Override
    public String toString() {
        if (usuario != null) {
            return "QR[" + valor.substring(0, Math.min(8, valor.length())) + "...] - " + usuario.getNombre();
        }
        return "QR[" + valor.substring(0, Math.min(8, valor.length())) + "...]";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" CODIGO QR: " + valor.substring(0, Math.min(12, valor.length())) + "...");
        if (usuario != null) {
            System.out.println("    Usuario asociado: " + usuario.getNombre());
            System.out.println("    Email: " + usuario.getEmail());
        } else {
            System.out.println("    Usuario no asociado");
        }
    }
    
    // Método para simular escaneo del QR
    public void escanear() {
        System.out.println(" Escaneando codigo QR...");
        System.out.println("   Valor: " + valor);
        if (usuario != null) {
            System.out.println("    Usuario: " + usuario.getNombre());
            System.out.println("    Contacto: " + usuario.getEmail());
        }
        System.out.println("    Escaneo completado");
    }
}
