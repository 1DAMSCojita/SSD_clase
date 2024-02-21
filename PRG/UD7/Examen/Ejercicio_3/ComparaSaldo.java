package Ejercicio_3;

import java.util.Comparator;

public class ComparaSaldo implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return (int)(o1.getSaldo() - o2.getSaldo());
    }
    
    
}
