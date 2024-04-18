package Examen_22_23;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Gemelo> {

    @Override
    public int compare(Gemelo g1, Gemelo g2) {
        return g1.nombre.compareTo(g2.nombre);
    }



}
