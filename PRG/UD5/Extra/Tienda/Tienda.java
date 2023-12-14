package Tienda;

public class Tienda {
    
    // Creamos una instancia para producto que contendrá todos los valores.
    Producto p = new Producto("PlayStation 5", 499.99, 5);

    // Creamos otra instancia para producto con unos valores diferentes que posteriormente actualizaremos.
    Producto x = new Producto(null, 0, 0);

    private double ingresosTotales = 0; // Variable añadida que tendrá los ingresos totales recaudados.

    // Creamos un método para agregar un producto.
    public void agregarProducto() {
        x.setNombre("Xbox Series X");
        x.setPrecio(399.99);
        x.setStock(10);
    }

    // Creamos un método para vender un producto.
    public void venderProducto(int cantidad) {
        boolean ventaExitosa = p.vender(cantidad);
        if (ventaExitosa) {
            ingresosTotales += p.getPrecio() * cantidad;
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }

    // Creamos un método que devolverá los ingresos recibidos.
    public double calcularIngresos() {
        return ingresosTotales;
    }

}
