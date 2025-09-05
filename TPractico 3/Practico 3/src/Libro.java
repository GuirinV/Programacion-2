/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usar el setter para la validación
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion < 1900 || añoPublicacion > 2023) {
            System.out.println("Anio de publicacion invalido. Debe estar entre 1900 y 2023.");
        } else {
            this.añoPublicacion = añoPublicacion;
            System.out.println("Anio de publicacion actualizado a: " + añoPublicacion);
        }
    }
}