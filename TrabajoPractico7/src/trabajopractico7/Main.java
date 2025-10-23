/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author veron
 */
public class Main {
    public static void main(String[] args) {
        // Kata 1: Vehículos
        System.out.println("=== KATA 1: VEHÍCULOS ===");
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();
        
        // Kata 2: Figuras Geométricas
        System.out.println("\n=== KATA 2: FIGURAS GEOMÉTRICAS ===");
        Figura[] figuras = {
            new Circulo("Circulo A", 5.0),
            new Rectangulo("Rectángulo B", 4.0, 6.0),
            new Circulo("Circulo C", 3.0)
        };
        
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + " - Área: " + figura.calcularArea());
        }
        
        // Kata 3: Empleados
        System.out.println("\n=== KATA 3: EMPLEADOS ===");
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana Garcia", 2500, 300),
            new EmpleadoTemporal("Luis Martínez", 2000, 10, 25),
            new EmpleadoPlanta("Carlos López", 2800, 400)
        };
        
        int contadorPlanta = 0;
        int contadorTemporal = 0;

        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSueldo(); // Polimorfismo
            System.out.println(empleado.getNombre() + " - Sueldo: $" + sueldo);
            
            // Usar instanceof para clasificar
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
            }
        }

        System.out.println("Total empleados planta: " + contadorPlanta);
        System.out.println("Total empleados temporales: " + contadorTemporal);
        
        // Kata 4: Animales - DENTRO DEL MÉTODO MAIN
        System.out.println("\n=== KATA 4: ANIMALES ===");
        Animal[] animales = {
            new Perro("Firulais"),
            new Gato("Misifú"),
            new Vaca("Lola"),
            new Perro("Rex")
        };

        // Polimorfismo: cada animal hace su sonido específico
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido(); // Comportamiento polimórfico
            System.out.println("---");
        }
    } // ← CIERRE del método main
} // ← CIERRE de la clase Main