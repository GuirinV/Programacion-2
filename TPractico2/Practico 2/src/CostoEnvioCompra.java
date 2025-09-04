/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class CostoEnvioCompra {

    // Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        // Determinar costo de envío según la zona
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = 5 * peso; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = 10 * peso; // $10 por kg
        } else {
            System.out.println("Zona de envio no valida.");
        }
        return costoEnvio;
    }

    // Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio; // Sumar precio del producto y costo de envío
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble(); // Leer el precio del producto

        // Solicitar el peso del paquete
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble(); // Leer el peso del paquete

        // Solicitar la zona de envío
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scanner.next(); // Leer la zona de envío

        // Calcular el costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        // Comprobar si el costo de envío es válido
        if (costoEnvio >= 0) {
            // Mostrar el costo de envío
            System.out.printf("El costo de envio es: %.2f\n", costoEnvio);

            // Calcular el total a pagar
            double totalAPagar = calcularTotalCompra(precioProducto, costoEnvio);

            // Mostrar el total a pagar
            System.out.printf("El total a pagar es: %.2f\n", totalAPagar);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
