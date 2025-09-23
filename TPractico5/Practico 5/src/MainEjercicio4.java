/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio4 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 4: TARJETA DE CREDITO - CLIENTE - BANCO ===");
        System.out.println("Relaciones: TarjetaDeCredito <-> Cliente (Asociacion bidireccional)");
        System.out.println("Relaciones: TarjetaDeCredito -> Banco (Agregacion)");
        System.out.println();
        
        // 1. CREAR BANCO (Agregación)
        System.out.println("1. CREANDO BANCO...");
        Banco banco = new Banco("Banco Nacional", "30-12345678-9");
        System.out.println("Banco creado: " + banco);
        banco.mostrarInformacion();
        
        // 2. CREAR CLIENTE (Asociación bidireccional)
        System.out.println("2. CREANDO CLIENTE...");
        Cliente cliente = new Cliente("Clara Lopez", "11222333");
        System.out.println("Cliente creado: " + cliente);
        cliente.mostrarInformacion();
        
        // 3. CREAR TARJETA DE CRÉDITO
        System.out.println("3. CREANDO TARJETA DE CREDITO...");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/25");
        System.out.println("Tarjeta creada: " + tarjeta.getNumero());
        System.out.println("   Vencimiento: " + tarjeta.getFechaVencimiento());
        System.out.println();
        
        // 4. ESTABLECER AGREGACIÓN: Tarjeta → Banco
        System.out.println("4. ESTABLECIENDO AGREGACION...");
        tarjeta.setBanco(banco);
        System.out.println("Agregacion establecida: Tarjeta -> Banco");
        System.out.println("   El banco existe independientemente de la tarjeta");
        System.out.println();
        
        // 5. ESTABLECER ASOCIACIÓN BIDIRECCIONAL: Tarjeta ↔ Cliente
        System.out.println("5. ESTABLECIENDO ASOCIACION BIDIRECCIONAL...");
        cliente.setTarjeta(tarjeta);
        System.out.println("Asociacion bidireccional establecida: Tarjeta <-> Cliente");
        System.out.println("   Ambos objetos se conocen mutuamente");
        System.out.println();
        
        // 6. VERIFICAR RELACIONES DESDE LA TARJETA
        System.out.println("6. VERIFICANDO DESDE LA TARJETA:");
        tarjeta.mostrarInformacion();
        
        // 7. VERIFICAR RELACIONES DESDE EL CLIENTE
        System.out.println("7. VERIFICANDO DESDE EL CLIENTE:");
        cliente.mostrarInformacion();
        
        // 8. VERIFICAR RELACIONES DESDE EL BANCO
        System.out.println("8. VERIFICANDO DESDE EL BANCO:");
        banco.mostrarInformacion();
        
        // 9. DEMOSTRAR BIDIRECCIONALIDAD
        System.out.println("9. DEMOSTRANDO BIDIRECCIONALIDAD:");
        System.out.println("   Cliente conoce su tarjeta: " + (cliente.getTarjeta() != null));
        System.out.println("   Tarjeta conoce su cliente: " + (tarjeta.getCliente() != null));
        System.out.println("   Son la misma tarjeta: " + (cliente.getTarjeta() == tarjeta));
        System.out.println("   Son el mismo cliente: " + (tarjeta.getCliente() == cliente));
        System.out.println();
        
        // 10. DEMOSTRAR AGREGACIÓN
        System.out.println("10. DEMOSTRANDO AGREGACION:");
        System.out.println("   El banco puede existir sin tarjetas:");
        Banco otroBanco = new Banco("Banco Provincial", "30-87654321-0");
        System.out.println("   Otro banco: " + otroBanco);
        System.out.println("   Existe independientemente de cualquier tarjeta");
        System.out.println();
        
        // 11. REALIZAR OPERACIONES CON LA TARJETA
        System.out.println("11. REALIZANDO OPERACIONES:");
        tarjeta.realizarCompra(15000.50, "Compra en supermercado");
        tarjeta.realizarCompra(8999.99, "Compra en tienda electronica");
        System.out.println();
        
        // 12. CREAR MÁS TARJETAS Y CLIENTES
        System.out.println("12. CREANDO MAS CLIENTES Y TARJETAS:");
        
        // Segundo cliente y tarjeta
        Cliente cliente2 = new Cliente("Veronica Guirin", "44555666");
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito("9876-5432-1098-7654", "06/26");
        tarjeta2.setBanco(otroBanco);
        cliente2.setTarjeta(tarjeta2);
        
        cliente2.mostrarInformacion();
        tarjeta2.mostrarInformacion();
        tarjeta2.realizarCompra(25000.0, "Compra muebles");
        System.out.println();
        
        // 13. MODIFICAR DATOS
        System.out.println("13. MODIFICANDO DATOS:");
        cliente.setNombre("Viviana Lopez");
        banco.setNombre("Banco Nacional Argentino");
        tarjeta.setFechaVencimiento("12/27");
        
        System.out.println("   Cliente actualizado: " + cliente.getNombre());
        System.out.println("   Banco actualizado: " + banco.getNombre());
        System.out.println("   Tarjeta actualizada: Vence " + tarjeta.getFechaVencimiento());
        System.out.println();
        
        // 14. VERIFICAR CAMBIOS
        System.out.println("14. VERIFICANDO CAMBIOS:");
        tarjeta.mostrarInformacion();
        cliente.mostrarInformacion();
        banco.mostrarInformacion();
        
        System.out.println("=== EJERCICIO 4 COMPLETADO EXITOSAMENTE ===");
    }
}