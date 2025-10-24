/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author veron
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TrabajoPractico8 {
    
    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRACTICO 8 - INTERFACES Y EXCEPCIONES ===");
        
        // Parte 1: Sistema E-commerce
        System.out.println("\n--- PARTE 1: SISTEMA E-COMMERCE ---");
        demostrarSistemaEcommerce();
        
        // Parte 2: Ejercicios de Excepciones
        System.out.println("\n--- PARTE 2: EJERCICIOS DE EXCEPCIONES ---");
        ejecutarEjerciciosExcepciones();
    }
    
    private static void demostrarSistemaEcommerce() {
        // Crear cliente
        Cliente cliente = new Cliente("Veronica Guirin", "veronica@email.com");
        
        // Crear productos
        Producto producto1 = new Producto("Laptop", 1500.0);
        Producto producto2 = new Producto("Mouse", 25.0);
        Producto producto3 = new Producto("Teclado", 45.0);
        
        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("Productos en el pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println("  - " + p);
        }
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        
        // Cambiar estado del pedido (se notifica al cliente)
        pedido.cambiarEstado("PROCESANDO");
        pedido.cambiarEstado("ENVIADO");
        
        // Procesar pagos
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Veronica Guirin");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);
        
        PayPal paypal = new PayPal("veronica@email.com");
        paypal.procesarPago(pedido.calcularTotal());
    }
    
    private static void ejecutarEjerciciosExcepciones() {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1: División segura
        System.out.println("\n1. DIVISION SEGURA");
        ejercicioDivisionSegura(scanner);
        
        // Ejercicio 2: Conversión de cadena a número
        System.out.println("\n2. CONVERSION DE CADENA A NUMERO");
        ejercicioConversionNumero(scanner);
        
        // Ejercicio 3: Lectura de archivo
        System.out.println("\n3. LECTURA DE ARCHIVO");
        ejercicioLecturaArchivo();
        
        // Ejercicio 4: Excepción personalizada
        System.out.println("\n4. EXCEPCION PERSONALIZADA - VALIDACION DE EDAD");
        ejercicioValidacionEdad(scanner);
        
        // Ejercicio 5: Try-with-resources
        System.out.println("\n5. TRY-WITH-RESOURCES");
        ejercicioTryWithResources();
        
        scanner.close();
    }
    
    private static void ejercicioDivisionSegura(Scanner scanner) {
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();
            
            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();
            
            if (divisor == 0) {
                throw new ArithmeticException("Division por cero no permitida");
            }
            
            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida");
            scanner.nextLine(); // Limpiar buffer
        }
    }
    
    private static void ejercicioConversionNumero(Scanner scanner) {
        try {
            System.out.print("Ingrese un numero entero: ");
            String entrada = scanner.next();
            
            int numero = Integer.parseInt(entrada);
            System.out.println("Numero convertido: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir la cadena a numero - " + e.getMessage());
        }
    }
    
    private static void ejercicioLecturaArchivo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo_inexistente.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
    
    private static void ejercicioValidacionEdad(Scanner scanner) {
        try {
            System.out.print("Ingrese una edad: ");
            int edad = scanner.nextInt();
            
            ValidadorEdad.validarEdad(edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("Excepcion personalizada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida");
            scanner.nextLine(); // Limpiar buffer
        }
    }
    
    private static void ejercicioTryWithResources() {
        // Primero creamos un archivo de prueba
        try (java.io.FileWriter writer = new java.io.FileWriter("prueba.txt")) {
            writer.write("Línea 1: Hola Mundo\n");
            writer.write("Línea 2: Try-with-resources\n");
            writer.write("Línea 3: Java Programming\n");
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
        
        // Ahora leemos con try-with-resources
        System.out.println("Leyendo archivo con try-with-resources:");
        try (BufferedReader reader = new BufferedReader(new FileReader("prueba.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("  " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
}