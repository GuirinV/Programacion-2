/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author veron
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;
    
    // Constructor
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Llama al constructor de la superclase
        this.cantidadPuertas = cantidadPuertas;
    }
    
    // Sobrescribir mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la superclase
        System.out.println("Puertas: " + cantidadPuertas);
    }
}