/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    // Constructor con composición
    public Documento(String titulo, String contenido, String codigoHash, String fechaFirma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fechaFirma);
    }
    
    // Método para establecer agregación en la firma
    public void asignarFirmante(Usuario2 usuario) { // Ahora usa Usuario2
        if (firmaDigital != null) {
            firmaDigital.setUsuario(usuario);
        }
    }
    
    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
    
    // Método para mostrar información
    public void mostrarDocumento() {
        System.out.println(" DOCUMENTO: " + titulo);
        System.out.println("   Contenido: " + contenido.substring(0, Math.min(50, contenido.length())) + "...");
        System.out.println("   Firma: " + firmaDigital);
        
        if (firmaDigital.getUsuario() != null) {
            System.out.println("   Firmante: " + firmaDigital.getUsuario().getNombre());
        }
    }
    
    // Método para verificar integridad del documento
    public void verificarIntegridad() {
        System.out.println(" Verificando integridad del documento...");
        System.out.println("   Titulo: " + titulo);
        firmaDigital.verificarFirma();
        System.out.println("   Documento integro y autentico");
    }
}