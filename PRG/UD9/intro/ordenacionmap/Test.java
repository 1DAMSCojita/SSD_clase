package intro.ordenacionmap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        Map<String, Persona> p = new TreeMap<>();
        p.put("Barabarabara", new Persona("Bereberebere", "Barabara"));
        p.put("Bereberebere", new Persona("Barabara", "Berebere"));
        p.put("Antonio", new Persona("Pablo", "Ruiz"));
        p.put("Kevin", new Persona("Jesucristo", "Nazaret"));

        for (String apellido : p.keySet()) {
            System.out.println(apellido);
        }
    }
}

class Persona implements Comparable<Persona> {

    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public int compareTo(Persona o) {
        return -this.nombre.compareTo(o.nombre);
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}