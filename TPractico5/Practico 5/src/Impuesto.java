/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional
    
    // Constructor
    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    // Método para establecer asociación unidireccional
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    // Getters y Setters
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    
    public Contribuyente getContribuyente() { return contribuyente; }
    
    @Override
    public String toString() {
        if (contribuyente != null) {
            return "Impuesto de $" + monto + " - " + contribuyente.getNombre();
        }
        return "Impuesto de $" + monto;
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" IMPUESTO: $" + monto);
        if (contribuyente != null) {
            System.out.println("    Contribuyente: " + contribuyente.getNombre());
            System.out.println("    CUI: " + contribuyente.getCui());
        } else {
            System.out.println("    Contribuyente no asignado");
        }
    }
    
    // Método para calcular impuesto básico (15%)
    public double calcularImpuestoBasico() {
        return monto * 0.15;
    }
}