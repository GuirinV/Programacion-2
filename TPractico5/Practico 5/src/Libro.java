/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;        // Asociación unidireccional
    private Editorial editorial; // Agregación
    
    // Constructor
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    // Métodos para establecer relaciones
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }
    
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    // Método para mostrar información completa
    public void mostrarInformacion() {
        System.out.println("LIBRO: " + titulo);
        System.out.println("ISBN: " + isbn);
        
        if (autor != null) {
            System.out.println("Autor: " + autor);
        } else {
            System.out.println("Autor: No asignado");
        }
        
        if (editorial != null) {
            System.out.println("Editorial: " + editorial);
        } else {
            System.out.println("Editorial: No asignada");
        }
        System.out.println("---");
    }
}