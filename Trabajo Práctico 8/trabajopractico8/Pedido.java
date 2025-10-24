/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author veron
 */

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;
    
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
        }
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    // Getters
    public List<Producto> getProductos() {
        return productos;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public String getEstado() {
        return estado;
    }
    
    @Override
    public String toString() {
        return "Pedido de " + cliente.getNombre() + " - Estado: " + estado + " - Total: $" + calcularTotal();
    }
}