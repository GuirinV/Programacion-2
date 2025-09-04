/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble(); // Leer el precio

        // Solicitar la categoría del producto
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = scanner.next().charAt(0); // Leer la categoría

        double descuento = 0; // Variable para almacenar el valor del descuento

        // Determinar el descuento según la categoría
        switch (Character.toUpperCase(categoria)) {
            case 'A':
                descuento = 0.10; // 10% de descuento
                break;
            case 'B':
                descuento = 0.15; // 15% de descuento
                break;
            case 'C':
                descuento = 0.20; // 20% de descuento
                break;
            default:
                System.out.println("Categoria no valida. No se aplicara descuento.");
                break;
        }

        // Calcular el precio final si la categoría es válida
        double precioFinal = precioOriginal; // Inicializa el precio final con el precio original

        if (descuento > 0) {
            double descuentoAplicado = precioOriginal * descuento; // Calcular el descuento aplicado
            precioFinal = precioOriginal - descuentoAplicado; // Calcular el precio final
            System.out.printf("Descuento aplicado: %.0f%%\n", descuento * 100); // Mostrar el porcentaje de descuento
            System.out.printf("Precio final: %.2f\n", precioFinal); // Mostrar el precio final
        } else {
            // Para categoría inválida, solo muestra el precio original
            System.out.printf("El precio original es: %.2f\n", precioOriginal);
        }

        // Cerrar el scanner
        scanner.close();
    }
}