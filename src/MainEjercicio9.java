/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio9 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CITAS MEDICAS ===");
        System.out.println();
        
        // 1. Crear pacientes
        System.out.println("1. CREANDO PACIENTES...");
        Paciente paciente1 = new Paciente("Veronica Guirin", "OSDE");
        Paciente paciente2 = new Paciente("Clara Rodriguez", "Swiss Medical");
        Paciente paciente3 = new Paciente("David Fernandez", "Galeno");
        
        paciente1.mostrarInformacion();
        paciente2.mostrarInformacion();
        paciente3.mostrarInformacion();
        System.out.println();
        
        // 2. Crear profesionales
        System.out.println("2. CREANDO PROFESIONALES...");
        Profesional drUrbano = new Profesional("Urbano", "Cardiologia");
        Profesional draManes = new Profesional("Manes", "Pediatria");
        Profesional drLopez = new Profesional("Lopez", "Traumatologia");
        
        drUrbano.mostrarInformacion();
        draManes.mostrarInformacion();
        drLopez.mostrarInformacion();
        System.out.println();
        
        // 3. Crear citas médicas
        System.out.println("3. CREANDO CITAS MEDICAS...");
        CitaMedica cita1 = new CitaMedica("2025-10-20", "10:00");
        CitaMedica cita2 = new CitaMedica("2025-10-21", "11:30");
        CitaMedica cita3 = new CitaMedica("2025-10-22", "16:00");
        
        System.out.println("Citas creadas para:");
        System.out.println("   - " + cita1.getFecha() + " a las " + cita1.getHora());
        System.out.println("   - " + cita2.getFecha() + " a las " + cita2.getHora());
        System.out.println("   - " + cita3.getFecha() + " a las " + cita3.getHora());
        System.out.println();
        
        // 4. Establecer ASOCIACIONES UNIDIRECCIONALES
        System.out.println("4. ESTABLECIENDO ASOCIACIONES UNIDIRECCIONALES...");
        
        // Cita 1: Veronica Guirin con Dr. Urbano (Cardiología)
        cita1.setPaciente(paciente1);
        cita1.setProfesional(drUrbano);
        
        // Cita 2: Clara Rodriguez con Dra. Manes (Pediatría)
        cita2.setPaciente(paciente2);
        cita2.setProfesional(draManes);
        
        // Cita 3: David Fernandez con Dr. López (Traumatología)
        cita3.setPaciente(paciente3);
        cita3.setProfesional(drLopez);
        
        System.out.println("Asociaciones unidireccionales establecidas:");
        System.out.println("   CitaMedica -> Paciente");
        System.out.println("   CitaMedica ->Profesional");
        System.out.println("   (Solo la cita conoce al paciente y al profesional)");
        System.out.println();
        
        // 5. Mostrar información de las citas
        System.out.println("5. INFORMACION DE CITAS:");
        cita1.mostrarCita();
        cita2.mostrarCita();
        cita3.mostrarCita();
        
        // 6. Confirmar citas
        System.out.println("6. CONFIRMACION DE CITAS:");
        cita1.confirmarCita();
        cita2.confirmarCita();
        cita3.confirmarCita();
        System.out.println();
        
        // 7. Realizar consultas médicas
        System.out.println("7. REALIZANDO CONSULTAS:");
        cita1.realizarConsulta();
        System.out.println();
        cita2.realizarConsulta();
        System.out.println();
        
        // 8. Demostrar ASOCIACIÓN UNIDIRECCIONAL
        System.out.println("8. DEMOSTRANDO ASOCIACION UNIDIRECCIONAL:");
        System.out.println("   Cita conoce al paciente: " + (cita1.getPaciente() != null));
        System.out.println("   Paciente NO conoce la cita: true");
        System.out.println("   Cita conoce al profesional: " + (cita1.getProfesional() != null));
        System.out.println("   Profesional NO conoce la cita: true");
        System.out.println();
        
        // 9. Cancelar una cita
        System.out.println("9. CANCELACION DE CITA:");
        cita3.cancelarCita();
        System.out.println();
        
        // 10. Mostrar que pacientes y profesionales son independientes
        System.out.println("10. INDEPENDENCIA DE OBJETOS:");
        System.out.println("   Los pacientes y profesionales existen independientemente");
        System.out.println("   Pueden participar en multiples citas:");
        
        // Crear otra cita con el mismo paciente y profesional
        CitaMedica cita4 = new CitaMedica("2024-05-25", "09:00");
        cita4.setPaciente(paciente1);    // Mismo paciente
        cita4.setProfesional(drUrbano);  // Mismo profesional
        
        System.out.println("   " + paciente1.getNombre() + " tiene 2 citas con " + drUrbano.getNombre());
        cita4.mostrarCita();
        
        System.out.println("=== EJERCICIO 9 COMPLETADO ===");
    }
}