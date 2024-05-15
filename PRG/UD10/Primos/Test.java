package Activitat_10_5;

// Importación de librerías.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        // Llamamos a los métodos para generar los números.
        generaNumeros();
        generaNumerosConListaYArray();
    }

    // Implementamos el método especificado por el ejercicio para comprobar si un número es primo.
    static boolean esPrimo(Integer n) {
        // Creamos una estructura de control 'if'.
        // Si el número es 1, devolverá false.
        // En caso contrario (y que sea 2) devolverá 'true'.
        // En el caso general, usamos un bucle 'for' para verificar si 'n' encuentra un divisor. Devuelve false ya que no sería primo.
        // Si no lo encuentra, es primo, por lo tanto sale del bucle y devuelve 'true'.
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Creamos un método para generar números aleatorios con streams (básicamente para hacer el primer apartado y el segundo).
    public static void generaNumeros() {

        // Generamos un Stream con los números. Posteriormente usamos lambda y empleamos el método 'generate()' para generar números aleatorios. Luego con 'limit()'
        // indicamos que el máximo de números sea 100 como se dijo en el enunciado.
        Stream<Integer> streamNumeros = Stream.generate(() -> (int)(Math.random() * 1000)).limit(100);
        System.out.println("__________________________________________________________________________________");
        System.out.println("\nLista de números aleatorios (ordenados de menor a mayor):");
        streamNumeros // Referenciamos al Stream de números.
            .filter(Test::esPrimo) // Usamos un filter y llamamos estáticamente desde la clase al método 'esPrimo()' para comprobar si cada número es primo.
            .sorted() // Ordenamos por orden natural los números, logrando así ordenarlos de menor a mayor.
            .forEach(System.out::println); // Mostramos cada número si es primo.
        
        // Repetimos el mismo proceso que anteriormente pero cambiando la manera de ordenar de los números.
        Stream<Integer> streamNumeros2 = Stream.generate(() -> (int)(Math.random() * 1000)).limit(100);
        System.out.println("__________________________________________________________________________________");
        System.out.println("\nSegunda lista de números aleatorios (ordenados de mayor a menor): ");
        streamNumeros2
            .filter(Test::esPrimo)
            .sorted(Comparator.reverseOrder()) // Usando Comparator dentro del sort ordenamos invertidamente con el método 'reverseOrder()' para hacerlo de mayor a menor.
            .forEach(System.out::println);
    
        // Repetimos el mismo proceso que los anteriores streams pero cambiando filtrándolos de una manera específica.
        Stream<Integer> streamNumeros3 = Stream.generate(() -> (int)(Math.random() * 1000)).limit(100);
        System.out.println("__________________________________________________________________________________");
        System.out.println("\nTercera lista de números aleatorios (comprendidos entre 200 y 800. De mayor a menor): ");
        streamNumeros3
            .filter(n -> n >= 200 && n <= 800) // Filtramos los números para que se muestren sólo los que estén comprendidos entre 200 y 800.
            .filter(Test::esPrimo)
            .sorted(Comparator.reverseOrder()) // Usando Comparator dentro del sort ordenamos invertidamente con el método 'reverseOrder()' para hacerlo de mayor a menor.
            .forEach(System.out::println);
    }

    // Creamos un método para generar los números obteniendo una lista y un array.
    public static void generaNumerosConListaYArray() {

        // Creamos los streams como el método anterior.
        System.out.println("__________________________________________________________________________________");
        System.out.println("\nNúmeros devueltos usando un método devolviendo una lista: ");
        Stream<Integer> streamNumerosList = Stream.generate(() -> (int)(Math.random() * 1000)).limit(100);
        List<Integer> listaNumeros = new ArrayList<>(); // Creamos una lista.
        listaNumeros.addAll(devuelveLista(streamNumerosList)); // Añadimos toda la lista de números stream al usando el método de 'devuelveLista()'.
        // Creamos un bucle 'for-each'.
        // Recorrerá la lista de números y las mostrará por consola.
        for (Integer integer : listaNumeros) {
            System.out.println(integer);
        }
        System.out.println("__________________________________________________________________________________");
        System.out.println("\nNúmeros devueltos usando un método devolviendo un array: ");
        Stream<Integer> streamNumerosArray = Stream.generate(() -> (int)(Math.random() * 1000)).limit(100);
        Integer[] arrayNumeros = devuelveArray(streamNumerosArray); // Creamos un array y dentro añadimos el stream de números con array y la añadimos usando el método de 'devuelveLista()'.
        // Creamos un bucle 'for-each'.
        // Recorrerá la lista de números y las mostrará por consola.
        for (Integer integer : arrayNumeros) {
            System.out.println(integer);
        }

    }

    // Creamos un método para devolver una lista de números.
    static List<Integer> devuelveLista(Stream<Integer> streamNumeros) {

        /*
         * Creamos una lista de números y dentro filtramos el stream de números llamando al método para comprobar
         * si los números son primos y luego aplicamos un 'Collectors.toList()' para pasarlos a lista.
         */
        List<Integer> numeros = streamNumeros.filter(Test::esPrimo).collect(Collectors.toList());

        return numeros; // Devolvemos la lista de números.
    }

    // Creamos un método para devolver un array de números.
    static Integer[] devuelveArray(Stream<Integer> streamNumeros) {

        /*
         * Creamos un array de númreos y dentro hacemos lo mismo que 'devuelveLista()' pero en vez de usar el método 'collect()'
         * lo haremos con el método 'toArray()' para dentro pasar el array de números al Stream.
         */
        Integer[] numeros = streamNumeros.filter(Test::esPrimo).toArray(Integer[]::new);

        return numeros; // Devolvemos el array de números.
    }
    
}
