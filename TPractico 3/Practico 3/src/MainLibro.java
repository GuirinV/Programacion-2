/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainLibro {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("Cronicas del Angel Gris", "Alejandro Dolina", 1987);
        
        // Intentar modificar el año con un valor inválido
        libro.setAñoPublicacion(1400); // Este año debería ser inválido
        
        // Intentar modificar el año con un valor válido
        libro.setAñoPublicacion(2020); // Este año es válido
        
        // Mostrar la información final
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicacion: " + libro.getAñoPublicacion());
    }
}