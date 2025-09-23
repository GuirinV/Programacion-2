/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio14 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA EDITOR DE VIDEO ===");
        System.out.println();
        
        // 1. Crear proyectos
        System.out.println("1. CREANDO PROYECTOS...");
        Proyecto proyecto1 = new Proyecto("Documental Naturaleza", 45);
        Proyecto proyecto2 = new Proyecto("Cortometraje Drama", 25);
        Proyecto proyecto3 = new Proyecto("Tutorial Programacion", 15);
        Proyecto proyecto4 = new Proyecto("Video Musical", 4);
        
        proyecto1.mostrarInformacion();
        proyecto2.mostrarInformacion();
        proyecto3.mostrarInformacion();
        proyecto4.mostrarInformacion();
        System.out.println();
        
        // 2. Crear editor de video
        System.out.println("2. CREANDO EDITOR DE VIDEO...");
        EditorVideo editor = new EditorVideo();
        editor.mostrarInformacion();
        System.out.println();
        
        // 3. Establecer ASOCIACIÓN UNIDIRECCIONAL: Render → Proyecto
        System.out.println("3. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL...");
        System.out.println("   La asociacion se establece dentro del metodo exportar()");
        System.out.println("   Render -> Proyecto (unidireccional)");
        System.out.println();
        
        // 4. DEMOSTRAR DEPENDENCIA DE CREACIÓN: EditorVideo.exportar(String, Proyecto)
        System.out.println("4. DEMOSTRANDO DEPENDENCIA DE CREACION...");
        System.out.println("   EditorVideo crea Render internamente pero NO lo almacena");
        System.out.println();
        
        // Usar dependencia de creación múltiples veces
        System.out.println("PRIMERA EXPORTACION:");
        editor.exportar("MP4-1080p", proyecto1);
        System.out.println();
        
        System.out.println("SEGUNDA EXPORTACION:");
        editor.exportar("AVI-HD", proyecto2);
        System.out.println();
        
        System.out.println("TERCERA EXPORTACION:");
        editor.exportar("MOV-4K", proyecto3);
        System.out.println();
        
        // 5. Demostrar que el editor NO almacena los renders
        System.out.println("5. EL EDITOR NO ALMACENA RENDERS:");
        System.out.println("   Despues de exportar, el editor no mantiene referencia");
        System.out.println("   Puede exportar diferentes proyectos en diferentes momentos");
        System.out.println();
        
        // 6. Exportar múltiples formatos
        System.out.println("6. EXPORTACION MULTIPLE:");
        String[] formatos = {"MP4-720p", "WEBM", "MKV", "MP4-4K"};
        editor.exportarMultiplesFormatos(formatos, proyecto4);
        System.out.println();
        
        // 7. Demostrar ASOCIACIÓN UNIDIRECCIONAL manualmente
        System.out.println("7. ASOCIACION UNIDIRECCIONAL MANUAL:");
        Render renderManual = new Render("TEST-FORMAT");
        renderManual.setProyecto(proyecto2); // Establecer asociación
        
        System.out.println("   Render creado: " + renderManual);
        System.out.println("   Render conoce al proyecto: " + (renderManual.getProyecto() != null));
        System.out.println("   Proyecto NO conoce el render: true");
        System.out.println();
        
        // 8. Simular renderizado manual
        System.out.println("8. RENDERIZADO MANUAL:");
        renderManual.simularRender();
        System.out.println();
        
        // 9. Previsualizar proyectos
        System.out.println("9. PREVISUALIZACION DE PROYECTOS:");
        editor.previsualizar(proyecto1);
        System.out.println();
        editor.previsualizar(proyecto3);
        System.out.println();
        
        // 10. Usar método estático con dependencia de creación
        System.out.println("10. METODO ESTATICO CON DEPENDENCIA DE CREACION:");
        EditorVideo.demoExportacionRapida(proyecto1);
        System.out.println();
        
        // 11. Demostrar reutilización de proyectos
        System.out.println("11. REUTILIZACION DE PROYECTOS:");
        System.out.println("   Mismo proyecto puede exportarse en multiples formatos:");
        System.out.println("   Proyecto: " + proyecto1.getNombre());
        System.out.println("   Puede exportarse en infinitos formatos diferentes");
        System.out.println();
        
        // 12. Exportar el mismo proyecto en otro formato
        System.out.println("12. EXPORTACION ADICIONAL MISMO PROYECTO:");
        editor.exportar("WEBM-HD", proyecto1);
        System.out.println();
        
        // 13. Verificar si los proyectos son largos
        System.out.println("13. ANALISIS DE PROYECTOS:");
        System.out.println("   " + proyecto1.getNombre() + " es largo: " + proyecto1.esProyectoLargo());
        System.out.println("   " + proyecto4.getNombre() + " es largo: " + proyecto4.esProyectoLargo());
        System.out.println();
        
        System.out.println("=== EJERCICIO 14 COMPLETADO ===");
    }
}
