/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6sistemabiblioteca;

/**
 *
 * @author veron
 */
public class MainBiblioteca {
    
    // Método para mostrar separadores visuales
    public static void mostrarSeparador(String titulo) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + titulo);
        System.out.println("=".repeat(60));
    }

    public static void main(String[] args) {
        mostrarSeparador("SISTEMA DE GESTION DE BIBLIOTECA - INICIO");
        
        // 1. CREAR BIBLIOTECA
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UNLa");
        
        // 2. CREAR AUTORES (3 autores como solicita el ejercicio)
        mostrarSeparador("CREACION DE AUTORES");
        
        Autor autor1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Julio Cortazar", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        System.out.println(" Autores creados correctamente:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        
        // 3. AGREGAR 5 LIBROS (como solicita el ejercicio)
        mostrarSeparador("AGREGAR LIBROS A LA BIBLIOTECA");
        
        biblioteca.agregarLibro("ISBN-001", "Cien anios de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN-002", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN-003", "La casa de los espiritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN-004", "Cronica de una muerte anunciada", 1981, autor1);
        biblioteca.agregarLibro("ISBN-005", "Bestiario", 1951, autor2);
        
        // 4. LISTAR TODOS LOS LIBROS CON SU INFORMACIÓN
        mostrarSeparador("LISTA COMPLETA DE LIBROS");
        biblioteca.listarLibros();
        
        // 5. BUSCAR LIBRO POR ISBN
        mostrarSeparador("BUSQUEDA DE LIBRO POR ISBN (ISBN-002)");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("ISBN-002");
        if (libroEncontrado != null) {
            System.out.println(" Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println(" Libro no encontrado");
        }
        
        // 6. FILTRAR LIBROS POR AÑO ESPECÍFICO
        mostrarSeparador("FILTRAR LIBROS DEL ANIO 1967");
        biblioteca.filtrarLibrosPorAnio(1967);
        
        // 7. ELIMINAR UN LIBRO POR ISBN
        mostrarSeparador("ELIMINAR LIBRO (ISBN-003)");
        biblioteca.eliminarLibro("ISBN-003");
        
        // Mostrar libros restantes
        System.out.println("\n LIBROS RESTANTES:");
        biblioteca.listarLibros();
        
        // 8. MOSTRAR CANTIDAD TOTAL DE LIBROS
        mostrarSeparador("CANTIDAD TOTAL DE LIBROS");
        System.out.println(" Total de libros en biblioteca: " + biblioteca.obtenerCantidadLibros());
        
        // 9. LISTAR AUTORES DISPONIBLES
        mostrarSeparador("AUTORES DISPONIBLES EN LA BIBLIOTECA");
        biblioteca.mostrarAutoresDisponibles();
        
        // 10. MOSTRAR ESTADÍSTICAS ADICIONALES
        biblioteca.mostrarEstadisticas();
        
        // PRUEBA EXTRA: Intentar agregar libro con ISBN duplicado
        mostrarSeparador("PRUEBA: AGREGAR LIBRO CON ISBN EXISTENTE");
        biblioteca.agregarLibro("ISBN-001", "Otro libro", 1990, autor3);
        
        mostrarSeparador("SISTEMA BIBLIOTECA - FINALIZADO");
    }
}