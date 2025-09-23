/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio13 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA GENERADOR DE CODIGOS QR ===");
        System.out.println();
        
        // 1. Crear usuarios (ahora Usuario13)
        System.out.println("1. CREANDO USUARIOS...");
        Usuario13 usuario1 = new Usuario13("Veronica Guirin", "veronica.guirin@email.com"); // Usuario13
        Usuario13 usuario2 = new Usuario13("David Lopez", "daavid.lopez@empresa.com"); // Usuario13
        Usuario13 usuario3 = new Usuario13("Gabriela Garcia", "gabriela.garcia@servicio.com"); // Usuario13
        
        usuario1.mostrarInformacion();
        usuario2.mostrarInformacion();
        usuario3.mostrarInformacion();
        System.out.println();
        
        // 2. Crear generador QR
        System.out.println("2. CREANDO GENERADOR QR...");
        GeneradorQR generador = new GeneradorQR();
        generador.mostrarInformacion();
        System.out.println();
        
        // 3. Establecer ASOCIACIÓN UNIDIRECCIONAL: CódigoQR → Usuario13
        System.out.println("3. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL...");
        System.out.println("   La asociacion se establece dentro del metodo generar()");
        System.out.println("   CodigoQR -> Usuario13 (unidireccional)");
        System.out.println();
        
        // 4. DEMOSTRAR DEPENDENCIA DE CREACIÓN: GeneradorQR.generar(String, Usuario13)
        System.out.println("4. DEMOSTRANDO DEPENDENCIA DE CREACION...");
        System.out.println("   GeneradorQR crea CodigoQR internamente pero NO lo almacena");
        System.out.println();
        
        // Usar dependencia de creación múltiples veces
        System.out.println("PRIMERA GENERACION:");
        generador.generar("https://www.ejemplo.com/perfil/ver123", usuario1);
        System.out.println();
        
        System.out.println("SEGUNDA GENERACION:");
        generador.generar("WiFi:T:WPA;S:MiRed;P:clave123;;", usuario2);
        System.out.println();
        
        System.out.println("TERCERA GENERACION:");
        generador.generar("BEGIN:VCARD\nVERSION:3.0\nN:Guirin;Veronica\nORG:Empresa XYZ\nTEL:123456789\nEMAIL:veronica@email.com\nEND:VCARD", usuario1);
        System.out.println();
        
        // 5. Demostrar que el generador NO almacena los códigos QR
        System.out.println("5. EL GENERADOR NO ALMACENA CODIGOS QR:");
        System.out.println("   Despues de generar, el generador no mantiene referencia");
        System.out.println("   Puede generar diferentes codigos en diferentes momentos");
        System.out.println();
        
        // 6. Generar múltiples códigos QR
        System.out.println("6. GENERACION MULTIPLE:");
        String[] valores = {"Producto-A", "Producto-B", "Producto-C", "Promo-25"};
        generador.generarMultiplesQR(valores, usuario3);
        System.out.println();
        
        // 7. Demostrar ASOCIACIÓN UNIDIRECCIONAL manualmente
        System.out.println("7. ASOCIACION UNIDIRECCIONAL MANUAL:");
        CodigoQR codigoManual = new CodigoQR("Manual-Test-123");
        codigoManual.setUsuario(usuario2); // Establecer asociación
        
        System.out.println("   Codigo creado: " + codigoManual);
        System.out.println("   Codigo conoce al usuario: " + (codigoManual.getUsuario() != null));
        System.out.println("   Usuario NO conoce el codigo: true");
        System.out.println();
        
        // 8. Escanear código QR
        System.out.println("8. ESCANEO DE CODIGO QR:");
        codigoManual.escanear();
        System.out.println();
        
        // 9. Usar método estático con dependencia de creación
        System.out.println("9. METODO ESTATICO CON DEPENDENCIA DE CREACION:");
        GeneradorQR.demoGeneracionRapida(usuario1);
        System.out.println();
        
        // 10. Demostrar reutilización de usuarios
        System.out.println("10. REUTILIZACION DE USUARIOS:");
        System.out.println("   Mismo usuario puede tener multiples codigos QR:");
        System.out.println("   Usuario: " + usuario1.getNombre());
        System.out.println("   Puede generar infinitos codigos QR diferentes");
        System.out.println();
        
        // 11. Generar código adicional para el mismo usuario
        System.out.println("11. GENERACION ADICIONAL MISMO USUARIO:");
        generador.generar("Evento-Conferencia-2024", usuario1);
        System.out.println();
        
        System.out.println("=== EJERCICIO 13 COMPLETADO ===");
    }
}