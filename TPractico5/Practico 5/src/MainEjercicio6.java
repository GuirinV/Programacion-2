/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio6 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 6: RESERVA - CLIENTE - MESA ===");
        System.out.println("Relaciones: Reserva -> Cliente (Asociacion unidireccional)");
        System.out.println("Relaciones: Reserva -> Mesa (Agregacion)");
        System.out.println();
        
        // 1. CREAR CLIENTE (Asociación unidireccional)
        System.out.println("1. CREANDO CLIENTE...");
        ClienteRestaurante cliente = new ClienteRestaurante("Veronica Guirin", "1155667788");
        System.out.println("Cliente creado: " + cliente);
        cliente.mostrarInformacion();
        
        // 2. CREAR MESA (Agregación)
        System.out.println("2. CREANDO MESA...");
        Mesa mesa = new Mesa(5, 4);
        System.out.println("Mesa creada: " + mesa);
        mesa.mostrarInformacion();
        
        // 3. CREAR RESERVA
        System.out.println("3. CREANDO RESERVA...");
        Reserva reserva = new Reserva("2023-11-15", "20:30");
        System.out.println("Reserva creada: " + reserva.getFecha() + " a las " + reserva.getHora());
        System.out.println();
        
        // 4. ESTABLECER ASOCIACIÓN UNIDIRECCIONAL: Reserva → Cliente
        System.out.println("4. ESTABLECIENDO ASOCIACION UNIDIRECCIONAL...");
        reserva.setCliente(cliente);
        System.out.println("Asociacion establecida: Reserva -> Cliente");
        System.out.println("   La reserva conoce al cliente, pero el cliente NO conoce la reserva");
        System.out.println();
        
        // 5. ESTABLECER AGREGACIÓN: Reserva → Mesa
        System.out.println("5. ESTABLECIENDO AGREGACION...");
        reserva.setMesa(mesa);
        System.out.println("Agregacion establecida: Reserva -> Mesa");
        System.out.println("   La mesa existe independientemente de la reserva");
        System.out.println();
        
        // 6. VERIFICAR RELACIONES DESDE LA RESERVA
        System.out.println("6. VERIFICANDO DESDE LA RESERVA:");
        reserva.mostrarInformacion();
        
        // 7. DEMOSTRAR ASOCIACIÓN UNIDIRECCIONAL
        System.out.println("7. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println("   Reserva conoce al Cliente: " + (reserva.getCliente() != null));
        System.out.println("   Cliente NO tiene referencia a la Reserva: " + true);
        System.out.println("   (Asociacion solo en una direccion)");
        System.out.println();
        
        // 8. DEMOSTRAR AGREGACIÓN
        System.out.println("8. DEMOSTRANDO AGREGACION:");
        System.out.println("   La mesa puede existir sin reservas:");
        Mesa otraMesa = new Mesa(8, 6);
        System.out.println("   Otra mesa: " + otraMesa);
        System.out.println("   Existe independientemente de cualquier reserva");
        System.out.println();
        
        // 9. CONFIRMAR LA RESERVA
        System.out.println("9. CONFIRMANDO RESERVA:");
        reserva.confirmarReserva();
        
        // 10. CREAR MÁS RESERVAS
        System.out.println("10. CREANDO MAS RESERVAS:");
        
        // Reserva 2 - mismo cliente, diferente mesa
        Reserva reserva2 = new Reserva("2023-11-16", "21:00");
        reserva2.setCliente(cliente);
        reserva2.setMesa(otraMesa);
        
        System.out.println("   Segunda reserva creada:");
        reserva2.mostrarInformacion();
        reserva2.confirmarReserva();
        System.out.println();
        
        // 11. CREAR CLIENTE Y RESERVA NUEVOS
        System.out.println("11. CREANDO NUEVO CLIENTE Y RESERVA:");
        
        ClienteRestaurante cliente2 = new ClienteRestaurante("Carlitos Jimenez", "1199887766");
        Reserva reserva3 = new Reserva("2023-11-17", "19:00");
        Mesa mesa3 = new Mesa(3, 2);
        
        reserva3.setCliente(cliente2);
        reserva3.setMesa(mesa3);
        
        cliente2.mostrarInformacion();
        reserva3.mostrarInformacion();
        reserva3.confirmarReserva();
        System.out.println();
        
        // 12. MODIFICAR DATOS
        System.out.println("12. MODIFICANDO DATOS:");
        cliente.setTelefono("1155667799");
        reserva.setHora("20:45");
        mesa.setCapacidad(5); // Cambiamos capacidad de la mesa
        
        System.out.println("   Telefono actualizado: " + cliente.getTelefono());
        System.out.println("   Hora actualizada: " + reserva.getHora());
        System.out.println("   Capacidad de mesa actualizada: " + mesa.getCapacidad() + " personas");
        System.out.println();
        
        // 13. VERIFICAR CAMBIOS
        System.out.println("13. VERIFICANDO CAMBIOS:");
        reserva.mostrarInformacion();
        cliente.mostrarInformacion();
        mesa.mostrarInformacion();
        
        // 14. CANCELAR UNA RESERVA
        System.out.println("14. CANCELANDO RESERVA:");
        reserva2.cancelarReserva();
        
        // 15. DEMOSTRAR QUE EL CLIENTE NO CONOCE LA RESERVA
        System.out.println("15. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println("   El cliente " + cliente.getNombre() + " tiene 2 reservas:");
        System.out.println("   - " + reserva.getFecha() + " a las " + reserva.getHora());
        System.out.println("   - " + reserva2.getFecha() + " a las " + reserva2.getHora() + " (cancelada)");
        System.out.println("   Pero el cliente NO tiene referencia directa a estas reservas");
        System.out.println("   Esto demuestra la ASOCIACION UNIDIRECCIONAL");
        System.out.println();
        
        System.out.println("=== EJERCICIO 6 COMPLETADO EXITOSAMENTE ===");
    }
}
