/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        int positivos = 0; // Contador de números positivos
        int negativos = 0; // Contador de números negativos
        int ceros = 0;     // Contador de ceros

        // Ciclo for para solicitar 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = scanner.nextInt(); // Leer el número ingresado

            // Clasificar el número ingresado
            if (numero > 0) {
                positivos++; // Incrementar contador de positivos
            } else if (numero < 0) {
                negativos++; // Incrementar contador de negativos
            } else {
                ceros++; // Incrementar contador de ceros
            }
        }

        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        // Cerrar el scanner
        scanner.close();
    }
}