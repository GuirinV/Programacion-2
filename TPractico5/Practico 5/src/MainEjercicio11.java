/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio11 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE REPRODUCCION MUSICAL ===");
        System.out.println();
        
        // 1. Crear artistas
        System.out.println("1. CREANDO ARTISTAS...");
        Artista artista1 = new Artista("Backstreet Boys", "Pop");
        Artista artista2 = new Artista("Metallica", "Rock");
        Artista artista3 = new Artista("Caetano Veloso", "Musica popular brasileira");
        
        artista1.mostrarInformacion();
        artista2.mostrarInformacion();
        artista3.mostrarInformacion();
        System.out.println();
        
        // 2. Crear canciones
        System.out.println("2. CREANDO CANCIONES...");
        Cancion cancion1 = new Cancion("Get down");
        Cancion cancion2 = new Cancion("Enter Sandman");
        Cancion cancion3 = new Cancion("Sozinho");
        Cancion cancion4 = new Cancion("Bohemian Rhapsody"); // Sin artista
        
        System.out.println("Canciones creadas:");
        System.out.println("   - " + cancion1.getTitulo());
        System.out.println("   - " + cancion2.getTitulo());
        System.out.println("   - " + cancion3.getTitulo());
        System.out.println("   - " + cancion4.getTitulo());
        System.out.println();
        
        // 3. Establecer ASOCIACIÓN UNIDIRECCIONAL: Canción → Artista
        System.out.println("3. ESTABLECIENDO ASOCIACION UNIDIRECCIONAL...");
        cancion1.setArtista(artista1);
        cancion2.setArtista(artista2);
        cancion3.setArtista(artista3);
        // cancion4 queda sin artista para demostrar el caso
        
        System.out.println("Asociacion unidireccional establecida: Cancion -> Artista");
        System.out.println("La cancion conoce al artista, pero el artista NO conoce la cancion");
        System.out.println();
        
        // 4. Mostrar información de las canciones
        System.out.println("4. INFORMACION DE CANCIONES:");
        cancion1.mostrarInformacion();
        System.out.println();
        cancion2.mostrarInformacion();
        System.out.println();
        cancion3.mostrarInformacion();
        System.out.println();
        cancion4.mostrarInformacion();
        System.out.println();
        
        // 5. Crear reproductor
        System.out.println("5. CREANDO REPRODUCTOR...");
        Reproductor reproductor = new Reproductor();
        reproductor.mostrarEstado();
        System.out.println();
        
        // 6. DEMOSTRAR DEPENDENCIA DE USO: Reproductor.reproducir(Cancion)
        System.out.println("6. DEMOSTRANDO DEPENDENCIA DE USO...");
        System.out.println("Reproductor usa Cancion como parametro pero NO la almacena");
        System.out.println();
        
        // Usar dependencia de uso múltiples veces
        System.out.println("PRIMERA REPRODUCCION:");
        reproductor.reproducir(cancion1); // Dependencia de uso
        System.out.println();
        
        System.out.println("SEGUNDA REPRODUCCION:");
        reproductor.reproducir(cancion2); // Dependencia de uso
        System.out.println();
        
        System.out.println("TERCERA REPRODUCCION:");
        reproductor.reproducir(cancion3); // Dependencia de uso
        System.out.println();
        
        // 7. Demostrar que el reproductor NO almacena las canciones
        System.out.println("7. EL REPRODUCTOR NO ALMACENA CANCIONES:");
        System.out.println("Despues de reproducir, el reproductor no mantiene referencia");
        System.out.println("Puede reproducir diferentes canciones en diferentes momentos");
        System.out.println();
        
        // 8. Mostrar información de canciones usando dependencia de uso
        System.out.println("8. MOSTRAR INFORMACION (dependencia de uso):");
        reproductor.mostrarInfoCancion(cancion1);
        System.out.println();
        reproductor.mostrarInfoCancion(cancion4); // Canción sin artista
        System.out.println();
        
        // 9. Demostrar ASOCIACIÓN UNIDIRECCIONAL
        System.out.println("9. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println("Cancion conoce al artista: " + (cancion1.getArtista() != null));
        System.out.println("Artista NO conoce la cancion: true");
        System.out.println("Artista existe independientemente: " + artista1);
        System.out.println();
        
        // 10. Demostrar que las canciones pueden cambiar de artista
        System.out.println("10. CAMBIANDO ARTISTA DE CANCION:");
        System.out.println("Antes: " + cancion1);
        cancion1.setArtista(artista3); // Cambiar artista
        System.out.println("Despues: " + cancion1);
        System.out.println();
        
        // 11. Reproducir con el artista cambiado
        System.out.println("11. REPRODUCIENDO CON ARTISTA CAMBIADO:");
        reproductor.reproducir(cancion1);
        System.out.println();
        
        // 12. Controlar reproducción
        System.out.println("12. CONTROLES DE REPRODUCCION:");
        reproductor.pausar();
        reproductor.detener();
        System.out.println();
        
        System.out.println("=== EJERCICIO 11 COMPLETADO ===");
    }
}