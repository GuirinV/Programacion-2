/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio2 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: CELULAR - BATERIA - USUARIO ===");
        System.out.println();
        
        // 1. Crear una batería (existe independientemente - AGREGACIÓN)
        System.out.println("1. Creando bateria...");
        Bateria bateria = new Bateria("Li-ion", 4000);
        System.out.println("Bateria creada: " + bateria.getModelo() + " " + bateria.getCapacidad() + "mAh");
        System.out.println();
        
        // 2. Crear un usuario
        System.out.println("2. Creando usuario...");
        Usuario usuario = new Usuario("Veronica Guirin", "87654321B");
        System.out.println("Usuario creado: " + usuario.getNombre());
        System.out.println();
        
        // 3. Crear un celular
        System.out.println("3. Creando celular...");
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21");
        System.out.println("Celular creado: " + celular.getMarca() + " " + celular.getModelo());
        System.out.println();
        
        // 4. Establecer AGREGACIÓN: Celular → Batería
        System.out.println("4. Estableciendo AGREGACION...");
        celular.setBateria(bateria);
        System.out.println("Agregacion establecida: Celular tiene Bateria");
        System.out.println(" La bateria existe independientemente del celular");
        System.out.println();
        
        // 5. Establecer ASOCIACIÓN BIDIRECCIONAL: Celular ↔ Usuario
        System.out.println("5. Estableciendo ASOCIACION BIDIRECCIONAL...");
        usuario.setCelular(celular);
        System.out.println("Asociacion bidireccional establecida");
        System.out.println();
        
        // 6. Verificar desde el usuario
        System.out.println("6. Verificando desde el USUARIO:");
        System.out.println("   Nombre: " + usuario.getNombre());
        System.out.println("   DNI: " + usuario.getDni());
        System.out.println("   Celular: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        System.out.println();
        
        // 7. Verificar desde el celular
        System.out.println("7. Verificando desde el CELULAR:");
        System.out.println("Celular: " + celular.getMarca() + " " + celular.getModelo());
        System.out.println("IMEI: " + celular.getImei());
        if (celular.getBateria() != null) {
            System.out.println("Bateria: " + celular.getBateria().getModelo() + " - " + celular.getBateria().getCapacidad() + "mAh");
        }
        if (celular.getUsuario() != null) {
            System.out.println("Usuario: " + celular.getUsuario().getNombre() + " - DNI: " + celular.getUsuario().getDni());
        }
        System.out.println();
        
        // 8. Demostrar la bidireccionalidad
        System.out.println("8. Demostrando BIDIRECCIONALIDAD:");
        System.out.println("   usuario.getCelular() == celular: " + (usuario.getCelular() == celular));
        System.out.println("   celular.getUsuario() == usuario: " + (celular.getUsuario() == usuario));
        System.out.println();
        
        System.out.println("=== EJERCICIO 2 COMPLETADO EXITOSAMENTE ===");
    }
}