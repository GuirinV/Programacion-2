/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class MainEjercicio7 {
    public static void main(String[] args) {
        // Crear motor (puede existir independientemente - agregación)
        Motor motor1 = new Motor("Nafta 1.6", "MTR-2024-001");
        Motor motor2 = new Motor("Diesel 2.0", "MTR-2024-002");
        
        // Crear conductores
        Conductor conductor1 = new Conductor("Veronica Guirin", "B12345678");
        Conductor conductor2 = new Conductor("Clara Martinez", "B87654321");
        
        // Crear vehículos con motor
        Vehiculo auto1 = new Vehiculo("ABC123", "Toyota Corolla", motor1);
        Vehiculo auto2 = new Vehiculo("XYZ789", "Ford Ranger", motor2);
        
        // Asignar conductores (asociación bidireccional)
        auto1.asignarConductor(conductor1);
        auto2.asignarConductor(conductor2);
        
        // Mostrar información
        System.out.println("=== SISTEMA DE VEHICULOS ===\n");
        System.out.println("Vehiculo 1:");
        System.out.println(auto1);
        
        System.out.println("\nVehiculo 2:");
        System.out.println(auto2);
        
        // Demostrar que el Motor puede existir sin Vehículo (agregación)
        System.out.println("\n=== MOTOR INDEPENDIENTE ===");
        Motor motorSuelto = new Motor("Electrico", "MTR-E-001");
        System.out.println("Motor creado independientemente: " + motorSuelto);
        
        // Demostrar cambio de conductor
        System.out.println("\n=== CAMBIO DE CONDUCTOR ===");
        auto1.removerConductor();
        System.out.println("Despues de remover conductor:");
        System.out.println(auto1);
    }
}