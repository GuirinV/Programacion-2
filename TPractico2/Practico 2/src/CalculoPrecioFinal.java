/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class CalculoPrecioFinal {
    
    // Método para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        // Solicitar el precio base del producto
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble(); // Leer el precio base
        
        // Solicitar el porcentaje de impuesto
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble(); // Leer el impuesto
        
        // Solicitar el porcentaje de descuento
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble(); // Leer el descuento
        
        // Calcular el precio final llamando al método
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        // Mostrar el precio final
        System.out.println("El precio final del producto es: " + precioFinal);
        
        // Cerrar el scanner
        scanner.close();
    }
}