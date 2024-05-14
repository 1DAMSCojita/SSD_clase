package intro.pruebasReferencia;

import java.util.function.Function;

public class Calculos {

    Integer cuadrado(Integer a) {
        return a * a;
    }

    static Integer cubo(Integer x) {
        return x * x * x;
    }

    static <T> void aplicar(T[] miArray, Function<T, T> m) {
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = m.apply(miArray[i]);
        }
    }

    static double raizCubo(Double rc) {
        return Math.pow(rc, 1.0/3.0);
    }
    
    // Integer valor;

    // public Calculos() {
    // }

    // public Calculos(Integer valor) {
    //     this.valor = valor;
    // }

    // Calculos siguiente() {
    //     return new Calculos(valor + 1);
    // }

    // @Override
    // public String toString() {
    //     return "Valor = " + this.valor;
    // }

}
