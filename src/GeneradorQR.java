/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.util.Random;

public class GeneradorQR {
    // NO tiene atributos de asociación (solo dependencia de creación)
    
    // Constructor
    public GeneradorQR() {
        // El generador no almacena usuarios o códigos como atributos
    }
    
    // DEPENDENCIA DE CREACIÓN: crea CódigoQR dentro del método pero no lo almacena
    public void generar(String valor, Usuario13 usuario) { // Ahora usa Usuario13
        System.out.println("========================");
        System.out.println(" GENERANDO CODIGO QR");
        System.out.println("========================");
        
        // CREAR el código QR (dependencia de creación)
        CodigoQR codigoQR = new CodigoQR(valor);
        
        // Establecer asociación unidireccional
        codigoQR.setUsuario(usuario);
        
        // Mostrar información del código generado
        System.out.println(" CODIGO QR CREADO EXITOSAMENTE");
        codigoQR.mostrarInformacion();
        System.out.println();
        
        // Simular proceso de generación
        simularGeneracionQR(codigoQR);
        
        // El código QR se usa localmente pero NO se almacena como atributo
        System.out.println(" Nota: El codigo QR fue creado y usado localmente");
        System.out.println("   pero no se almacena en el GeneradorQR");
        System.out.println("========================");
    }
    
    // Método privado para simular la generación
    private void simularGeneracionQR(CodigoQR codigoQR) {
        System.out.println(" Procesando codigo QR...");
        try {
            // Simular tiempo de procesamiento
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println(" Generando patron QR...");
            Thread.sleep(800);
            System.out.println(" Aplicando disenio...");
            Thread.sleep(600);
            System.out.println(" Codigo QR finalizado: " + codigoQR);
        } catch (InterruptedException e) {
            System.out.println(" Error en la generacion");
        }
    }
    
    // Método para generar múltiples códigos QR
    public void generarMultiplesQR(String[] valores, Usuario13 usuario) { // Ahora usa Usuario13
        System.out.println(" GENERANDO MULTIPLES CODIGOS QR");
        System.out.println("   Usuario: " + usuario.getNombre());
        
        for (int i = 0; i < valores.length; i++) {
            // CREAR código QR (dependencia de creación)
            CodigoQR qr = new CodigoQR(valores[i] + "-" + (i + 1));
            qr.setUsuario(usuario);
            
            System.out.println("    QR " + (i + 1) + ": " + qr.getValor().substring(0, Math.min(10, qr.getValor().length())) + "...");
        }
        System.out.println(" " + valores.length + " codigos QR generados temporalmente");
    }
    
    // Método para mostrar información del generador
    public void mostrarInformacion() {
        System.out.println(" GENERADOR DE CODIGOS QR");
        System.out.println("    Version: 3.2");
        System.out.println("    Capacidad: Generacion dinamica");
        System.out.println("    Almacenamiento: Ninguno (creacion temporal)");
    }
    
    // Método estático que también muestra dependencia de creación
    public static void demoGeneracionRapida(Usuario13 usuario) { // Ahora usa Usuario13
        System.out.println(" DEMOSTRACION RAPIDA:");
        GeneradorQR generador = new GeneradorQR();
        
        // Crear código QR temporalmente
        CodigoQR qrDemo = new CodigoQR("DEMO-" + System.currentTimeMillis());
        qrDemo.setUsuario(usuario);
        
        System.out.println("   Codigo demo: " + qrDemo);
        System.out.println("   Este codigo existe solo durante esta ejecucion");
    }
}