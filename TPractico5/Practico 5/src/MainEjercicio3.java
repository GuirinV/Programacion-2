/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio3 {
    public static void main(String[] args) {
        System.out.println(" === EJERCICIO 3: LIBRO - AUTOR - EDITORIAL ===");
        System.out.println(" Relaciones: Libro -> Autor (Asociacion unidireccional)");
        System.out.println(" Relaciones: Libro -> Editorial (Agregacion)");
        System.out.println();
        
        // 1. CREAR AUTOR (Asociación unidireccional)
        System.out.println("1. CREANDO AUTOR...");
        Autor autor = new Autor("Alejandro Dolina", "Argentino");
        System.out.println("Autor creado: " + autor);
        System.out.println();
        
        // 2. CREAR EDITORIAL (Agregación)
        System.out.println("2. CREANDO EDITORIAL...");
        Editorial editorial = new Editorial("Planeta", "Ing. Enrique Butty 275, Cdad. Autonoma de Buenos Aires");
        System.out.println("Editorial creada: " + editorial);
        System.out.println();
        
        // 3. CREAR LIBRO
        System.out.println("3. CREANDO LIBRO...");
        Libro libro = new Libro("Bar del Infierno", "978-8437604947");
        System.out.println("Libro creado: " + libro.getTitulo());
        System.out.println();
        
        // 4. ESTABLECER ASOCIACIÓN UNIDIRECCIONAL: Libro → Autor
        System.out.println("4. ESTABLECIENDO ASOCIACION UNIDIRECCIONAL...");
        libro.setAutor(autor);
        System.out.println("Asociacion establecida: Libro -> Autor");
        System.out.println("   El libro conoce al autor, pero el autor NO conoce el libro");
        System.out.println();
        
        // 5. ESTABLECER AGREGACIÓN: Libro → Editorial
        System.out.println("5. ESTABLECIENDO AGREGACION...");
        libro.setEditorial(editorial);
        System.out.println("Agregacion establecida: Libro -> Editorial");
        System.out.println("   La editorial existe independientemente del libro");
        System.out.println();
        
        // 6. VERIFICAR RELACIONES DESDE EL LIBRO
        System.out.println("6. VERIFICANDO DESDE EL LIBRO:");
        libro.mostrarInformacion();
        
        // 7. DEMOSTRAR ASOCIACIÓN UNIDIRECCIONAL
        System.out.println("7. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println("   Libro conoce al Autor: " + (libro.getAutor() != null));
        System.out.println("   Autor NO tiene referencia al Libro: " + true);
        System.out.println("   (Asociacion solo en una direccion)");
        System.out.println();
        
        // 8. DEMOSTRAR AGREGACIÓN
        System.out.println("8. DEMOSTRANDO AGREGACION:");
        System.out.println("   La editorial puede existir sin el libro:");
        Editorial otraEditorial = new Editorial("Penguin", "Londres, UK");
        System.out.println("   Otra editorial: " + otraEditorial);
        System.out.println("   Existe independientemente de cualquier libro");
        System.out.println();
        
        // 9. CREAR MÁS LIBROS CON LAS MISMAS RELACIONES
        System.out.println("9. CREANDO MAS LIBROS:");
        
        // Libro 2 - mismo autor, misma editorial
        Libro libro2 = new Libro("Cartas marcadas", "978-0307474728");
        libro2.setAutor(autor);
        libro2.setEditorial(editorial);
        libro2.mostrarInformacion();
        
        // Libro 3 - mismo autor, diferente editorial
        Libro libro3 = new Libro("Cronicas del Angel Gris", "978-8437604948");
        libro3.setAutor(autor);
        libro3.setEditorial(otraEditorial);
        libro3.mostrarInformacion();
        
        // 10. MODIFICAR DATOS
        System.out.println("10.  MODIFICANDO DATOS:");
        autor.setNacionalidad("Colombo-Mexicano");
        editorial.setDireccion("Av. Santa Fe 1234, Buenos Aires");
        
        System.out.println("   Autor actualizado: " + autor);
        System.out.println("   Editorial actualizada: " + editorial);
        System.out.println();
        
        // 11. VERIFICAR CAMBIOS
        System.out.println("11. VERIFICANDO CAMBIOS:");
        libro.mostrarInformacion();
        
        System.out.println("=== EJERCICIO 3 COMPLETADO EXITOSAMENTE ===");
    }
}