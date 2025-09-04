/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class ValidacionNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        double nota; // Variable para almacenar la nota ingresada

        do {
            // Solicitar al usuario que ingrese una nota
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextDouble(); // Leer la nota ingresada

            // Verificar si la nota es válida
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10); // Continuar pidiendo la nota hasta que sea válida

        // Nota guardada correctamente
        System.out.println("Nota guardada correctamente.");

        // Cerrar el scanner
        scanner.close();
    }
}