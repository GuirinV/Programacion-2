/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class DeterminarMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt(); // Leer el primer número

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt(); // Leer el segundo número

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt(); // Leer el tercer número

        // Determinar cuál es el mayor
        int mayor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        // Mostrar el resultado
        System.out.println("El mayor es: " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
}