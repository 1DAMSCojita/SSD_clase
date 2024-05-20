package simulacion_de_examen;

// Importación de liberías.
import java.util.List;
import java.util.stream.Stream;

public class ComplexPredicateExample {

    public static List<Integer> complexFilter(List<Integer> numbers) {
        
        Stream<Integer> streamNumeros = numbers.stream();
        streamNumeros
                .filter(x -> x > 10 && x % 2 == 0 && x % 4 != 0)
                .forEach(System.out::println);
        
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(8, 12, 15, 16, 18, 20, 22, 24, 30);
        System.out.println(complexFilter(numbers)); // Debe imprimir [12, 18, 20, 30]
    }
}

