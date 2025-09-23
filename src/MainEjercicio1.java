/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
// Clase Main para probar el ejercicio 1
public class MainEjercicio1 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1 ===");
        
        // Crear objetos
        Titular titular = new Titular("Veronica Guirin", "12345678A");
        Pasaporte pasaporte = new Pasaporte("AB123456", "2023-05-15", "foto.jpg", "JPEG");
        
        // Establecer relación - USAR LOS NOMBRES CORRECTOS
        titular.setPasaporte(pasaporte);  // <- setPasaporte() no setPassporte()
        
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());  // <- getPasaporte() no getPassporte()
        System.out.println("Foto formato: " + pasaporte.getFoto().getFormato());
    }
}