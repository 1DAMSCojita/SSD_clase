package Superheroes;

public class Superpoder {

    // Declaración de atributos.
    String nombre;
    int nivel;

    // Declaración de constructor.
    Superpoder(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    // Sobreescribimos el método 'toString()' para mostrar información del superpoder.
    @Override
    public String toString() {
        return "Superpoder: " + nombre + " | " + "Nivel: " + nivel;
    }

}
