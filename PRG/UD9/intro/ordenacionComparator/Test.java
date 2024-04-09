package intro.ordenacionComparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Stefan", "Cojita", 18);
        Persona p2 = new Persona("Pastuç", "Pistuç", 20);
        Persona p3 = new Persona("Bob", "Constructor", 21);

        // List<Persona> p = new ArrayList<>();
        @SuppressWarnings("unused")
        ComparaNombres cn = new ComparaNombres();
        Map<Persona, String> p = new TreeMap<>();
        p.put(p1, "Barabarabara");
        p.put(p2, "Bereberebere");
        p.put(p3, "Barabara");

        for (Persona persona : p.keySet()) {
            System.out.println(persona);
        }

        // Set<Persona> p = new TreeSet<>(cn);
        // p.add(p1);
        // p.add(p2);
        // p.add(p3);

        // Collections.sort(p, cn);

        // for (Persona persona : p) {
        //     System.out.println(persona);
        // }

    }
}

