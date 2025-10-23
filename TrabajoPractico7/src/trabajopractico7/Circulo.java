/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author veron
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}