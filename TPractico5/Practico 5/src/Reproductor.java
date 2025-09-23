/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Reproductor {
    // NO tiene atributos de asociación (solo dependencia de uso)
    
    // Constructor
    public Reproductor() {
        // El reproductor no almacena canciones como atributos
    }
    
    // DEPENDENCIA DE USO: usa Canción como parámetro pero no la almacena
    public void reproducir(Cancion cancion) {
        System.out.println("========================");
        System.out.println("REPRODUCTOR ACTIVADO");
        System.out.println("========================");
        
        if (cancion != null) {
            cancion.reproducir();
            System.out.println("Duracion 3:45");
            System.out.println("Bitrate 320 kbps");
        } else {
            System.out.println("No hay cancion para reproducir");
        }
        System.out.println("========================");
    }
    
    // Método para pausar reproducción
    public void pausar() {
        System.out.println("Reproduccion pausada");
    }
    
    // Método para detener reproducción
    public void detener() {
        System.out.println("Reproduccion detenida");
    }
    
    // Método para mostrar información del reproductor
    public void mostrarEstado() {
        System.out.println("Reproductor multimedia activo");
        System.out.println("Memoria disponible: 16GB");
        System.out.println("Bateria: 85%");
    }
    
    // Otro método con dependencia de uso
    public void mostrarInfoCancion(Cancion cancion) {
        System.out.println("INFORMACION DE LA CANCION");
        if (cancion != null) {
            cancion.mostrarInformacion();
        } else {
            System.out.println("Cancion no disponible");
        }
    }
}