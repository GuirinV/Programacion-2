/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio8 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE DOCUMENTOS CON FIRMA DIGITAL ===");
        System.out.println();
        
        // 1. Crear usuarios (existen independientemente - agregacion)
        System.out.println("1. Creando usuarios...");
        Usuario2 usuario1 = new Usuario2("David Martinez", "david.martinez@empresa.com"); // Usuario2
        Usuario2 usuario2 = new Usuario2("Veronica Lopez", "veronica.lopez@empresa.com"); // Usuario2
        
        usuario1.mostrarInformacion();
        usuario2.mostrarInformacion();
        System.out.println();
        
        // 2. Crear documentos con COMPOSICION: Documento → FirmaDigital
        System.out.println("2. Creando documentos (composicion)...");
        Documento contrato = new Documento(
            "Contrato de Servicios", 
            "Este documento establece los terminos y condiciones del servicio...",
            "a1b2c3d4e5f67890abcdef1234567890",
            "2024-05-20"
        );
        
        Documento informe = new Documento(
            "Informe Anual 2024",
            "El presente informe detalla las actividades realizadas durante el año fiscal 2024...",
            "z9y8x7w6v5u43210zyxwv9876543210",
            "2024-05-21"
        );
        
        System.out.println("Documentos creados con firma digital incorporada (composicion)");
        System.out.println();
        
        // 3. Establecer AGREGACION: FirmaDigital → Usuario2
        System.out.println("3. Estableciendo AGREGACION...");
        contrato.asignarFirmante(usuario1); // Usuario2
        informe.asignarFirmante(usuario2); // Usuario2
        
        System.out.println("Agregacion establecida: FirmaDigital -> Usuario2");
        System.out.println("   Los usuarios existen independientemente de las firmas");
        System.out.println();
        
        // 4. Mostrar informacion de documentos
        System.out.println("4. Informacion de documentos:");
        contrato.mostrarDocumento();
        System.out.println();
        informe.mostrarDocumento();
        System.out.println();
        
        // 5. Verificar integridad
        System.out.println("5. Verificacion de integridad:");
        contrato.verificarIntegridad();
        System.out.println();
        informe.verificarIntegridad();
        System.out.println();
        
        // 6. Demostrar COMPOSICION: Documento → FirmaDigital
        System.out.println("6. Demostrando COMPOSICION:");
        System.out.println("   La FirmaDigital se crea DENTRO del Documento");
        System.out.println("   No puede existir sin el Documento");
        System.out.println("   Firma del contrato: " + contrato.getFirmaDigital());
        System.out.println();
        
        // 7. Demostrar AGREGACION: FirmaDigital → Usuario2
        System.out.println("7. Demostrando AGREGACION:");
        System.out.println("   El Usuario2 existe independientemente de la FirmaDigital");
        System.out.println("   Mismo usuario puede firmar multiples documentos:");
        
        Documento otroDocumento = new Documento(
            "Anexo Tecnico",
            "Especificaciones tecnicas del proyecto...",
            "m5n6b7v8c9x0z1a2s3d4f5g6h7j8k9l0",
            "2024-05-22"
        );
        otroDocumento.asignarFirmante(usuario1); // Mismo Usuario2 firma otro documento
        
        System.out.println("   " + usuario1.getNombre() + " ha firmado 2 documentos");
        System.out.println();
        
        System.out.println("=== EJERCICIO 8 COMPLETADO ===");
    }
}