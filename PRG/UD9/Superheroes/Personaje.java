package Activitat_9_11;

// Importación de librerías.
import java.util.*;

public class Personaje implements Comparable<Personaje> {

    // Declaración de atributos.
    String nombre;
    String alias;
    List<Superpoder> superpoderes = new ArrayList<>();

    // Declaración de constructor.
    Personaje(String nombre, String alias) {
        this.nombre = nombre;
        this.alias = alias;
    }

    // Implementamos el comparador de la clase 'Comparable' para ordenar alfabéticamente por el nombre a los personajes.
    @Override
    public int compareTo(Personaje p) {
        return this.nombre.compareTo(p.nombre);
    }

    // Sobreescribimos el método 'toString()' para mostrar información del personaje.
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | " + "Alias: " + alias;
    }

}
