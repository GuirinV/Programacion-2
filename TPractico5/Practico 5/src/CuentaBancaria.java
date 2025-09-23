/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular10 titular;               // Ahora usa Titular10
    
    // Constructor con composición
    public CuentaBancaria(String cbu, double saldoInicial, String clave, String fechaCreacion) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.claveSeguridad = new ClaveSeguridad(clave, fechaCreacion);
    }
    
    // Método para establecer relación bidireccional
    public void setTitular(Titular10 titular) { // Ahora usa Titular10
        this.titular = titular;
        // Establecer referencia bidireccional
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    
    // Getters y Setters
    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }
    
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public Titular10 getTitular() { return titular; } // Ahora retorna Titular10
    
    // Métodos bancarios (sin cambios)
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println(" Deposito exitoso: +$" + monto);
            System.out.println("   Nuevo saldo: $" + saldo);
        } else {
            System.out.println(" Monto de deposito inválido");
        }
    }
    
    public void retirar(double monto, String clave) {
        if (claveSeguridad.verificarClave(clave)) {
            if (monto > 0 && monto <= saldo) {
                saldo -= monto;
                System.out.println(" Retiro exitoso: -$" + monto);
                System.out.println("   Nuevo saldo: $" + saldo);
            } else {
                System.out.println(" Fondos insuficientes o monto invalido");
            }
        } else {
            System.out.println(" Clave incorrecta - Retiro denegado");
        }
    }
    
    public void transferir(CuentaBancaria destino, double monto, String clave) {
        if (claveSeguridad.verificarClave(clave)) {
            if (monto > 0 && monto <= saldo) {
                this.saldo -= monto;
                destino.saldo += monto;
                System.out.println(" Transferencia exitosa: -$" + monto);
                System.out.println("   Destino: " + destino.getCbu());
                System.out.println("   Nuevo saldo: $" + saldo);
            } else {
                System.out.println(" Fondos insuficientes o monto invalido");
            }
        } else {
            System.out.println(" Clave incorrecta - Transferencia denegada");
        }
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(" CUENTA BANCARIA:");
        System.out.println("    CBU: " + cbu);
        System.out.println("    Saldo: $" + saldo);
        System.out.println("    " + claveSeguridad);
        
        if (titular != null) {
            System.out.println("   ? Titular: " + titular.getNombre());
        } else {
            System.out.println("    Sin titular asignado");
        }
    }
    
    // Método para cambiar clave de seguridad
    public void cambiarClaveSeguridad(String claveActual, String nuevaClave, String fecha) {
        if (claveSeguridad.verificarClave(claveActual)) {
            claveSeguridad.cambiarClave(nuevaClave, fecha);
            System.out.println(" Clave de seguridad actualizada");
        } else {
            System.out.println(" Clave actual incorrecta");
        }
    }
}