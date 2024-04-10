package Recetas;

import java.util.*;

public class ComparaRecetasNumeroComensales implements Comparator<Receta> {

    @Override
    public int compare(Receta r1, Receta r2) {
        // Comparamos el número de comensales por receta.
        // Convertimos el número de comensales a Integer y luego los comparamos.
        return Integer.compare(r1.getNumComensales(), r2.getNumComensales());
    }

}
