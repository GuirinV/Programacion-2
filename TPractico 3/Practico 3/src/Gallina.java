/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0; // La gallina comienza con 0 años
        this.huevosPuestos = 0; // Inicialmente no ha puesto huevos
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo.");
    }

    // Método para envejecer la gallina
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ha envejecido un anio.");
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
