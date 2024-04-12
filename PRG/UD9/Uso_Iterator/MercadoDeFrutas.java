package Uso_Iterator;

// Importación de librerías.
import java.util.*;

public class MercadoDeFrutas {

    // Declaración de ArrayList.
    ArrayList<Fruta> frutas = new ArrayList<>();

    // Declaración de constructor por defecto.
    MercadoDeFrutas() {
        frutas = new ArrayList<>(); // Añadimos el ArrayList de frutas dentro del constructor. 
    }

    // Creamos un método para añadir una fruta a la colección.
    public void añadirFruta(Fruta fruta) {
        this.frutas.add(fruta);
    }

    // Creamos un método para eliminar una fruta de la colección.
    public void eliminarFruta(String nombre) {
        for (Fruta fruta : frutas) {
            if (fruta.nombre.equalsIgnoreCase(nombre)) {
                frutas.remove(fruta);
            }
        }
    }

    // Creamos un método que devolverá el precio total de todas las frutas de la colección.
    public double getPrecioTotal() {
        double precio_total = 0.0;
        for (Fruta fruta : frutas) {
            precio_total += fruta.precio;
        }
        return precio_total;
    }

    // Creamos un getter para el iterator del ArrayList de frutas.
    public Iterator<Fruta> getIterator() {
        return frutas.iterator();
    }

}
