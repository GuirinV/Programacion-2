/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author veron
 */
public class PayPal implements Pago {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal (" + email + ") por $" + monto);
        // Simulación de procesamiento exitoso
        return true;
    }
    
    // Getter
    public String getEmail() {
        return email;
    }
}