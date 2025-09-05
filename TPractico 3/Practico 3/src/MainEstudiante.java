/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEstudiante {
    public static void main(String[] args) {
        // Instanciar un estudiante
        Estudiante estudiante1 = new Estudiante("Vero", "Guirin", "Fisica", 95.0);
        
        // Mostrar su información
        estudiante1.mostrarInfo();

        // Aumentar calificación
        estudiante1.subirCalificacion(5.0);
        
        // Disminuir calificación
        estudiante1.bajarCalificacion(3.0);
        
        // Mostrar la información nuevamente
        estudiante1.mostrarInfo();
    }
}