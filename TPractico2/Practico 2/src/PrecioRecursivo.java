/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class PrecioRecursivo {

    public static void main(String[] args) {
        // a. Declarar e inicializar un array con algunos precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Usar una función recursiva para mostrar los precios originales
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);

        // c. Modificar el precio de un producto específico
        // Por ejemplo, modificar el tercer producto (índice 2)
        precios[2] = 129.99;

        // d. Usar otra función recursiva para mostrar los valores modificados
        System.out.println("Precios modificados:");
        mostrarPreciosModificados(precios, 0);
    }

    // Función recursiva para mostrar precios originales
    public static void mostrarPreciosOriginales(double[] precios, int index) {
        if (index >= precios.length) {
            return; // Fin de la recursión
        }
        System.out.printf("Precio: $%.2f%n", precios[index]); // Mostrar precio
        mostrarPreciosOriginales(precios, index + 1); // Llamada recursiva
    }

    // Función recursiva para mostrar precios modificados
    public static void mostrarPreciosModificados(double[] precios, int index) {
        if (index >= precios.length) {
            return; // Fin de la recursión
        }
        System.out.printf("Precio: $%.2f%n", precios[index]); // Mostrar precio
        mostrarPreciosModificados(precios, index + 1); // Llamada recursiva
    }
}
