/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio10 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO ===");
        System.out.println();
        
        // 1. Crear titulares (ahora Titular10)
        System.out.println("1. CREANDO TITULARES...");
        Titular10 titular1 = new Titular10("Ana Martinez", "12345678A"); // Titular10
        Titular10 titular2 = new Titular10("Carlos Lopez", "87654321B"); // Titular10
        
        titular1.mostrarInformacion();
        titular2.mostrarInformacion();
        System.out.println();
        
        // 2. Crear cuentas bancarias con COMPOSICION
        System.out.println("2. CREANDO CUENTAS BANCARIAS (composicion)...");
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890123456789012", 50000.0, "1234", "2024-01-15");
        CuentaBancaria cuenta2 = new CuentaBancaria("9876543210987654321098", 25000.0, "5678", "2024-02-20");
        
        System.out.println("Cuentas creadas con clave de seguridad incorporada (composicion)");
        cuenta1.mostrarInformacion();
        System.out.println();
        cuenta2.mostrarInformacion();
        System.out.println();
        
        // 3. Establecer ASOCIACIÓN BIDIRECCIONAL: CuentaBancaria ↔ Titular10
        System.out.println("3. ESTABLECIENDO ASOCIACION BIDIRECCIONAL...");
        cuenta1.setTitular(titular1); // Titular10
        cuenta2.setTitular(titular2); // Titular10
        
        System.out.println("Asociacion bidireccional establecida: CuentaBancaria ↔ Titular10");
        System.out.println("   Ambos objetos se conocen mutuamente");
        System.out.println();
        
        // 4. Mostrar información actualizada
        System.out.println("4. INFORMACION ACTUALIZADA:");
        titular1.mostrarInformacion();
        System.out.println();
        titular2.mostrarInformacion();
        System.out.println();
        cuenta1.mostrarInformacion();
        System.out.println();
        cuenta2.mostrarInformacion();
        System.out.println();
        
        // 5. Realizar operaciones bancarias
        System.out.println("5. OPERACIONES BANCARIAS:");
        
        // Depósito
        System.out.println(" REALIZANDO DEPOSITO...");
        cuenta1.depositar(15000.0);
        System.out.println();
        
        // Retiro (éxito)
        System.out.println(" REALIZANDO RETIRO (exito)...");
        cuenta1.retirar(8000.0, "1234");
        System.out.println();
        
        // Retiro (clave incorrecta)
        System.out.println(" REALIZANDO RETIRO (clave incorrecta)...");
        cuenta1.retirar(5000.0, "0000");
        System.out.println();
        
        // Transferencia
        System.out.println(" REALIZANDO TRANSFERENCIA...");
        cuenta1.transferir(cuenta2, 10000.0, "1234");
        System.out.println();
        
        // Mostrar saldos finales
        System.out.println(" SALDOS FINALES:");
        System.out.println("   Cuenta 1: $" + cuenta1.getSaldo());
        System.out.println("   Cuenta 2: $" + cuenta2.getSaldo());
        System.out.println();
        
        // 6. Cambiar clave de seguridad
        System.out.println("6. CAMBIANDO CLAVE DE SEGURIDAD...");
        cuenta1.cambiarClaveSeguridad("1234", "4321", "2024-05-20");
        System.out.println();
        
        // 7. Demostrar COMPOSICIÓN: CuentaBancaria → ClaveSeguridad
        System.out.println("7. DEMOSTRANDO COMPOSICION:");
        System.out.println("   La ClaveSeguridad se crea DENTRO de CuentaBancaria");
        System.out.println("   No puede existir sin la cuenta: " + cuenta1.getClaveSeguridad());
        System.out.println();
        
        // 8. Demostrar ASOCIACIÓN BIDIRECCIONAL: CuentaBancaria ↔ Titular10
        System.out.println("8. DEMOSTRANDO ASOCIACION BIDIRECCIONAL:");
        System.out.println("   Cuenta conoce al titular: " + (cuenta1.getTitular() != null));
        System.out.println("   Titular conoce la cuenta: " + (titular1.getCuenta() != null));
        System.out.println("   Misma referencia: " + (cuenta1.getTitular() == titular1));
        System.out.println();
        
        // 9. Verificar independencia de titulares
        System.out.println("9. INDEPENDENCIA DE TITULARES:");
        System.out.println("   Los titulares existen independientemente de las cuentas");
        
        Titular10 titular3 = new Titular10("Laura Garcia", "55555555C"); // Titular10
        System.out.println("   Nuevo titular creado: " + titular3);
        System.out.println("   Puede ser asignado a una cuenta posteriormente");
        System.out.println();
        
        System.out.println("=== EJERCICIO 10 COMPLETADO ===");
    }
}