package Intro.socios;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Socio> {
    
    @Override
    public int compare(Socio o1, Socio o2) {

        return o1.nombre.compareTo(o2.nombre);
    }
}
