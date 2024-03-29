package intro.mapas;

import java.util.*;
import java.util.Map.*;

@SuppressWarnings("unused")
public class TestMapas {
    public static void main(String[] args) {
        
        Map<Integer, String> miMapa = new HashMap<>();

        miMapa.put(20, "Pedro");
        miMapa.put(33, "Ana");
        miMapa.put(12, "Juan");

        // for(Integer clave : miMapa.keySet()) {
        //     System.out.println( "Clave: " + clave + " Valor: " + miMapa.get(clave));
        // }

        // entrySet() -> Map.Entry
        // getValue() getKey()

        for(Map.Entry<Integer, String> elemento : miMapa.entrySet()) {
            System.out.println("Clave: " + elemento.getKey() + " Valor: " + elemento.getValue());
        }

        // Recorrer valores:
        // for (String valor : miMapa.values()) {
        //     System.out.println(valor);
        // }

        // Collection<String> valores = miMapa.values();

        // for (String valor : valores) {
        //     System.out.println(valor);
        // }

        // Collection<Integer> claves = miMapa.keySet();
        // for (Integer clave : claves) {
        //     System.out.println(clave);
        // }



    }
}
