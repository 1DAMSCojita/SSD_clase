package intro.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class Test {

    public static void main(String[] args) {
        
        // INTERFAZ STREAM

        // TUBERÍA o PIPELINE

        // A partir de una colección:
        // Stream<T> nombreStream = nombreColeccion.stream();

        // A partir de un array:
        // Stream<T> nombreStream = Stream.of(array);

        // Stream<T> nombreStream = Stream.of(valor1, valor2, ...);

        List<String> lista = new ArrayList<>();
        lista.add("dado");
        lista.add("arte");
        lista.add("bola");
        lista.add("asa");
        lista.add("buzo");
        lista.add("coche");
        lista.add("barco");
        lista.add("duna");

        try {
            // Stream<String> streamCadenas = lista.stream();

            // // filter

            // // Stream<T> filter(Predicate<? Super T> pred)

            // Predicate<String> empiezaPorA = s -> s.startsWith("a");

            // Stream<String> streamA = streamCadenas.filter(empiezaPorA);
            // // Stream<String> streamA = streamCadenas.filter(s -> s.startsWith("a"));

            // // streamA.forEach(System.out::println);

            // Consumer<String> mostrar = s -> System.out.println(s);

            // // streamA.forEach(mostrar);
            // streamA.forEach(s -> System.out.println(s));

            // streamCadenas.filter(s -> s.startsWith("b")).forEach(System.out::println);

            Cliente[] clientes = {
                new Cliente("Stefan", "Y2448045P", 1970),
                new Cliente("Ana", "Y34335333sP", 2001),
                new Cliente("Pere", "Y465665466P", 2005),
                new Cliente("Sofia", "Y2432323P", 1988),
            };

            // Stream<Cliente> streamCliente = Stream.of(clientes);
            // Stream<Cliente> streamCliente = Arrays.stream(clientes);

            // Sorted
            // Comparator<Cliente> compCliNombre = (x, y) -> x.nombre.compareTo(y.nombre);
            // Function<Cliente, String> aDNI = c -> c.DNI;
            // long cuantos = Arrays.stream(clientes)
            //                     .filter(c -> c.edad > 30)
            //                     .count();
            // System.out.println(cuantos); 

            // distinct()
            // Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 5, 4, 2, 1, 6, 8, 1, 0, 2, 3)
            //                                     .distinct()
            //                                     .forEach(x -> System.out.println(x + " "));
            // int sumaEdades = Arrays.stream(clientes)
            //                         .mapToInt(c -> c.edad)
            //                         .sum();
            // System.out.println(sumaEdades);
            // double mediaEdades = Arrays.stream(clientes)
            //                         .mapToInt(c -> c.edad())
            //                         .average()
            //                         .getAsDouble();
            // System.out.println(mediaEdades);

            // max()
            // min()
            // skip(long n)

            // reduce()

            // int sumaEdades = Arrays.stream(clientes)
            //                         .map(Cliente::edad)
            //                         .reduce(1, (a, b) -> a * b);
            // System.out.println(sumaEdades);

            // Stream<Integer> streamEnteros = Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 5, 4, 2, 1, 6, 8, 1, 0, 2, 3);
            // Stream<Integer> streamNegativos = Stream.of(-1, -6, -3, -3);
            // // concat()
            
            // Integer[] arrayObject = Stream.concat(streamEnteros, streamNegativos)
            //                         .distinct()
            //                         .sorted()
            //                         .filter(x -> x % 2 == 0)
            //                         .toArray(Integer[]::new);
            // System.out.println(Arrays.deepToString(arrayObject));
            // System.out.println(arrayObject.getClass().toString());

            // List<Integer> listaNumeros = Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 5, 4, 2, 1, 6, 8, 1, 0, 2, 3)
            //                         .collect(Collectors.toList());

            // Set<Integer> conjuntoNumeros = Stream.of(4, 3, 7, 1, 0, 8, 9, 3, 5, 4, 2, 1, 6, 8, 1, 0, 2, 3)
            //                         .collect(Collectors.toCollection(TreeSet::new));

            // conjuntoNumeros.add(-10);
            // for (Integer i : conjuntoNumeros) {
            //     System.out.println(i);
            // }

            // String[] arrayDeTipoString = Arrays.copyOf(arrayObject, arrayObject.length, String[].class);

            // System.out.println(Arrays.deepToString(arrayDeTipoString));

            Map<String, String> mapaClientes = Stream.of(clientes)
                                .collect(Collectors.toMap(c -> c.DNI, c -> c.nombre));
            // System.out.println(mapaClientes);

            double edadMedia = Stream.of(clientes)
                                .collect(Collectors.averagingInt(c -> c.edad()));
            
            // System.out.println(edadMedia);

            IntSummaryStatistics sumarioEdad = Stream.of(clientes)
                                .collect(Collectors.summarizingInt(c -> c.edad()));

            // System.out.println(sumarioEdad);

            String nombres = Arrays.stream(clientes)
                                .map(c -> c.nombre)
                                .collect(Collectors.joining());
            System.out.println(nombres);

        } catch (IllegalStateException e) {
            System.out.println("El stream ya había sido utilizado jaja quin pringat.");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }

    }
}
