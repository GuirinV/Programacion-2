/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainMascota {
    public static void main(String[] args) {
        // Crear una mascota
        Mascota mascota1 = new Mascota("Jacky", "Perro", 5);
        
        // Mostrar su información
        mascota1.mostrarInfo();

        // Simular el paso del tiempo
        System.out.println("Simulando el paso del tiempo...");
        for (int i = 0; i < 3; i++) { // Simular 3 años
            mascota1.cumplirAnios();
        }

        // Mostrar la información nuevamente
        mascota1.mostrarInfo();
    }
}
