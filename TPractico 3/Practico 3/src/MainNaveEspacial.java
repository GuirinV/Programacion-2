/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainNaveEspacial {
    public static void main(String[] args) {
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Atlantis", 50);
        
        // Intentar avanzar sin recargar
        nave.despegar();
        nave.avanzar(300); // Debe fallar, no hay suficiente combustible
        
        // Recaudar combustible y avanzar correctamente
        nave.recargarCombustible(30); // Recargar combustible
        nave.avanzar(300); // Avanzar nuevamente
        
        // Mostrar el estado final
        nave.mostrarEstado();
    }
}