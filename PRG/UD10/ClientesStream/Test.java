package ClientesStream;

// Importación de librerías.
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un array de clientes y los vamos añadiendo.
        Cliente[] aClientes = {
            new Cliente("Stefan", 18),
            new Cliente("Pedro", 27),
            new Cliente("Paco", 21),
            new Cliente("Eustaquio", 30)
        };

        Comparator<Cliente> comparaNombres = (x, y) -> x.nombre.compareTo(y.nombre); // Creamos el comparador usando Comparator con lambda, comparando por nombre
        Stream<Cliente> streamClientes = Stream.of(aClientes); // Añadimos el array de clientes al Stream.
        streamClientes
            .sorted(comparaNombres) // Implementamos el comparador usando el método 'sorted()'
            .forEach(System.out::println); // Mostramos los clientes por consola.

    }
}
