package Uso_HashMap;

// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un HashMap.
        HashMap<Integer, String> hm = new HashMap<>();

        // Añadimos elementos al HashMap.
        hm.put(31, "HOLA");
        hm.put(25, "ADIOS");
        hm.put(45, "BUENAS");
        hm.put(18, "HELLO");
        hm.put(99, "CIAO");

        // Sustituimos el valor de clave 45 por otro nuevo.
        hm.replace(45, "VALOR NUEVO");

        // Consultamos el tamaño que tiene.
        System.out.println(hm.size());

        // Eliminamos el elemento con índice 18.
        hm.remove(18);

        // Obtenemos el valor del elemento de clave 99.
        System.out.println(hm.get(99));

        // Recorremos el HashMap para ver sus claves.
        for (Integer clave : hm.keySet()) {
            System.out.println(clave);
        }

        // Recorremos el HashMap para ver sus valores.
        for (String valores : hm.values()) {
            System.out.println(valores);
        }

        // Comprobamos si en el HashMap existe una clave con índice 45.
        if (hm.containsKey(45)) {
            System.out.println("Se ha encontrado la clave 45.");
        } else {
            System.out.println("No existe o no se encuentra la clave 45.");
        }

        // Borramos todos los elementos del HashMap.
        hm.clear();

    }
}
