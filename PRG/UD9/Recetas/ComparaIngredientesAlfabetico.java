package Recetas;

import java.util.*;

public class ComparaIngredientesAlfabetico implements Comparator<Ingrediente> {

    @Override
    public int compare(Ingrediente ing1, Ingrediente ing2) {
        return ing1.getNombre().compareTo(ing2.getNombre());
    }

}
