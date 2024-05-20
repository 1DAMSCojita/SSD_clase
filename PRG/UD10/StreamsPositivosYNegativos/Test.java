package StreamsPositivosYNegativos;

// Importación de librerías.
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = new ArrayList<>(); // Creamos una lista de números.

        // Creamos un bucle 'for'.
        // Iterará mientras 'i' sea menor que 40, asignando los números.
        for (int i = 0; i < 40; i++) {
            /*
             * Creamos una variable para almacenar los números aleatorios y dentro hacemos un Math.random para obtenerlos.
             * Multiplicar el Math.random() por 41 da un número entero entre 0 y 40, despues al restarlo por 20 aseguramos que esté
             * en el rango de -20 a 20. Y finalmente lo convertimos a 'int'.
             * 
             */
            int numsAleatorios = ((int)(Math.random() * 41) - 20);
            listaNumeros.add(numsAleatorios); // Añadimos los números a la lista.
        }
    
        // Llamamos a los métodos pertinetes.
        streamsPositivosYNegativos(listaNumeros);
        streamEntreMenosDiezyDiez(listaNumeros);
    }

    // Creamos un método para crear y gestionar los streams positivos y negativos.
    public static void streamsPositivosYNegativos(List<Integer> listaNumeros) {

        Stream<Integer> streamPositivos = listaNumeros.stream(); // Creamos un Stream y añadimos la lista.
        System.out.println("Lista de números positivos (eliminando los repetidos):");
        streamPositivos
                .filter(x -> x >= 0) // Filtramos los números usando lambda si el número es mayor o igual a 0. Mostrando así los positivos.
                .distinct() // Eliminamos los números repetidos.
                .forEach(System.out::println); // Mostramos los números por consola.
        
        // Repetiremos lo mismo que el stream anterior resumidamente pero cambiando el 'filter()'
        Stream<Integer> streamNegativos = listaNumeros.stream();
        System.out.println("________________________________________________________");
        System.out.println("\nLista de números negativos (eliminando los repetidos):");
        streamNegativos
                .filter(x -> x < 0) // Filtramos los números usando lambda si el número es menor a 0. Mostrando así los negativos.
                .distinct()
                .forEach(System.out::println);
    }

    // Creamos un método que generará el stream y contará la cantidad de números que hay entre -10 y 10.
    public static void streamEntreMenosDiezyDiez(List<Integer> listaNumeros) {
        Stream<Integer> streamEntreMenosDiezyDiez = listaNumeros.stream(); // Creamos el pasando la lista.
        /*
         * Creamos una variable con la cantidad de streams y declaramos que será igual al stream. Lo hago así 
         * ya que es la única manera con la que me funcionó, ya que si ponemos el stream así sin más como hicimos antes
         * da error. La variable más de lo mismo, solo deja hacerla long, por el count.
         */
        long cantidadNumeros = streamEntreMenosDiezyDiez
                .filter(x -> x >= -10 && x <= 10) // Filtramos los números usando lambda si el número está comprendido entre -10 y 10.
                .distinct()
                .count(); // Contamos la cantidad de números que haya en el rango.
        System.out.println("________________________________________________________");
        System.out.println("\nCantidad de números entre -10 y 10 -> " + cantidadNumeros); // Mostramos la cantidad por consola.
    }
}
