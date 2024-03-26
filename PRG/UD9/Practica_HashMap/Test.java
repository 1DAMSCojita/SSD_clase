package Practica_HashMap;

// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un array de 'nombres'. 
        String[] nombres = {
            "Stefan", "Julen", "Bruno", "Pedro", "Juan",
            "Javier", "Daniel", "Joaquín", "Carlos", "Alfredo"
        };

        // Creamos un HashMap.
        HashMap<Integer, String> hm = new HashMap<>();
        
        // Generamos IDs aleatorios y asignamos los nombres.
        // Creamos un bucle normal 'for'.
        // Recorrerá la longitud del array de 'nombres' e irá asignando un número aleatorio a cada clave.
        for (int i = 0; i < nombres.length; i++) {
            hm.put((int)(Math.random() * 1000), nombres[i]);
        }

        // Creamos un bucle 'for-each'.
        // Recorrerá las claves que haya en el HashMap y las mostrará.
        for (Integer claves : hm.keySet()) {
            System.out.println(claves);
        }

        // Creamos un bucle 'for-each'.
        // Recorrerá las nombres que haya en el HashMap y las mostrará.
        for (String valores : hm.values()) {
            System.out.println(valores);
        }

    }
}
