/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6sistemabiblioteca;

/**
 *
 * @author veron
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        System.out.println(" Biblioteca '" + nombre + "' creada correctamente");
    }
    
    // 1. AGREGAR LIBRO
    public boolean agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Verificar si el ISBN ya existe
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println(" Error: Ya existe un libro con ISBN " + isbn);
                return false;
            }
        }
        
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println(" Libro agregado: " + titulo);
        return true;
    }
    
    // 2. LISTAR TODOS LOS LIBROS
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println(" La biblioteca esta vacia");
            return;
        }
        
        System.out.println("\n CATALOGO COMPLETO - " + nombre + " (" + libros.size() + " libros)");
        System.out.println("=".repeat(50));
        for (int i = 0; i < libros.size(); i++) {
            System.out.print((i + 1) + ". ");
            libros.get(i).mostrarInfo();
        }
    }
    
    // 3. BUSCAR LIBRO POR ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    // 4. ELIMINAR LIBRO POR ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println(" Libro eliminado: " + libro.getTitulo());
            return true;
        } else {
            System.out.println(" No se encontro libro con ISBN: " + isbn);
            return false;
        }
    }
    
    // 5. OBTENER CANTIDAD DE LIBROS
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    // 6. FILTRAR LIBROS POR AÑO
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n LIBROS PUBLICADOS EN " + anio);
        System.out.println("=".repeat(50));
        
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay libros publicados en " + anio);
        }
    }
    
    // 7. MOSTRAR AUTORES DISPONIBLES
    public void mostrarAutoresDisponibles() {
        System.out.println("\n AUTORES EN LA BIBLIOTECA");
        System.out.println("=".repeat(50));
        
        if (libros.isEmpty()) {
            System.out.println("No hay autores disponibles");
            return;
        }
        
        // Evitar duplicados usando una lista temporal
        List<String> autoresMostrados = new ArrayList<>();
        for (Libro libro : libros) {
            String autorInfo = libro.getAutor().getNombre() + " - " + libro.getAutor().getNacionalidad();
            if (!autoresMostrados.contains(autorInfo)) {
                System.out.println(autorInfo);
                autoresMostrados.add(autorInfo);
            }
        }
    }
    
    // 8. MOSTRAR ESTADÍSTICAS
    public void mostrarEstadisticas() {
        System.out.println("\n ESTADISTICAS DE " + nombre.toUpperCase());
        System.out.println("=".repeat(50));
        System.out.println("Total de libros: " + libros.size());
        
        if (!libros.isEmpty()) {
            // Libro más antiguo
            Libro masAntiguo = libros.get(0);
            for (Libro libro : libros) {
                if (libro.getAnioPublicacion() < masAntiguo.getAnioPublicacion()) {
                    masAntiguo = libro;
                }
            }
            System.out.println("Libro mas antiguo: " + masAntiguo.getTitulo() + " (" + masAntiguo.getAnioPublicacion() + ")");
            
            // Cantidad de autores únicos
            List<String> autoresUnicos = new ArrayList<>();
            for (Libro libro : libros) {
                String autorNombre = libro.getAutor().getNombre();
                if (!autoresUnicos.contains(autorNombre)) {
                    autoresUnicos.add(autorNombre);
                }
            }
            System.out.println("Autores diferentes: " + autoresUnicos.size());
        }
    }
}