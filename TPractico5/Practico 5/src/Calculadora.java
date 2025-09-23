/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Calculadora {
    // NO tiene atributos de asociación (solo dependencia de uso)
    
    // Constructor
    public Calculadora() {
        // La calculadora no almacena impuestos como atributos
    }
    
    // DEPENDENCIA DE USO: usa Impuesto como parámetro pero no lo almacena
    public void calcular(Impuesto impuesto) {
        System.out.println("========================");
        System.out.println(" CALCULADORA FISCAL");
        System.out.println("========================");
        
        if (impuesto != null) {
            System.out.println(" CALCULANDO IMPUESTO...");
            
            // Mostrar información del impuesto
            impuesto.mostrarInformacion();
            System.out.println();
            
            // Realizar cálculos
            double impuestoBasico = impuesto.calcularImpuestoBasico();
            double impuestoAdicional = calcularImpuestoAdicional(impuesto.getMonto());
            double total = impuestoBasico + impuestoAdicional;
            
            // Mostrar resultados
            System.out.println(" RESULTADOS:");
            System.out.println(" Impuesto basico (15%): $" + String.format("%.2f", impuestoBasico));
            System.out.println(" Impuesto adicional: $" + String.format("%.2f", impuestoAdicional));
            System.out.println(" TOTAL A PAGAR: $" + String.format("%.2f", total));
            
            // Mostrar fecha de vencimiento
            System.out.println(" Vencimiento: " + obtenerFechaVencimiento());
            
        } else {
            System.out.println(" No hay impuesto para calcular");
        }
        System.out.println("========================");
    }
    
    // Método privado para cálculo adicional (dependencia interna)
    private double calcularImpuestoAdicional(double monto) {
        if (monto > 10000) {
            return monto * 0.05; // 5% adicional para montos altos
        }
        return 0;
    }
    
    // Método para obtener fecha de vencimiento
    private String obtenerFechaVencimiento() {
        return "2025-11-30"; // Fecha fija para el ejemplo
    }
    
    // Método para mostrar información de la calculadora
    public void mostrarInformacion() {
        System.out.println(" Calculadora Fiscal Oficial");
        System.out.println(" Version: 2.1");
        System.out.println(" Algoritmos: Reglamento fiscal 2024");
    }
    
    // Otro método con dependencia de uso
    public void verificarEstadoFiscal(Impuesto impuesto) {
        System.out.println(" VERIFICANDO ESTADO FISCAL:");
        if (impuesto != null && impuesto.getContribuyente() != null) {
            System.out.println(" Contribuyente: " + impuesto.getContribuyente().getNombre());
            System.out.println(" CUI: " + impuesto.getContribuyente().getCui());
            System.out.println(" Monto declarado: $" + impuesto.getMonto());
            System.out.println(" Estado: AL DIA");
        } else {
            System.out.println(" Informacion incompleta");
        }
    }
    
    // Método estático que también muestra dependencia de uso
    public static void mostrarTasasFiscales(Impuesto impuesto) {
        System.out.println(" TASAS FISCALES VIGENTES:");
        System.out.println(" Tasa basica: 15%");
        System.out.println(" Tasa adicional (montos > $10,000): 5%");
        if (impuesto != null) {
            System.out.println(" Monto aplicable: $" + impuesto.getMonto());
        }
    }
}