package Comparator;

// Importación de librerías.
import java.util.Comparator;

public class Coche {

    // Declaración de atributos.
    String marca;
    String modelo;
    int año;
    double precio;

    // Declaración de constructor.
    Coche(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del coche.
    @Override
    public String toString() {
        return "-Marca: " + marca + " | " + "Modelo: " + modelo + " | " + "Año de creación: " + año + " | " + "Precio: " + precio;    
    }

    // Creamos una clase estática 'ComparaMarca' para comparar las marcas de los coches.
    public static class ComparaMarca implements Comparator<Coche> {
        @Override
        public int compare(Coche c1, Coche c2) {
            return c1.marca.compareTo(c2.marca);
        }
    }

    // Creamos una clase estática 'ComparaModelo' para comparar los modelos de los coches.
    public static class ComparaModelo implements Comparator<Coche> {
        @Override
        public int compare(Coche c1, Coche c2) {
            return c1.modelo.compareTo(c2.modelo);
        }
    }

    // Creamos una clase estática 'ComparaAño' para comparar los años de creación de los coches.
    public static class ComparaAño implements Comparator<Coche> {
        @Override
        public int compare(Coche c1, Coche c2) {
            // Convertimos el año de creación de los coches a Integer para poder compararlos.
            return Integer.compare(c1.año, c2.año);
        }
    }

    // Creamos una clase estática 'ComparaPrecio' para comparar los precios de los coches.
    public static class ComparaPrecio implements Comparator<Coche> {
        @Override
        public int compare(Coche c1, Coche c2) {
            // Convertimos el precio de los coches a Double para poder compararlos.
            return Double.compare(c1.precio, c2.precio);
        }
    }

}

