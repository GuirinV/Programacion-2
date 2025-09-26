/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6.sistemastock;

/**
 *
 * @author veron
 */
public class MainStock {
    
    // Método para mostrar un separador visual
    public static void mostrarSeparador(String titulo) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println(" " + titulo);
        System.out.println("=".repeat(50));
    }

    public static void main(String[] args) {
        mostrarSeparador("SISTEMA DE GESTION DE STOCK - INICIO");
        
        // 1. CREAR INVENTARIO
        Inventario inventario = new Inventario();
        
        // 2. CREAR PRODUCTOS DE EJEMPLO
        mostrarSeparador("CREACION DE PRODUCTOS");
        
        Producto p1 = new Producto("A001", "Arroz Integral", 350.50, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E001", "Smartphone Samsung", 1250.00, 25, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R001", "Jeans Azul", 890.75, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H001", "Juego de Sartenes", 1500.00, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A002", "Aceite de Oliva", 680.00, 80, CategoriaProducto.ALIMENTOS);
        Producto p6 = new Producto("E002", "Auriculares Inalambricos", 950.00, 30, CategoriaProducto.ELECTRONICA);
        
        // 3. AGREGAR PRODUCTOS AL INVENTARIO
        mostrarSeparador("AGREGAR PRODUCTOS AL INVENTARIO");
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        
        // 4. LISTAR TODOS LOS PRODUCTOS
        mostrarSeparador("LISTA COMPLETA DE PRODUCTOS");
        inventario.listarProductos();
        
        // 5. BUSCAR PRODUCTO POR ID
        mostrarSeparador("BUSQUEDA DE PRODUCTO POR ID (E001)");
        Producto encontrado = inventario.buscarProductoPorId("E001");
        if (encontrado != null) {
            System.out.println(" Producto encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println(" Producto no encontrado");
        }
        
        // 6. FILTRAR POR CATEGORÍA
        mostrarSeparador("FILTRAR POR CATEGORIA: ALIMENTOS");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        // 7. ELIMINAR UN PRODUCTO
        mostrarSeparador("ELIMINAR PRODUCTO (R001)");
        inventario.eliminarProducto("R001");
        inventario.listarProductos();
        
        // 8. ACTUALIZAR STOCK
        mostrarSeparador("ACTUALIZAR STOCK DE ARROZ (A001)");
        inventario.actualizarStock("A001",150);
        
        // 9. MOSTRAR TOTAL DE STOCK
        mostrarSeparador("TOTAL DE STOCK DISPONIBLE");
        System.out.println(" Total de unidades en stock: " + inventario.obtenerTotalStock());
        
        // 10. PRODUCTO CON MAYOR STOCK
        mostrarSeparador("PRODUCTO CON MAYOR STOCK");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println(" Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }
        
        // 11. FILTRAR POR PRECIO
        mostrarSeparador("FILTRAR PRODUCTOS ENTRE $500 Y $1200");
        inventario.filtrarProductosPorPrecio(500, 1200);
        
        // 12. ORDENAR PRODUCTOS
        mostrarSeparador("ORDENAR PRODUCTOS POR PRECIO");
        inventario.ordenarProductosPorPrecio();
        inventario.listarProductos();
        
        // 13. MOSTRAR ESTADÍSTICAS
        mostrarSeparador("ESTADISTICAS FINALES");
        inventario.mostrarEstadisticas();
        
        // 14. MOSTRAR CATEGORÍAS DISPONIBLES
        mostrarSeparador("CATEGORIAS DISPONIBLES");
        CategoriaProducto.mostrarTodasCategorias();
        
        mostrarSeparador("SISTEMA FINALIZADO - TODAS LAS PRUEBAS COMPLETADAS");
    }
}
