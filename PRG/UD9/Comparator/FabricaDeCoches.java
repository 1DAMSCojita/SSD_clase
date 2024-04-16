package Comparator;

// Importación de librerías.
import java.util.ArrayList;

public class FabricaDeCoches {

    // Declaración de ArrayList.
    ArrayList<Coche> coches = new ArrayList<>();

    // Creamos un método para añadir un coche a la colección.
    public void añadirCoche(Coche coche) {
        this.coches.add(coche);
    }

    // Creamos un método para eliminar un coche de la colección.
    public void eliminarCoche(String nombre) {
        for (Coche coche : coches) {
            if (coche.modelo.equalsIgnoreCase(nombre)) {
                coches.remove(coche);
            }
        }
    }

    // Getter para el ArrayList de coches.
    public ArrayList<Coche> getCoches() {
        return coches;
    }
}
