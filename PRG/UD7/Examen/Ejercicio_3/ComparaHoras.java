package Ejercicio_3;

import java.util.Comparator;

public class ComparaHoras implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getHoras() - o2.getHoras();
    }
    
}
