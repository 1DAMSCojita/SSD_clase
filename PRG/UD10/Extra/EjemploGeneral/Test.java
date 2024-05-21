package EjemploGeneral;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Function que duplica un número
        Function<Integer, Integer> duplicar = num -> num * 2;

        // Predicate que comprueba si un número es par
        Predicate<Integer> esPar = num -> num % 2 == 0;

        // Consumer que imprime un número
        Consumer<Integer> imprimir = System.out::println;

        // Usamos Stream para procesar la lista
        numeros.stream()
            .map(duplicar)  // Duplicamos cada número
            .filter(esPar)  // Filtramos los números pares
            .forEach(imprimir);  // Imprimimos cada número
    }
}
