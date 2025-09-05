/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private int combustibleMaximo;

    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.combustibleMaximo = 100; // Límite máximo de combustible
    }

    // Método para despegar
    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println(nombre + " no puede despegar, no hay combustible.");
        }
    }

    // Método para avanzar una distancia
    public void avanzar(int distancia) {
        int consumo = distancia / 10; // 1 unidad de combustible por cada 10 de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " km.");
        } else {
            System.out.println(nombre + " no puede avanzar, combustible insuficiente.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > combustibleMaximo) {
            System.out.println("No se puede recargar, el combustible excede el limite maximo.");
        } else {
            combustible += cantidad;
            System.out.println("Recargado " + cantidad + " unidades de combustible. Total: " + combustible);
        }
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Estado de la nave " + nombre + ":");
        System.out.println("Combustible: " + combustible);
    }
}