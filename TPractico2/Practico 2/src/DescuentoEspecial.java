/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Scanner;

public class DescuentoEspecial {

    // Variable global para el descuento
    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Calcular y mostrar el descuento especial y el precio final
        calcularDescuentoEspecial(precio);
    }

    // Método que calcula el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar el descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        // Precio final con descuento
        double precioFinal = precio - descuentoAplicado;

        // Mostrar resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}