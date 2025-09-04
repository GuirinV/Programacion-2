/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        int sumaPares = 0; // Variable para almacenar la suma de los números pares
        int numero; // Variable para almacenar el número ingresado por el usuario

        // Ciclo while que solicita números al usuario
        while (true) {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = scanner.nextInt(); // Leer el número ingresado

            if (numero == 0) { // Si el usuario ingresa 0, salir del ciclo
                break;
            }

            // Verificar si el número es par
            if (numero % 2 == 0) {
                sumaPares += numero; // Sumar el número a la suma de los pares
            }
        }

        // Mostrar la suma total de los números pares ingresados
        System.out.println("La suma de los numeros pares es: " + sumaPares);

        // Cerrar el scanner
        scanner.close();
    }
}
