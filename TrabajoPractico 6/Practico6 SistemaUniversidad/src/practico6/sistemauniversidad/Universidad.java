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

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        System.out.println(" UNIVERSIDAD '" + nombre + "' CREADA CORRECTAMENTE");
    }
    
    // 1. AGREGAR PROFESOR
    public boolean agregarProfesor(Profesor profesor) {
        if (profesor == null) return false;
        
        if (!profesores.contains(profesor)) {
            profesores.add(profesor);
            System.out.println(" Profesor agregado a la universidad: " + profesor.getNombre());
            return true;
        } else {
            System.out.println("️ El profesor ya esta en la universidad");
            return false;
        }
    }
    
    // 2. AGREGAR CURSO
    public boolean agregarCurso(Curso curso) {
        if (curso == null) return false;
        
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println(" Curso agregado a la universidad: " + curso.getNombre());
            return true;
        } else {
            System.out.println("️ El curso ya esta en la universidad");
            return false;
        }
    }
    
    // 3. ASIGNAR PROFESOR A CURSO
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso == null) {
            System.out.println(" Curso no encontrado: " + codigoCurso);
            return false;
        }
        
        if (profesor == null) {
            System.out.println(" Profesor no encontrado: " + idProfesor);
            return false;
        }
        
        curso.setProfesor(profesor);
        System.out.println(" Asignacion exitosa: " + profesor.getNombre() + " -> " + curso.getNombre());
        return true;
    }
    
    // 4. LISTAR PROFESORES
    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println(" No hay profesores en la universidad");
            return;
        }
        
        System.out.println("\n LISTA DE PROFESORES - " + nombre);
        System.out.println("=".repeat(60));
        for (int i = 0; i < profesores.size(); i++) {
            System.out.print((i + 1) + ". ");
            profesores.get(i).mostrarInfo();
        }
    }
    
    // 5. LISTAR CURSOS
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(" No hay cursos en la universidad");
            return;
        }
        
        System.out.println("\n LISTA DE CURSOS - " + nombre);
        System.out.println("=".repeat(60));
        for (int i = 0; i < cursos.size(); i++) {
            System.out.print((i + 1) + ". ");
            cursos.get(i).mostrarInfo();
        }
    }
    
    // 6. BUSCAR PROFESOR POR ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    
    // 7. BUSCAR CURSO POR CÓDIGO
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    // 8. ELIMINAR CURSO
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con profesor si existe
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("️ Curso eliminado: " + curso.getNombre());
            return true;
        } else {
            System.out.println(" Curso no encontrado: " + codigo);
            return false;
        }
    }
    
    // 9. ELIMINAR PROFESOR
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null en los cursos que dictaba
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null, false);
            }
            profesores.remove(profesor);
            System.out.println(" Profesor eliminado: " + profesor.getNombre());
            return true;
        } else {
            System.out.println(" Profesor no encontrado: " + id);
            return false;
        }
    }
    
    // 10. MOSTRAR REPORTE: CURSOS POR PROFESOR
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n REPORTE: CURSOS POR PROFESOR");
        System.out.println("=".repeat(50));
        
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores para generar reporte");
            return;
        }
        
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + ": " + 
                             profesor.getCursos().size() + " curso(s)");
            if (!profesor.getCursos().isEmpty()) {
                for (Curso curso : profesor.getCursos()) {
                    System.out.println(curso.getCodigo() + " - " + curso.getNombre());
                }
            }
        }
    }
    
    // 11. MOSTRAR ESTADÍSTICAS GENERALES
    public void mostrarEstadisticas() {
        System.out.println("\n ESTADISTICAS DE " + nombre.toUpperCase());
        System.out.println("=".repeat(50));
        System.out.println("Total profesores: " + profesores.size());
        System.out.println("Total cursos: " + cursos.size());
        
        // Cursos sin profesor asignado
        int cursosSinProfesor = 0;
        for (Curso curso : cursos) {
            if (curso.getProfesor() == null) {
                cursosSinProfesor++;
            }
        }
        System.out.println("Cursos sin profesor: " + cursosSinProfesor);
        
        // Profesor con más cursos
        if (!profesores.isEmpty()) {
            Profesor profesorMasOcupado = profesores.get(0);
            for (Profesor profesor : profesores) {
                if (profesor.getCursos().size() > profesorMasOcupado.getCursos().size()) {
                    profesorMasOcupado = profesor;
                }
            }
            System.out.println("Profesor con mas cursos: " + profesorMasOcupado.getNombre() + 
                             " (" + profesorMasOcupado.getCursos().size() + " cursos)");
        }
    }
    
    // GETTERS
    public String getNombre() { return nombre; }
    public List<Profesor> getProfesores() { return profesores; }
    public List<Curso> getCursos() { return cursos; }
}
