/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner; // Importar la clase Scanner

public class DivisionDouble {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número (decimal permitido): ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número (decimal permitido): ");
        double numero2 = scanner.nextDouble();

        // Realizar la división
        if (numero2 != 0) { // Verificar que el divisor no sea cero
            double resultado = numero1 / numero2; // División de tipo double
            System.out.println("Resultado de la división con doble: " + resultado);
        } else {
            System.out.println("Error: División por cero no es permitida.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}