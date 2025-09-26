/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6.sistemastock;

/**
 *
 * @author veron
 */

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");

    private final String description;

    CategoriaProducto(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    // Método adicional para mostrar todas las categorías
    public static void mostrarTodasCategorias() {
        System.out.println("=== CATEGORIAS DISPONIBLES ===");
        for (CategoriaProducto categoria : values()) {
            System.out.println(categoria.name() + " - " + categoria.getDescription());
        }
    }
}
