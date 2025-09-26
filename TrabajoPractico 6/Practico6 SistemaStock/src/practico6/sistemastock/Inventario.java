/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6.sistemastock;

/**
 *
 * @author veron
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
        System.out.println(" Inventario creado correctamente");
    }

    // 1. AGREGAR PRODUCTO
    public boolean agregarProducto(Producto p) {
        // Verificar si el ID ya existe
        for (Producto producto : productos) {
            if (producto.getId().equals(p.getId())) {
                System.out.println(" Error: Ya existe un producto con ID " + p.getId());
                return false;
            }
        }
        productos.add(p);
        System.out.println(" Producto agregado: " + p.getNombre());
        return true;
    }

    // 2. LISTAR TODOS LOS PRODUCTOS
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println(" El inventario esta vacio");
            return;
        }
        
        System.out.println("\n LISTA COMPLETA DE PRODUCTOS (" + productos.size() + " productos)");
        System.out.println("==========================================");
        for (int i = 0; i < productos.size(); i++) {
            System.out.print((i + 1) + ". ");
            productos.get(i).mostrarInfo();
        }
    }

    // 3. BUSCAR PRODUCTO POR ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // No encontrado
    }

    // 4. ELIMINAR PRODUCTO POR ID
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado: " + p.getNombre());
            return true;
        } else {
            System.out.println(" No se encontro producto con ID: " + id);
            return false;
        }
    }

    // 5. ACTUALIZAR STOCK
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println(" Stock actualizado: " + p.getNombre() + " -> " + nuevaCantidad + " unidades");
            return true;
        } else {
            System.out.println(" No se encontro producto con ID: " + id);
            return false;
        }
    }

    // 6. FILTRAR POR CATEGORÍA
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println(" PRODUCTOS EN CATEGORIA: " + categoria.getDescription());
        System.out.println("==========================================");
        
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay productos en esta categoria");
        }
    }

    // 7. OBTENER TOTAL DE STOCK
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // 8. OBTENER PRODUCTO CON MAYOR STOCK
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    // 9. FILTRAR PRODUCTOS POR PRECIO
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n PRODUCTOS ENTRE $" + min + " Y $" + max);
        System.out.println("==========================================");
        
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay productos en este rango de precios");
        }
    }

    // 10. ORDENAR PRODUCTOS POR PRECIO (ASCENDENTE)
    public void ordenarProductosPorPrecio() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return Double.compare(p1.getPrecio(), p2.getPrecio());
            }
        });
        System.out.println(" Productos ordenados por precio (ascendente)");
    }

    // 11. ORDENAR PRODUCTOS POR NOMBRE
    public void ordenarProductosPorNombre() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }
        });
        System.out.println(" Productos ordenados por nombre");
    }

    // 12. MOSTRAR ESTADÍSTICAS
    public void mostrarEstadisticas() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos para mostrar estadisticas");
            return;
        }
        
        System.out.println("\n ESTADISTICAS DEL INVENTARIO");
        System.out.println("==========================================");
        System.out.println("Total productos: " + productos.size());
        System.out.println("Total stock: " + obtenerTotalStock() + " unidades");
        
        Producto mayorStock = obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock: " + mayorStock.getNombre() + 
                             " (" + mayorStock.getCantidad() + " unidades)");
        }
        
        // Calcular valor total del inventario
        double valorTotal = 0;
        for (Producto p : productos) {
            valorTotal += p.getPrecio() * p.getCantidad();
        }
        System.out.println("Valor total del inventario: $" + valorTotal);
    }
}