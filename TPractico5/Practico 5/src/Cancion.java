/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional
    
    // Constructor
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    // Método para establecer asociación unidireccional
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public Artista getArtista() { return artista; }
    
    @Override
    public String toString() {
        if (artista != null) {
            return titulo + " - " + artista.getNombre();
        }
        return titulo;
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("CANCION: " + titulo);
        if (artista != null) {
            System.out.println("Artista: " + artista.getNombre());
            System.out.println("Genero: " + artista.getGenero());
        } else {
            System.out.println("Artista no asignado");
        }
    }
    
    // Método para reproducir la canción
    public void reproducir() {
        System.out.println("Reproduciendo: " + this);
        System.out.println("Sonido...");
    }
}
