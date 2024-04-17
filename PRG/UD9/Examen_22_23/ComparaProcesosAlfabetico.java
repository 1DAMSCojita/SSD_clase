package Examen_22_23;

import java.util.Comparator;

public class ComparaProcesosAlfabetico implements Comparator<Proceso> {

    @Override
    public int compare(Proceso p1, Proceso p2) {
        return p1.descripcion.compareTo(p2.descripcion);
    }

}
