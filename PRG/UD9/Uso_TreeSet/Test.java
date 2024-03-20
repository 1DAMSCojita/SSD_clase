package Uso_TreeSet;

// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un TreeSet.
        TreeSet<String> ts = new TreeSet<>();

        // Añadimos varios elementos al TreeSet.
        ts.add("Buenos");
        ts.add("dias");
        ts.add("hoy");
        ts.add("es");
        ts.add("Martes");
        ts.add("Requete");
        ts.add("Bum");

        // Consultamos el tamaño que tiene el TreeSet.
        System.out.println(ts.size());

        // Comprobamos si existe el valor 'Requete' en el TreeSet.
        if (ts.contains("Requete")) {
            System.out.println("El elemento 'Requete' se encuentra en la lista.");
        } else {
            System.out.println("No se ha encontrado el elemento 'Requete'.");
        }

        // Eliminamos el valor 'Requete'.
        ts.remove("Requete");

        // Recorremos el TreeSet para ver sus valores con un bucle 'for-each'.
        for (String valores : ts) {
            System.out.println(valores);
        }

        // Borramos todos los elementos del TreeSet.
        ts.clear();
        
        // Manera para comprobar si el TreeSet está vacío. Creamos un array para ello.
        String[] treeset = (String[]) ts.toArray(new String[ts.size()]);
        System.out.println("Método 1 para ver si está vacío (si sale 0 es que no hay nada): " + treeset.length);
        
        // Otra manera para comprobar si el TreeSet está vacío con el método 'size()'.
        if (ts.size() == 0) {
            System.out.println("Método 2 para ver si está vacío (si sale 0 es que no hay nada): " + ts.size());
        } else {
            System.out.println("Hay valores en el TreeSet (uyyy, algo hemos hecho mal...)");
        }

        // Tercera manera para comprobar si el TreeSet está vacío con el método 'isEmpty()'.
        if (ts.isEmpty()) {
            System.out.println("Método 3 para ver si está vacío. Efectivamente lo está.");
        } else {
            System.out.println("Hay valores en el TreeSet (uyyy, algo hemos hecho mal...)");
        }

    }
}
