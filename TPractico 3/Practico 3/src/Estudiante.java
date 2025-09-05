/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    // Método para aumentar la calificación
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("Calificacion aumentada a: " + calificacion);
    }

    // Método para disminuir la calificación
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("Calificacion disminuida a: " + calificacion);
    }
}

