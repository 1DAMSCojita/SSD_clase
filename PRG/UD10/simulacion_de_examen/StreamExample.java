package simulacion_de_examen;

// Importación de liberías.
import java.util.*;
import java.util.stream.Stream;

public class StreamExample {

    public static List<Integer> filterAndTransform(List<Integer> numbers) {
        
        Stream<Integer> streamNumbers = numbers.stream(); // Creación de Stream con el array de números.
        streamNumbers
            .filter(x -> x % 2 == 0) // Condición si es divisible e igual a 0 es par.
            .map(x -> x * 2) // Mapear para multiplicar los elementos entre 2.
            .forEach(System.out::println); // Mostramos todo por consola.

        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(filterAndTransform(numbers)); // Debe imprimir [4, 8, 12]
    }
}

