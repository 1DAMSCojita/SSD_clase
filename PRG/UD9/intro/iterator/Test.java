package intro.iterator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Joan");
        listaNombres.add("Ana");
        listaNombres.add("Susana");
        listaNombres.add("Josep");

        Iterator<String> i = listaNombres.iterator();

        // boolean hasNext()
        // object next()
        // object remove()

        while (i.hasNext()) {
            String nombre = i.next();
            System.out.println(nombre);
            i.remove();
        }

        for (String nombre : listaNombres) {
            System.out.println(nombre);
            // if (nombre.equals("Ana")) {
            //     listaNombres.remove("Joan");
            // }
        }

    }
}
