package Interficies_Funcionales_I;

// Importación de librerías.
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        
        Integer[] numeros = {5, 400, 1000, 85}; // Creamos un array de Integers y añadimos números de ejemplo.
        Double[] raices = new Double[numeros.length]; // Creamos otro array con la longitud de los números.

        Function<Integer, Double> fRaiz = n -> Math.sqrt(n); // Creamos una función con el function para calcular la raíz cuadrada y usamos lambda para calcular la raíz.

        transformar(numeros, raices, fRaiz); // Llamamos al método de 'transformar' y añadimos los números, las raíces y la función anteriormente creada.

        // Creamos un bucle 'for'.
        // Recorrerá el array de raíces y mostrará los resultados por consola.
        for (int i = 0; i < raices.length; i++) {
            System.out.println("La raiz cuadrada del número " + numeros[i] + " es: " + raices[i]);
        }

    }

    static <T, V> V[] transformar(T[] original, V[] transformat, Function<T, V> f) {

        // Creamos un bucle 'for'.
        // Recorrerá el segundo array de 'transformat' y asignará los elementos del 'original' al segundo array.
        for (int i = 0; i < transformat.length; i++) {
            transformat[i] = f.apply(original[i]); // Añadimos el array 'original' con el resultado obtenido de la función 'f' al array transformado.  
        }

        return transformat; // Devolvemos el segundo array con los elementos del primero.
    }
    
}
