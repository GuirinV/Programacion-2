/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class EditorVideo {
    // NO tiene atributos de asociación (solo dependencia de creación)
    
    // Constructor
    public EditorVideo() {
        // El editor no almacena proyectos o renders como atributos
    }
    
    // DEPENDENCIA DE CREACIÓN: crea Render dentro del método pero no lo almacena
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("========================");
        System.out.println(" EXPORTANDO PROYECTO");
        System.out.println("========================");
        
        // CREAR el render (dependencia de creación)
        Render render = new Render(formato); // ← CREACIÓN interna
        
        // Establecer asociación unidireccional
        render.setProyecto(proyecto);
        
        // Mostrar información de la exportación
        System.out.println(" CONFIGURACION DE EXPORTACION:");
        render.mostrarInformacion();
        System.out.println();
        
        // Simular proceso de exportación
        simularExportacion(render);
        
        // El render se usa localmente pero NO se almacena como atributo
        System.out.println(" Nota: El render fue creado y usado localmente");
        System.out.println("   pero no se almacena en el EditorVideo");
        System.out.println("========================");
    }
    
    // Método privado para simular la exportación
    private void simularExportacion(Render render) {
        System.out.println(" Preparando exportacion...");
        try {
            // Simular tiempo de preparación
            Thread.sleep(800);
            System.out.println(" Procesando video...");
            Thread.sleep(600);
            System.out.println(" Aplicando formato: " + render.getFormato());
            Thread.sleep(500);
            
            // Iniciar renderizado
            render.simularRender();
            
        } catch (InterruptedException e) {
            System.out.println(" Error en la exportacion");
        }
    }
    
    // Método para exportar múltiples formatos
    public void exportarMultiplesFormatos(String[] formatos, Proyecto proyecto) {
        System.out.println(" EXPORTANDO A MULTIPLES FORMATOS");
        System.out.println("   Proyecto: " + proyecto.getNombre());
        
        for (int i = 0; i < formatos.length; i++) {
            // CREAR render (dependencia de creación)
            Render render = new Render(formatos[i]);
            render.setProyecto(proyecto);
            
            System.out.println("    Formato " + (i + 1) + ": " + formatos[i]);
            
            // Simular exportación rápida
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("    Exportacion interrumpida");
            }
        }
        System.out.println(" " + formatos.length + " formatos configurados para exportacion");
    }
    
    // Método para mostrar información del editor
    public void mostrarInformacion() {
        System.out.println(" EDITOR DE VIDEO PROFESIONAL");
        System.out.println("    Version: 4.5");
        System.out.println("    Capacidad: Exportacion multiple");
        System.out.println("    Almacenamiento: Ninguno (creacion temporal de renders)");
    }
    
    // Método para previsualizar proyecto
    public void previsualizar(Proyecto proyecto) {
        System.out.println(" PREVISUALIZACION:");
        if (proyecto != null) {
            proyecto.mostrarInformacion();
            System.out.println("   ️  Reproduciendo preview...");
            System.out.println("    Calidad: Optima");
        } else {
            System.out.println("    No hay proyecto para previsualizar");
        }
    }
    
    // Método estático que también muestra dependencia de creación
    public static void demoExportacionRapida(Proyecto proyecto) {
        System.out.println(" DEMOSTRACION RAPIDA DE EXPORTACION:");
        EditorVideo editor = new EditorVideo();
        
        // Crear render temporalmente
        Render renderDemo = new Render("MP4-1080p");
        renderDemo.setProyecto(proyecto);
        
        System.out.println("   Render demo: " + renderDemo);
        System.out.println("   Este render existe solo durante esta ejecucion");
    }
}