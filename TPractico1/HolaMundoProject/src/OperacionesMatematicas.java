/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner; // Importar la clase Scanner

public class OperacionesMatematicas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt(); // Capturar el primer número

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt(); // Capturar el segundo número

        // Realizar las operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        
        // Para la división, asegurarse de que el segundo número no sea cero
        double division;
        if (numero2 != 0) {
            division = (double) numero1 / numero2; // double para obtener un resultado más preciso
        } else {
            division = 0; // Evitar división por cero
            System.out.println("Error: Division por cero no es permitida.");
        }

        // Mostrar los resultados en la consola
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        
        // Solo mostrar la división si el segundo número no es cero
        if (numero2 != 0) {
            System.out.println("Division: " + division);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}