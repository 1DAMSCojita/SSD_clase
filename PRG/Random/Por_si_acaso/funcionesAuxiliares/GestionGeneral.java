package funcionesAuxiliares;

// Importación de librerías.
import java.util.*;

public class GestionGeneral<T> {

    private List<T> listaGenerica = new ArrayList<>(); // Creamos la lista genérica.

    // Creamos un método para agregar una entidad a la lista.
    public void agregarEntidad(T entidad) {
        listaGenerica.add(entidad);
    }

    // Creamos un método para eliminar una entidad de la lista.
    public void eliminarEntidad(T entidad) {
        listaGenerica.remove(entidad);
    }

    // Creamos un método para modificar la entidad de una lista.
    public void modificarEntidad(T entidadExistente, T entidadModificada) {
        int i = listaGenerica.indexOf(entidadExistente);
        if (i != -1) {
            listaGenerica.set(i, entidadModificada);
        }
    }

    // Creamos un método para obtener todas las entidades.
    public List<T> obtenerTodasLasEntidades() {
        return listaGenerica;
    }

    // Creamos un método para ordenar la lista solamente por orden natural.
    public void ordenarLista(Comparator<T> comparador) {
        listaGenerica.sort(comparador);
    }

}
