/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional
    
    // Constructor
    public Render(String formato) {
        this.formato = formato;
    }
    
    // Método para establecer asociación unidireccional
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    // Getters y Setters
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    
    public Proyecto getProyecto() { return proyecto; }
    
    @Override
    public String toString() {
        if (proyecto != null) {
            return "Render[" + formato + "] - " + proyecto.getNombre();
        }
        return "Render[" + formato + "]";
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" RENDER: Formato " + formato);
        if (proyecto != null) {
            System.out.println("    Proyecto: " + proyecto.getNombre());
            System.out.println("    Duracion: " + proyecto.getDuracionMin() + " min");
        } else {
            System.out.println("    Proyecto no asociado");
        }
    }
    
    // Método para simular el proceso de renderizado
    public void simularRender() {
        System.out.println(" INICIANDO RENDER...");
        System.out.println("   Formato: " + formato);
        
        if (proyecto != null) {
            System.out.println("   Proyecto: " + proyecto.getNombre());
            System.out.println("   Duracion: " + proyecto.getDuracionMin() + " min");
            
            // Calcular tiempo estimado de renderizado
            int tiempoEstimado = calcularTiempoRender();
            System.out.println("    Tiempo estimado: " + tiempoEstimado + " min");
            
            // Simular progreso
            simularProgreso(tiempoEstimado);
            
            System.out.println("    Render completado exitosamente");
        } else {
            System.out.println("    Error: No hay proyecto para renderizar");
        }
    }
    
    // Método privado para calcular tiempo de renderizado
    private int calcularTiempoRender() {
        if (proyecto != null) {
            // Tiempo base + tiempo por minuto de video
            return 5 + (proyecto.getDuracionMin() / 2);
        }
        return 0;
    }
    
    // Método privado para simular progreso
    private void simularProgreso(int tiempoTotal) {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(300);
                System.out.println("    Progreso: " + (i * 10) + "%");
            }
        } catch (InterruptedException e) {
            System.out.println("    Render interrumpido");
        }
    }
}