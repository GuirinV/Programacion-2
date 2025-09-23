/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;        // Asociación unidireccional
    private Profesional profesional;  // Asociación unidireccional
    
    // Constructor
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // Métodos para establecer relaciones unidireccionales
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    // Getters y Setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
    
    // Método para mostrar información de la cita
    public void mostrarCita() {
        System.out.println(" CITA MEDICA:");
        System.out.println(" Fecha: " + fecha);
        System.out.println(" Hora: " + hora);
        
        if (paciente != null) {
            System.out.println(" Paciente: " + paciente.getNombre());
            System.out.println(" Obra Social: " + paciente.getObraSocial());
        } else {
            System.out.println(" Paciente: No asignado");
        }
        
        if (profesional != null) {
            System.out.println(" Profesional: " + profesional.getNombre());
            System.out.println(" Especialidad: " + profesional.getEspecialidad());
        } else {
            System.out.println(" Profesional: No asignado");
        }
        System.out.println("   ---");
    }
    
    // Método para confirmar la cita
    public void confirmarCita() {
        System.out.println(" CONFIRMANDO CITA:");
        System.out.println(" Fecha: " + fecha);
        System.out.println(" Hora: " + hora);
        
        if (paciente != null && profesional != null) {
            System.out.println(" Cita confirmada para " + paciente.getNombre());
            System.out.println(" Con el profesional: " + profesional.getNombre());
            System.out.println(" Se enviara recordatorio");
        } else {
            System.out.println("   No se puede confirmar - Datos incompletos");
        }
    }
    
    // Método para cancelar la cita
    public void cancelarCita() {
        System.out.println("CANCELANDO CITA:");
        System.out.println(" Cita del " + fecha + " a las " + hora + " cancelada");
        if (paciente != null) {
            System.out.println("   Se notifico a: " + paciente.getNombre());
        }
    }
    
    // Método para realizar la consulta
    public void realizarConsulta() {
        if (paciente != null && profesional != null) {
            System.out.println("INICIANDO CONSULTA:");
            System.out.println("   Paciente: " + paciente.getNombre());
            System.out.println("   Profesional: " + profesional.getNombre());
            profesional.realizarDiagnostico(paciente);
            System.out.println("  Consulta finalizada");
        } else {
            System.out.println("  No se puede realizar la consulta - Datos incompletos");
        }
    }
}