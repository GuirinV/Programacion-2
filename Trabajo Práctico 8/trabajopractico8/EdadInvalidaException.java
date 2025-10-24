/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author veron
 */
public class EdadInvalidaException extends Exception {
    
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
    
    public EdadInvalidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}