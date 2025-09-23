/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;        // Asociación bidireccional
    private Banco banco;           // Agregación
    
    // Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    // Métodos para establecer relaciones
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    // Método para establecer relación bidireccional
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        // Establecer referencia bidireccional
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    
    // Getters
    public String getNumero() {
        return numero;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Banco getBanco() {
        return banco;
    }
    
    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    // Método para mostrar información completa
    public void mostrarInformacion() {
        System.out.println("TARJETA DE CREDITO");
        System.out.println("Numero: " + numero);
        System.out.println("Vencimiento: " + fechaVencimiento);
        
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre());
        } else {
            System.out.println("Cliente: No asignado");
        }
        
        if (banco != null) {
            System.out.println("Banco: " + banco.getNombre());
        } else {
            System.out.println("Banco: No asignado");
        }
        System.out.println("---");
    }
    
    // Método para realizar compra
    public void realizarCompra(double monto, String descripcion) {
        if (cliente != null && banco != null) {
            System.out.println("Compra realizada con tarjeta " + numero);
            System.out.println("Monto: $" + monto);
            System.out.println("Descripcion: " + descripcion);
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Banco: " + banco.getNombre());
            System.out.println("Transaccion aprobada");
        } else {
            System.out.println("No se puede realizar la compra - Tarjeta incompleta");
        }
        System.out.println("---");
    }
}