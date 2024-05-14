package intro.referenciaAMetodo;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        
        double numero = 16;

        // double raizCuadrada = Math.sqrt(numero);

        // REFERENCIA AL MÉTODO
        // Math::sqrt

        Function<Double, Double> raiz2 = Math::sqrt;

        double raizCuadrada = raiz2.apply(numero);

        System.out.println(raizCuadrada);
    }
}
