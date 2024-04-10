package Recetas;

import java.util.*;

public class ComparaRecetasPrecio implements Comparator<Receta> {

    @Override
    public int compare(Receta r1, Receta r2) {
        // Comparamos los precios de las recetas.
        // Convertimos los precios a Double y luego los comparamos.
        return Double.compare(r1.calcularCosteTotal(), r2.calcularCosteTotal());
    }

}
