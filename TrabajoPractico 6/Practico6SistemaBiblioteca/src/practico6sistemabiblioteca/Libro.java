/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6sistemabiblioteca;

/**
 *
 * @author veron
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public void mostrarInfo() {
        System.out.println("==========================================");
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Anio: " + anioPublicacion);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("==========================================");
    }
    
    // GETTERS
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }
    
    @Override
    public String toString() {
        return titulo + " (" + anioPublicacion + ") - " + autor.getNombre();
    }
}
