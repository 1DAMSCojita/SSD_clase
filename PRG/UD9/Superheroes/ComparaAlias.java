package Activitat_9_11;

import java.util.Comparator;

public class ComparaAlias implements Comparator<Personaje> {

    @Override
    public int compare(Personaje p1, Personaje p2) {
        return p1.alias.compareTo(p2.alias);
    }

}
