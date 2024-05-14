package intro.pruebasReferencia;

import java.util.Arrays;
import java.util.function.Function;

@SuppressWarnings("unused")
public class Test {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        // Function<Integer, Integer> f1 = Calculos::cubo;

        Calculos calc = new Calculos();
        // Function<Integer, Integer> f2 = calc::cuadrado;

        // Integer[] t = {1, 2, 3, 4, 5};

        // Calculos.aplicar(t, f2);
        // Calculos.aplicar(t, f1);
        // Calculos.aplicar(t, Calculos::cubo);

        // System.out.println(Arrays.toString(t));

        // Calculos calc2 = new Calculos(1);
        // System.out.println(calc2.toString());
        // calc2 = calc2.siguiente();
        // System.out.println(calc2.toString());

        // Function<String, Cliente> saludo = Cliente::new;
        // Cliente c = saludo.apply("Stefan");
        // System.out.println(c);
        System.out.println(calc.raizCubo(27.0));

    }

    // static <T, V> V[] transformar(T[] original, V[] transformat, Function<T, V> f) {

    //     // Creamos un bucle 'for'.
    //     // Recorrerá el segundo array de 'transformat' y asignará los elementos del 'original' al segundo array.
    //     for (int i = 0; i < transformat.length; i++) {
    //         transformat[i] = Calculos.raizCubo(original[i]); // Añadimos el array 'original' con el resultado obtenido de la función 'f' al array transformado.  
    //     }

    //     return transformat; // Devolvemos el segundo array con los elementos del primero.
    // }
}
