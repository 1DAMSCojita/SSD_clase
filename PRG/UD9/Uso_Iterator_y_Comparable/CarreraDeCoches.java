package Uso_Iterator_y_Comparable;

// Importación de librerías.
import java.util.*;

public class CarreraDeCoches {

    // Declaración de TreeSet.
    TreeSet<Coche> coches = new TreeSet<>();

    // Declaración de constructor por defecto.
    CarreraDeCoches() {
        coches = new TreeSet<>();
    }


    // Creamos un método para añadir un coche a la colección.
    public void añadirCoche(Coche coche) {
        this.coches.add(coche);
    }

    // Creamos un método para eliminar un coche de la colección.
    public void eliminarCoche(String nombre) {
        for (Coche coche : coches) {
            if (coche.nombre.equalsIgnoreCase(nombre)) {
                coches.remove(coche);
            }
        }
    }

    // Creamos un getter que devolverá el nombre del coche ganador de la carrera según su velocidad máxima.
    public String getGanador() {
        if (coches.isEmpty()) {
            return "No hay coches en la carrera.";
        } else {
            Coche ganador = coches.first(); // Creamos una variable 'ganador' de tipo 'Coche' y agarrará el primer coche.
            return ganador.nombre; // Devolvemos el coche ganador.
        }
    }

}