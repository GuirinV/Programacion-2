/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class ActualizacionStock {

    // Método para actualizar el stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida; // Calcular nuevo stock
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        // Solicitar el stock actual
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt(); // Leer el stock actual

        // Solicitar la cantidad vendida
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt(); // Leer la cantidad vendida

        // Solicitar la cantidad recibida
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt(); // Leer la cantidad recibida

        // Calcular el nuevo stock llamando al método
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        // Mostrar el nuevo stock
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        // Cerrar el scanner
        scanner.close();
    }
}