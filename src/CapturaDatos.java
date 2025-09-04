/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner; // Importar la clase Scanner

public class CapturaDatos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); // Capturar el nombre

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Capturar la edad

        // Mostrar los datos ingresados en pantalla
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}