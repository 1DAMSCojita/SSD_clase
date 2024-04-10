package Recetas;

import java.util.*;

public class ComparaRecetasOrdenAlfabetico implements Comparator<Receta> {

    @Override
    public int compare(Receta r1, Receta r2) {
        return r1.getNombreReceta().compareTo(r2.getNombreReceta());
    }

}
