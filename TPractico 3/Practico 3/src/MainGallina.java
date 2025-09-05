/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainGallina {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1);
        Gallina gallina2 = new Gallina(2);
        
        // Simular acciones de las gallinas
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer(); // Envejece otra vez

        // Mostrar el estado de las gallinas
        System.out.println("\nEstado de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}