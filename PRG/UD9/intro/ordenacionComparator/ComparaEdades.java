package intro.ordenacionComparator;

import java.util.*;

public class ComparaEdades implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.edad - o2.edad;
    }

}
