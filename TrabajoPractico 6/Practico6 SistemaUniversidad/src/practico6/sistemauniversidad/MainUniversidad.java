/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6.sistemauniversidad;

/**
 *
 * @author veron
 */
public class MainUniversidad {
    
    public static void mostrarSeparador(String titulo) {
        System.out.println("\n" + "=".repeat(70));
        System.out.println(" " + titulo);
        System.out.println("=".repeat(70));
    }

    public static void main(String[] args) {
        mostrarSeparador("SISTEMA UNIVERSIDAD - RELACION BIDIRECCIONAL 1 A N");
        
        // 1. CREAR UNIVERSIDAD
        Universidad uni = new Universidad("Universidad Nacional de Programacion");
        
        // 2. CREAR 3 PROFESORES Y 5 CURSOS (como solicita el ejercicio)
        mostrarSeparador("CREACION DE PROFESORES Y CURSOS");
        
        // Crear 3 profesores
        Profesor prof1 = new Profesor("P001", "Dr. Carlos Garcia", "Matematicas");
        Profesor prof2 = new Profesor("P002", "Dra. Veronica Guirin", "Fisica");
        Profesor prof3 = new Profesor("P003", "Dr. David Martinez", "Programacion");
        
        // Crear 5 cursos
        Curso curso1 = new Curso("MAT101", "Calculo I");
        Curso curso2 = new Curso("FIS101", "Fisica I");
        Curso curso3 = new Curso("PROG201", "Programacion II");
        Curso curso4 = new Curso("MAT201", "Algebra Lineal");
        Curso curso5 = new Curso("PROG301", "Estructuras de Datos");
        
        // 3. AGREGAR PROFESORES Y CURSOS A LA UNIVERSIDAD
        mostrarSeparador("AGREGAR A LA UNIVERSIDAD");
        
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);
        
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        
        // 4. ASIGNAR PROFESORES A CURSOS
        mostrarSeparador("ASIGNAR PROFESORES A CURSOS");
        
        uni.asignarProfesorACurso("MAT101", "P001"); // García → Cálculo I
        uni.asignarProfesorACurso("FIS101", "P002"); // Guirin → Física I
        uni.asignarProfesorACurso("PROG201", "P003"); // Martínez → Programación II
        uni.asignarProfesorACurso("MAT201", "P001"); // García → Álgebra Lineal
        uni.asignarProfesorACurso("PROG301", "P003"); // Martínez → Estructuras Datos
        
        // 5. LISTAR CURSOS CON SU PROFESOR Y PROFESORES CON SUS CURSOS
        mostrarSeparador("LISTA DE CURSOS CON PROFESORES");
        uni.listarCursos();
        
        mostrarSeparador("LISTA DE PROFESORES CON SUS CURSOS");
        uni.listarProfesores();
        
        // Mostrar cursos de cada profesor individualmente
        System.out.println("\n CURSOS POR PROFESOR (DETALLE):");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();
        
        // 6. CAMBIAR EL PROFESOR DE UN CURSO Y VERIFICAR SINCRONIZACIÓN
        mostrarSeparador("CAMBIAR PROFESOR DE CURSO (VERIFICAR SINCRONIZACION)");
        
        System.out.println("ANTES del cambio:");
        curso1.mostrarInfoResumida();
        prof1.listarCursos();
        prof2.listarCursos();
        
        System.out.println("\n REALIZANDO CAMBIO: Calculo I de Garcia a Guirin...");
        uni.asignarProfesorACurso("MAT101", "P002");
        
        System.out.println("\nDESPUES del cambio:");
        curso1.mostrarInfoResumida();
        prof1.listarCursos();
        prof2.listarCursos();
        
        // 7. REMOVER UN CURSO Y CONFIRMAR QUE YA NO APARECE EN LA LISTA DEL PROFESOR
        mostrarSeparador(" ELIMINAR CURSO Y VERIFICAR SINCRONIZACION");
        
        System.out.println("ANTES de eliminar curso:");
        curso3.mostrarInfoResumida();
        prof3.listarCursos();
        
        System.out.println("\n ELIMINANDO CURSO: Programacion II...");
        uni.eliminarCurso("PROG201");
        
        System.out.println("\n DESPUES de eliminar curso:");
        prof3.listarCursos();
        
        // 8. REMOVER UN PROFESOR Y DEJAR PROFESOR = NULL EN SUS CURSOS
        mostrarSeparador("ELIMINAR PROFESOR Y VERIFICAR CURSOS SIN PROFESOR");
        
        System.out.println("Cursos antes de eliminar profesor:");
        uni.listarCursos();
        
        System.out.println("\n ELIMINANDO PROFESOR: " + prof2.getNombre() + "...");
        uni.eliminarProfesor("P002");
        
        System.out.println("\nCursos despues de eliminar profesor:");
        uni.listarCursos();
        
        // 9. MOSTRAR REPORTE: CANTIDAD DE CURSOS POR PROFESOR
        mostrarSeparador("REPORTE FINAL: CANTIDAD DE CURSOS POR PROFESOR");
        uni.mostrarReporteCursosPorProfesor();
        
        // 10. ESTADÍSTICAS FINALES
        mostrarSeparador("ESTADISTICAS FINALES DE LA UNIVERSIDAD");
        uni.mostrarEstadisticas();
        
        // VERIFICACIÓN EXTRA DE LA BIDIRECCIONALIDAD
        mostrarSeparador("VERIFICACION DE RELACION BIDIRECCIONAL");
        
        System.out.println("Desde Curso -> Profesor:");
        curso4.mostrarInfoResumida();
        
        System.out.println("\nDesde Profesor -> Cursos:");
        prof1.listarCursos();
        
        mostrarSeparador("SISTEMA UNIVERSIDAD - FINALIZADO CORRECTAMENTE");
    }
}