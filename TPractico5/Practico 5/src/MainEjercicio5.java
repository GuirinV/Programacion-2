/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class MainEjercicio5 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 5: COMPUTADORA - PLACA MADRE - PROPIETARIO ===");
        System.out.println("Relaciones: Computadora -> PlacaMadre (Composicion)");
        System.out.println("Relaciones: Computadora <-> Propietario (Asociacion bidireccional)");
        System.out.println();
        
        // 1. CREAR PROPIETARIO (Asociación bidireccional)
        System.out.println("1. CREANDO PROPIETARIO...");
        Propietario propietario = new Propietario("Veronica Guirin", "44555666");
        System.out.println("Propietario creado: " + propietario);
        propietario.mostrarInformacion();
        
        // 2. CREAR COMPUTADORA (con COMPOSICIÓN de PlacaMadre)
        System.out.println("2. CREANDO COMPUTADORA...");
        Computadora computadora = new Computadora("Dell", "SN123456", "ASUS Prime", "Intel Z490");
        System.out.println("Computadora creada: " + computadora.getMarca());
        System.out.println("Placa madre creada automaticamente por COMPOSICION");
        System.out.println("   La placa madre no existe independientemente de la computadora");
        System.out.println();
        
        // 3. VERIFICAR COMPOSICIÓN
        System.out.println("3. VERIFICANDO COMPOSICION...");
        System.out.println("   Placa madre de la computadora: " + computadora.getPlacaMadre());
        computadora.getPlacaMadre().mostrarEspecificaciones();
        System.out.println();
        
        // 4. ESTABLECER ASOCIACIÓN BIDIRECCIONAL: Computadora ↔ Propietario
        System.out.println("4. ESTABLECIENDO ASOCIACION BIDIRECCIONAL...");
        propietario.setComputadora(computadora);
        System.out.println("Asociacion bidireccional establecida: Computadora <-> Propietario");
        System.out.println("   Ambos objetos se conocen mutuamente");
        System.out.println();
        
        // 5. VERIFICAR RELACIONES DESDE LA COMPUTADORA
        System.out.println("5. VERIFICANDO DESDE LA COMPUTADORA:");
        computadora.mostrarEspecificaciones();
        
        // 6. VERIFICAR RELACIONES DESDE EL PROPIETARIO
        System.out.println("6. VERIFICANDO DESDE EL PROPIETARIO:");
        propietario.mostrarInformacion();
        
        // 7. DEMOSTRAR BIDIRECCIONALIDAD
        System.out.println("7. DEMOSTRANDO BIDIRECCIONALIDAD:");
        System.out.println("   Propietario conoce su computadora: " + (propietario.getComputadora() != null));
        System.out.println("   Computadora conoce su propietario: " + (computadora.getPropietario() != null));
        System.out.println("   Son la misma computadora: " + (propietario.getComputadora() == computadora));
        System.out.println("   Son el mismo propietario: " + (computadora.getPropietario() == propietario));
        System.out.println();
        
        // 8. DEMOSTRAR COMPOSICIÓN
        System.out.println("8. DEMOSTRANDO COMPOSICION:");
        System.out.println("   La placa madre fue creada por la computadora:");
        System.out.println("   No existe una referencia independiente a la placa madre");
        System.out.println("   Solo se accede a traves de la computadora: " + computadora.getPlacaMadre());
        System.out.println();
        
        // 9. USAR MÉTODOS DE LA COMPUTADORA
        System.out.println("9. USANDO METODOS DE LA COMPUTADORA:");
        computadora.encender();
        computadora.realizarMantenimiento();
        
        // 10. CREAR MÁS COMPUTADORAS Y PROPIETARIOS
        System.out.println("10. CREANDO MAS COMPUTADORAS:");
        
        // Segunda computadora con diferente placa madre (composición)
        Computadora computadora2 = new Computadora("HP", "SN789012", "Gigabyte B550", "AMD B550");
        Propietario propietario2 = new Propietario("Susana Mendez", "77888999");
        propietario2.setComputadora(computadora2);
        
        System.out.println("   Segunda computadora creada:");
        computadora2.mostrarEspecificaciones();
        propietario2.mostrarInformacion();
        computadora2.encender();
        System.out.println();
        
        // 11. MODIFICAR DATOS
        System.out.println("11.  MODIFICANDO DATOS:");
        propietario.setNombre("Veronica Guirin");
        computadora.getPlacaMadre().setChipset("Intel Z590");
        
        System.out.println("   Propietario actualizado: " + propietario.getNombre());
        System.out.println("   Chipset actualizado: " + computadora.getPlacaMadre().getChipset());
        System.out.println();
        
        // 12. VERIFICAR CAMBIOS
        System.out.println("12. VERIFICANDO CAMBIOS:");
        computadora.mostrarEspecificaciones();
        computadora.getPlacaMadre().mostrarEspecificaciones();
        propietario.mostrarInformacion();
        
        // 13. DEMOSTRAR QUE LA PLACA MADRE NO EXISTE INDEPENDIENTEMENTE
        System.out.println("13. DEMOSTRANDO COMPOSICION:");
        System.out.println("   Intentando acceder a la placa madre solo desde la computadora:");
        System.out.println("   computadora.getPlacaMadre(): " + computadora.getPlacaMadre());
        System.out.println("   No hay forma de crear una PlacaMadre independiente");
        System.out.println("   Esto demuestra la relacion de COMPOSICION fuerte");
        System.out.println();
        
        // 14. PROBAR CAMBIO DE PROPIETARIO
        System.out.println("14. CAMBIANDO PROPIETARIO:");
        Propietario nuevoPropietario = new Propietario("Laurita Fernandez", "99111000");
        nuevoPropietario.setComputadora(computadora);
        
        System.out.println("   Nuevo propietario: " + nuevoPropietario.getNombre());
        System.out.println("   Computadora ahora pertenece a: " + computadora.getPropietario().getNombre());
        System.out.println("   Propietario anterior ahora tiene: " + 
                          (propietario.getComputadora() != null ? propietario.getComputadora().getMarca() : "ninguna computadora"));
        System.out.println();
        
        System.out.println("=== EJERCICIO 5 COMPLETADO EXITOSAMENTE ===");
    }
}