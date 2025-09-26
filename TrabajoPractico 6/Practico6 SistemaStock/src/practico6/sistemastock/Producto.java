/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6.sistemastock;

/**
 *
 * @author veron
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor principal
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Constructor sobrecargado (sin cantidad, por defecto 0)
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria);
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("==========================================");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + cantidad + " unidades");
        System.out.println("Categoria: " + categoria.getDescription());
        System.out.println("==========================================");
    }

    // Método toString para depuración
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=$" + precio + 
               ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }

    // GETTERS Y SETTERS
    public String getId() { 
        return id; 
    }
    
    public void setId(String id) { 
        this.id = id; 
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public double getPrecio() { 
        return precio; 
    }
    
    public void setPrecio(double precio) { 
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo");
        }
    }

    public int getCantidad() { 
        return cantidad; 
    }
    
    public void setCantidad(int cantidad) { 
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: La cantidad no puede ser negativa");
        }
    }

    public CategoriaProducto getCategoria() { 
        return categoria; 
    }
    
    public void setCategoria(CategoriaProducto categoria) { 
        this.categoria = categoria; 
    }
}

