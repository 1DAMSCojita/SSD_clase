package simulacion_de_examen;

// Importación de liberías.
import java.util.List;
import java.util.stream.Stream;

public class PredicateExample {

    public static List<String> getFilteredStrings(List<String> strings) {
    
        Stream<String> streamCadenas = strings.stream(); // Creación de Stream con el array de cadenas.
        streamCadenas
                .filter(s -> s.startsWith("A") && s.length() > 3) // Filtrando números si empiezan con "A" y su longitud es mayor a 3.
                .forEach(System.out::println);

        return strings;
    }
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Art", "Ape", "Banana", "Anchor");
        System.out.println(getFilteredStrings(strings)); // Debe imprimir [Apple, Anchor]
    }
}

