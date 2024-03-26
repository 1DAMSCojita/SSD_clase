package Recetas;

import java.util.*;

public class Receta {

    // Declaración de atributos.
    String receta;
    int numComensales;

    // Creación de ArrayList.
    List<Ingrediente> ingredientes = new ArrayList<>();

    // Declaración de constructor.
    Receta(String receta, List<Ingrediente> ingredientes, int numComensales) {
        this.receta = receta;
        this.ingredientes = ingredientes;
        this.numComensales = numComensales;
    }

}
