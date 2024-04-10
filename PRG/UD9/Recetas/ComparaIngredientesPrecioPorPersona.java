package Recetas;

import java.util.*;

public class ComparaIngredientesPrecioPorPersona implements Comparator<Ingrediente> {

    @Override
    public int compare(Ingrediente ing1, Ingrediente ing2) {
        // Comparamos los precios por persona de los ingredientes.
        // Convertimos los precios a Double y luego los comparamos.
        return Double.compare(ing1.getPrecio_por_persona(), ing2.getPrecio_por_persona());
    }

}
