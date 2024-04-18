package Examen_21_22;

import java.util.Comparator;

public class ComparaEjecucion implements Comparator<Proceso> {

    @Override
    public int compare(Proceso p1, Proceso p2) {
        if (p1.segundos > p2.segundos) {
            return -1;
        } else if (p1.segundos < p2.segundos) {
            return 1;
        } else {
            return 0;
        }
    }

}
