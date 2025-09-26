/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6.sistemauniversidad;

/**
 *
 * @author veron
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
        System.out.println(" Profesor creado: " + nombre);
    }
    
    // AGREGAR CURSO CON SINCRONIZACIÓN BIDIRECCIONAL
    public void agregarCurso(Curso curso) {
        if (curso == null) return;
        
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() != this) {
                curso.setProfesor(this, false); // false para evitar recursión infinita
            }
            System.out.println(" Curso '" + curso.getNombre() + "' agregado al profesor " + nombre);
        }
    }
    
    // ELIMINAR CURSO CON SINCRONIZACIÓN BIDIRECCIONAL
    public void eliminarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() == this) {
                curso.setProfesor(null, false); // false para evitar recursión infinita
            }
            System.out.println(" Curso '" + curso.getNombre() + "' removido del profesor " + nombre);
        }
    }
    
    // LISTAR CURSOS DEL PROFESOR
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no tiene cursos asignados");
            return;
        }
        
        System.out.println("\nCURSOS DEL PROFESOR " + nombre.toUpperCase());
        System.out.println("=".repeat(50));
        for (int i = 0; i < cursos.size(); i++) {
            Curso curso = cursos.get(i);
            System.out.println((i + 1) + ". " + curso.getCodigo() + " - " + curso.getNombre());
        }
    }
    
    // MOSTRAR INFORMACIÓN COMPLETA
    public void mostrarInfo() {
        System.out.println("==========================================");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos asignados: " + cursos.size());
        System.out.println("==========================================");
    }
    
    // MOSTRAR INFO RESUMIDA
    public void mostrarInfoResumida() {
        System.out.println(nombre + " (" + especialidad + ") - " + cursos.size() + " cursos");
    }
    
    // GETTERS Y SETTERS
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }
    
    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
}