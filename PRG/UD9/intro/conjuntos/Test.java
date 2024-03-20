package intro.conjuntos;

import java.util.*;

public class Test {
    @SuppressWarnings({ "unused", "removal", "unchecked" })
    public static void main(String[] args) {
        
        // SET (Conjunto).
        // Hashset / TreeSet / LinkedHashSet.
        // Una característica es que no hay ningún método para recuperar un valor. Si es posible recorrerlo con un 'for-each'.
        // Otra característica muy importante es que NO puede TENER DUPLICADOS.
        // Se usan solo para agrupar objetos que tengan alguna relación entre si pero no para recorrerlos.

        HashSet<String> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        
        Set<String> shs = new HashSet<>();
        Set<Integer> str = new TreeSet<>();
        Set<Character> slhs = new LinkedHashSet<>();

        // Métodos de SET

        // boolean add(Object o)
        // String cadena = "hola";
        // if (hs.add(cadena)) {
        //     System.out.println("Insertado");
        // } else {
        //     System.out.println("El elemento ya existe.");
        // }

        // int size()
        // object remove (Object o)
        // if (hs.remove("hola")) {
            
        // }

        // boolean contains(Object o)
        // void clear()
        // boolean isEmpty()
        // Object[] toArray()
        // int addAll(Collection cole)

        // insertar(hs, "hola");
        // insertar(hs, "hola");
        // insertar(hs, "adiós");
        // insertar(hs, "adios");
        // insertar(hs, "Adiós");
        
        // System.out.println(hs.size());
        // recorreConjunto(hs);
        // eliminar(hs, "adios");

        // Características y métodos de TreeSet
        // Set clone() -> Devuelve una copia de la colección.
        insertar(ts, 2);
        insertar(ts, 3);
        insertar(ts, 5);
        insertar(ts, 0);

        // recorreConjunto(ts);

        TreeSet<Integer> ts2 = (TreeSet<Integer>) ts.clone();
        recorreConjunto(ts2);

        // Object ceiling(Object o) -> Devuelve el valor superior si existe al elemento que pongamos por parámetro, si no hay nada pondrá 'null'.
        
        int a = ts.ceiling(new Integer(100));
        // System.out.println(a);ç
        Integer b = ts.floor(new Integer(100));
        System.out.println(b);

        // first
        // last

        // Set headSet(Object o)
        // Set tailSet(Object o)

        // Set subSet(int desde, int hasta)

        // HashSet
        // HashSet clone()

        // LinkedHashSet
        // Su rendimiento es parecido al HashSet, pero el orden que tiene este conjunto es el de inserción.

    }

    private static void esperar(int segundos) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static <T> void insertar(Set<T> conjunto, T elemento) {
        System.out.println("Insertando elemento...");
        esperar(200);

        if (conjunto.add(elemento)) {
            System.out.println("¡Elemento insertado!");
        } else {
            System.out.println("HE HE HE YYYYYYYYYYYAHJ");
        }
    }

    @SuppressWarnings("unused")
    private static <T> void eliminar(Set<T> conjunto, T elemento) {
        System.out.println("Eliminando elemento...");
        esperar(200);

        if (conjunto.add(elemento)) {
            System.out.println("¡Elemento eliminado!");
        } else {
            System.out.println("HE HE HE YYYYYYYYYYYAHJ");
        }
    }

    private static <T> void recorreConjunto(Set<T> conjunto) {
        for (T elemento : conjunto) {
            System.out.println(elemento);
        }
    }

}
