package intro.mapas;

import java.util.*;
import java.util.Map.*;

public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Map -> Clave - Valor
        // Las claves tienen que ser diferentes.

        // HashMap / TreeMap / HashTable
        HashMap<Integer, String> hm = new HashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Métodos de MAP
        String valor = tm.put(5, "Hola");
        tm.put(6, "cara");
        tm.put(-1, "de");
        tm.put(0, "bola");
        tm.put(99, "Hola");

        // tm.replace(6, "cabeza");
        // System.out.println(tm.get(6));

        // System.out.println(tm.size());

        // System.out.println(tm.containsKey(6));
        // System.out.println(tm.containsValue("cara"));
        // tm.remove(6);
        // System.out.println(tm.containsValue("cara"));
        // System.out.println(tm.get(6));
        // System.out.println(tm.containsKey(6));

        // ArrayList<String> al = (ArrayList<String>) tm.values();

        // for (String s : al) {
        //     System.out.println(s);
        // }

        // TreeSet<Integer> al = new TreeSet<Integer> (tm.keySet());

        Set<Entry<Integer, String>> ss = tm.entrySet();

        // Métodos TreeMap
        // object ceilingMap(clave)
        // object floorEntry(clave)
        // object ceilingKey(clave)
        // object floorKey(clave)
        // firstEntry()
        // firstKey()
        // lastEntry()
        // lastKey()
        
        // Método para HashMap
        // clone()

        // HashTable
        // Muy parecido a HashMap y tiene un rendimiento peor. No permite valores null en las claves ni valores.

        // LinkedHashMap
        // Similar también a HashMap pero aquí sus valores si tienen un orden de inserción.
    }
}
