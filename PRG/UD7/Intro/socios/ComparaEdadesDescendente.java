package Intro.socios;

import java.util.Comparator;

public class ComparaEdadesDescendente implements Comparator<Socio>{
    
    @Override
    public int compare(Socio o1, Socio o2) {

        return o1.edad() - o2.edad();
    }

}
