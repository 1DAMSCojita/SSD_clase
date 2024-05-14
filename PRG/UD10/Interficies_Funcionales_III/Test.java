package Interficies_Funcionales_III;

// Importación de librerías.
import java.util.*;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una lista de números.
        List<Integer> numeros = new ArrayList<>();

        // Añadimos números a la lista.
        numeros.add(4);
        numeros.add(16);
        numeros.add(80);
        numeros.add(100);

        Function<Integer, Double> fRaiz = n -> Math.sqrt(n); // Creamos una función con function para calcular la raíz cuadrada y usamos lambda para calcular la raíz.

        List<Double> raices = transformar(numeros, fRaiz); // Creamos una lista double para las raíces y llamamos al método 'transformar', le asignamos la lista de números y la función.

        System.out.println(raices); // Mostramos los resultados por consola.
    }

    static <T, V> List<V> transformar(List<T> original, Function<T, V> f) {

        List<V> transformado = new ArrayList<>(); // Creamos un segundo array.

        // Creamos un bucle 'for-each'.
        // Recorrerá el array de original y asignará los elementos del 'original' al segundo array creado anteriormente.
        for (T elemento : original) {
            transformado.add(f.apply(elemento)); // Añadimos el array 'elemento' (que es de original) con el resultado obtenido de la función 'f' al array transformado.   
        }

        return transformado; // Devolvemos el array de transformado.
    }
}
