/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6.sistemauniversidad;

/**
 *
 * @author veron
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
        System.out.println(" Curso creado: " + codigo + " - " + nombre);
    }
    
    // SET PROFESOR CON SINCRONIZACIÓN BIDIRECCIONAL
    // con parametro 'sincronizar' para evitar recursión infinita
    public void setProfesor(Profesor nuevoProfesor, boolean sincronizar) {
        // Remover de la lista del profesor anterior (si existe)
        if (this.profesor != null && sincronizar) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar nuevo profesor
        this.profesor = nuevoProfesor;
        
        // Agregar a la lista del nuevo profesor (si existe y hay que sincronizar)
        if (nuevoProfesor != null && sincronizar) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    // Sobrecarga para mantener compatibilidad
    public void setProfesor(Profesor nuevoProfesor) {
        setProfesor(nuevoProfesor, true);
    }
    
    // MOSTRAR INFORMACIÓN COMPLETA
    public void mostrarInfo() {
        System.out.println("==========================================");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
        System.out.println("==========================================");
    }
    
    // MOSTRAR INFO RESUMIDA
    public void mostrarInfoResumida() {
        System.out.println(codigo + " - " + nombre + " [" + 
                          (profesor != null ? profesor.getNombre() : "Sin profesor") + "]");
    }
    
    // GETTERS Y SETTERS
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    
    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
}
