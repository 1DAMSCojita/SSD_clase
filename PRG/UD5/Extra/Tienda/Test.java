package Tienda;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia a 'Tienda'. Para poder tomar sus métodos y atributos de la clase Producto.
        Tienda t = new Tienda();

        // Llamando a los métodos.
        t.agregarProducto();
        t.venderProducto(2); // Vendemos dos productos.
        t.calcularIngresos();

        // Resumen de la tienda.
        System.out.println("__________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Resumen de la tienda:");
        System.out.println();
        System.out.println("Producto agregado: " + t.x.getNombre());
        System.out.println("Producto vendido: " + t.p.getNombre());
        System.out.println("Quedan " + t.p.getStock() + " artículos en stock.");
        System.out.println("Ingresos totales recibidos: " + t.calcularIngresos() + " euros. ");
        System.out.println("___________________________________________________________________________________________________________");

    }
}
