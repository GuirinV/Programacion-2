/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Reserva {
    private String fecha;
    private String hora;
    private ClienteRestaurante cliente; // Asociación unidireccional
    private Mesa mesa;                  // Agregación
    
    // Constructor
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // Métodos para establecer relaciones
    public void setCliente(ClienteRestaurante cliente) {
        this.cliente = cliente;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    // Getters
    public String getFecha() {
        return fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public ClienteRestaurante getCliente() {
        return cliente;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    // Setters
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    // Método para mostrar información completa
    public void mostrarInformacion() {
        System.out.println("RESERVA:");
        System.out.println("   Fecha: " + fecha);
        System.out.println("   Hora: " + hora);
        
        if (cliente != null) {
            System.out.println("   Cliente: " + cliente.getNombre());
        } else {
            System.out.println("   Cliente: No asignado");
        }
        
        if (mesa != null) {
            System.out.println("   Mesa: " + mesa);
        } else {
            System.out.println("   Mesa: No asignada");
        }
        System.out.println("---");
    }
    
    // Método para confirmar la reserva
    public void confirmarReserva() {
        System.out.println("CONFIRMANDO RESERVA:");
        System.out.println("   Fecha: " + fecha);
        System.out.println("   Hora: " + hora);
        
        if (cliente != null) {
            System.out.println("   A nombre de: " + cliente.getNombre());
        }
        
        if (mesa != null && mesa.estaDisponible()) {
            System.out.println("   " + mesa + " asignada");
            System.out.println("   Se enviara confirmacion a: " + 
                             (cliente != null ? cliente.getTelefono() : "sin telefono"));
        } else {
            System.out.println("   No se puede confirmar - Mesa no disponible");
        }
        System.out.println("---");
    }
    
    // Método para cancelar la reserva
    public void cancelarReserva() {
        System.out.println("CANCELANDO RESERVA:");
        System.out.println("   Reserva del " + fecha + " a las " + hora + " cancelada");
        if (cliente != null) {
            System.out.println("  Se notifico a: " + cliente.getNombre());
        }
        System.out.println("---");
    }
}
