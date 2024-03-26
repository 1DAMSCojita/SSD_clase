package Colecciones_y_Mapas;

// Importación de librerías.
import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        // Declaración de cadenas.
        String cadenaUno = "Casa";
        String cadenaDos = "Lunes";

        // Mostramos por consola los resultados.
        System.out.println("_________________________________________________________________________________\n");
        System.out.println("En " + cadenaUno + " hay " + caracteresUnicos(cadenaUno) + " carácteres únicos.");
        System.out.println("_________________________________________________________________________________\n");
        System.out.println("En " + cadenaDos + " hay " + caracteresUnicos(cadenaDos) + " carácteres únicos.");
        System.out.println("_________________________________________________________________________________\n");
    }

    // Creamos un método para contar los carácteres únicos.
    public static int caracteresUnicos(String cadena) {

        // Declaración de HashMap.
        Map<String, Integer> cache = new HashMap<>();

        // Declaración de variables.
        int c_unicosContador = 0;

        // Creamos un bucle 'for'.
        // Iterará a través de cada índice de la cadena.
        for (int i = 0; i < cadena.length(); i++) {
            boolean esRepetido = false; // Inicializamos una variable para rastrear si el carácter del índice se repite.
            // Creamos otro bucle 'for' (anidándolo con el primero).
            // Iterará sobre cada índice para comparar el carácter en el índice 'i' con otros carácteres.
            for (int j = 0; j < cadena.length(); j++) {
                // Creamos una estructura de control 'if'.
                // Comprobará si el carácter en el índice 'i' es igual al índice 'j'. 
                // Si es repetido, la variable booleana 'esRepetido' se vuelve 'true' y saldrá del bucle ya que no será necesario seguir contando más.
                if(i != j && cadena.charAt(i) == cadena.charAt(j)){
                    esRepetido = true;
                    break;
                }
            }
            // Creamos una estructura de control 'if'.
            // Si el carácter en el índice 'i' no se repite, incrementará el contador de carácteres únicos.
            if (!esRepetido) {
                c_unicosContador++;
            }
        }

        // Almacenamos el resultado en la caché.
        cache.put(cadena, c_unicosContador);

        // Creamos una estructura de control 'if'.
        // Verificará si el resultado está en caché.
        if (cache.containsKey(cadena)) {
            System.out.println("La cadena " + cadena + " se encontraba en el caché del programa.");
        }
        
        return c_unicosContador; // Devolvemos el contador.
    }
}
