/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio12 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CALCULO FISCAL ===");
        System.out.println();
        
        // 1. Crear contribuyentes
        System.out.println("1. CREANDO CONTRIBUYENTES...");
        Contribuyente contribuyente1 = new Contribuyente("Veronica Guirin", "CUI-00123456");
        Contribuyente contribuyente2 = new Contribuyente("David Lopez", "CUI-00765432");
        Contribuyente contribuyente3 = new Contribuyente("Empresa XYZ S.A.", "CUI-20123456");
        
        contribuyente1.mostrarInformacion();
        contribuyente2.mostrarInformacion();
        contribuyente3.mostrarInformacion();
        System.out.println();
        
        // 2. Crear impuestos
        System.out.println("2. CREANDO IMPUESTOS...");
        Impuesto impuesto1 = new Impuesto(8500.0);
        Impuesto impuesto2 = new Impuesto(12500.0);
        Impuesto impuesto3 = new Impuesto(5000.0);
        Impuesto impuesto4 = new Impuesto(18000.0); // Sin contribuyente
        
        System.out.println("Impuestos creados:");
        System.out.println("   - $" + impuesto1.getMonto());
        System.out.println("   - $" + impuesto2.getMonto());
        System.out.println("   - $" + impuesto3.getMonto());
        System.out.println("   - $" + impuesto4.getMonto());
        System.out.println();
        
        // 3. Establecer ASOCIACIÓN UNIDIRECCIONAL: Impuesto → Contribuyente
        System.out.println("3. ESTABLECIENDO ASOCIACION UNIDIRECCIONAL...");
        impuesto1.setContribuyente(contribuyente1);
        impuesto2.setContribuyente(contribuyente2);
        impuesto3.setContribuyente(contribuyente3);
        // impuesto4 queda sin contribuyente para demostrar el caso
        
        System.out.println("Asociacion unidireccional establecida: Impuesto -> Contribuyente");
        System.out.println(" El impuesto conoce al contribuyente, pero el contribuyente NO conoce el impuesto");
        System.out.println();
        
        // 4. Mostrar información de los impuestos
        System.out.println("4. INFORMACION DE IMPUESTOS:");
        impuesto1.mostrarInformacion();
        System.out.println();
        impuesto2.mostrarInformacion();
        System.out.println();
        impuesto3.mostrarInformacion();
        System.out.println();
        impuesto4.mostrarInformacion();
        System.out.println();
        
        // 5. Crear calculadora
        System.out.println("5. CREANDO CALCULADORA...");
        Calculadora calculadora = new Calculadora();
        calculadora.mostrarInformacion();
        System.out.println();
        
        // 6. DEMOSTRAR DEPENDENCIA DE USO: Calculadora.calcular(Impuesto)
        System.out.println("6. DEMOSTRANDO DEPENDENCIA DE USO...");
        System.out.println("   Calculadora usa Impuesto como parametro pero NO lo almacena");
        System.out.println();
        
        // Usar dependencia de uso múltiples veces
        System.out.println("PRIMER CALCULO:");
        calculadora.calcular(impuesto1); // Dependencia de uso
        System.out.println();
        
        System.out.println("SEGUNDO CALCULO:");
        calculadora.calcular(impuesto2); // Dependencia de uso
        System.out.println();
        
        System.out.println("TERCER CALCULO:");
        calculadora.calcular(impuesto3); // Dependencia de uso
        System.out.println();
        
        // 7. Demostrar que la calculadora NO almacena los impuestos
        System.out.println("7. LA CALCULADORA NO ALMACENA IMPUESTOS:");
        System.out.println(" Despues de calcular, la calculadora no mantiene referencia");
        System.out.println(" Puede calcular diferentes impuestos en diferentes momentos");
        System.out.println();
        
        // 8. Verificar estado fiscal usando dependencia de uso
        System.out.println("8. VERIFICACION DE ESTADO FISCAL:");
        calculadora.verificarEstadoFiscal(impuesto1);
        System.out.println();
        calculadora.verificarEstadoFiscal(impuesto4); // Impuesto sin contribuyente
        System.out.println();
        
        // 9. Demostrar ASOCIACIÓN UNIDIRECCIONAL
        System.out.println("9. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println(" Impuesto conoce al contribuyente: " + (impuesto1.getContribuyente() != null));
        System.out.println(" Contribuyente NO conoce el impuesto: true");
        System.out.println(" Contribuyente existe independientemente: " + contribuyente1);
        System.out.println();
        
        // 10. Demostrar que los impuestos pueden cambiar de contribuyente
        System.out.println("10. CAMBIANDO CONTRIBUYENTE DE IMPUESTO:");
        System.out.println(" Antes: " + impuesto1);
        impuesto1.setContribuyente(contribuyente3); // Cambiar contribuyente
        System.out.println(" Despues: " + impuesto1);
        System.out.println();
        
        // 11. Recalcular con el contribuyente cambiado
        System.out.println("11. RECALCULANDO CON CONTRIBUYENTE CAMBIADO:");
        calculadora.calcular(impuesto1);
        System.out.println();
        
        // 12. Usar método estático con dependencia de uso
        System.out.println("12. METODO ESTATICO CON DEPENDENCIA:");
        Calculadora.mostrarTasasFiscales(impuesto2);
        System.out.println();
        
        // 13. Mostrar cálculos individuales
        System.out.println("13. CALCULOS INDIVIDUALES:");
        System.out.println(" Impuesto basico de $" + impuesto3.getMonto() + ": $" + 
                          String.format("%.2f", impuesto3.calcularImpuestoBasico()));
        System.out.println();
        
        System.out.println("=== EJERCICIO 12 COMPLETADO ===");
    }
}