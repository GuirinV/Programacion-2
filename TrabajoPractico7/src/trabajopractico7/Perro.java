/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author veron
 */
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre, "Perro");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}