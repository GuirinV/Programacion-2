/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class ModificacionArrayPrecios {

    public static void main(String[] args) {
        // a. Declarar e inicializar un array con los precios de algunos productos
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Mostrar los valores originales de los precios
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        // c. Modificar el precio de un producto específico
        // Por ejemplo, modificar el tercer producto (índice 2)
        precios[2] = 129.99;

        // d. Mostrar los valores modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }

    // Método para mostrar los precios
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.printf("Precio: $%.2f%n", precio);
        }
    }
}
