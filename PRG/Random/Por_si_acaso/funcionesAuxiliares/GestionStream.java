package funcionesAuxiliares;

// Importación de liberías.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GestionStream {

    // Método para sumar números con una lista de números y usando Streams.
    public static int sumarNumeros(List<Integer> listaNumeros) {
        
        Stream<Integer> streamNumeros = listaNumeros.stream(); // Creación del Stream pasando la lista.
        
        int suma = streamNumeros.mapToInt(Integer::intValue).sum(); // Creación de una nueva variable y cálculo de suma mapeando y usando el método 'sum()'.

        return suma; // Devolvemos el resultado.
    }

    // Método que cuenta las palabras en una cadena a partir de una longitud mayor de 5.
    public static void contarPalabrasString(List<String> cadenas) {

        Stream<String> streamCadenas = cadenas.stream(); // Se crea el Stream pasando la lista de cadenas.
        long palabras = streamCadenas // Creación de una variable long y asignación del Stream.
                .filter(s -> s.length() > 5) // Condición si la longitud de la cadena es mayor a 5.
                .count(); // Se cuentan las palabras que entren dentro de la condición antes declarada.
        System.out.println("Número de palabras que tienen una longitud mayor a 5: " + palabras);
    }

    // Método para obtener el valor máximo de una lista de números.
    public static void obtenerValorMaximo(List<Integer> listaNumeros) {

        Stream<Integer> streamNumeros = listaNumeros.stream(); // Se crea el Stream pasando la lista de números.
        Optional<Integer> numeroMaximo = streamNumeros // Creación de una variable 'Optional<Integer> (porqué es lo que devuelve el método max)' y asignación del Stream.
                .max(Integer::compareTo); // Se comparan los números para determinar el máximo.
        System.out.println("Valor máximo en la lista: " + numeroMaximo);

    }

    // Método para obtener la longitud de cadenas. 
    public static void obtenerCadenasLongitud(List<String> cadenas, int longitud) {

        Stream<String> streamCadenas = cadenas.stream(); // Se crea el Stream pasando la lista de cadenas.
        streamCadenas
                .filter(s -> s.length() == longitud) // Condición que la longitud de la cadena sea igual a la especificada por parámetro.
                .collect(Collectors.toList())
                .forEach(System.out::println);
   } 

}
