package Tienda;

public class Producto {

    // Declaración de variables. Aplicamos encapsulamiento haciéndolas privadas para que no se puedan manipular.
    private String nombre;
    private double precio;
    private int stock;

    // Declaración de constructor.
    Producto (String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Declaración de métodos getters y setters.
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
        this.precio = precio;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Creamos un método para vender un producto. Devuelve true si la venta es exitosa, false si no hay suficiente stock.
    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            return false;
        }
    }

}