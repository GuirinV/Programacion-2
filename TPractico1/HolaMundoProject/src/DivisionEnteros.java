/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner; // Importar la clase Scanner

public class DivisionEnteros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Realizar la división
        if (numero2 != 0) { // Verificar que el divisor no sea cero
            int resultado = numero1 / numero2; // División entera
            System.out.println("Resultado de la división entera: " + resultado);
        } else {
            System.out.println("Error: División por cero no es permitida.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}