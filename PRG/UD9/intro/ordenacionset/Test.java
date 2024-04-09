package intro.ordenacionset;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        Set<Persona> p = new TreeSet<>();
        p.add(new Persona("Barabarabarabereberebere"));
        p.add(new Persona("Pedro"));
        p.add(new Persona("Cul"));
        p.add(new Persona("Crustáceo"));
        
    }
}

class Persona implements Comparable<Persona> {

    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o) {
        return -this.nombre.compareTo(o.nombre);
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
}