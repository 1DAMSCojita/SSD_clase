package intro.primos;

public class Test {
    public static void main(String[] args) {
        
        /*
         * Implementar el método
         * 
         * static boolean esPrimo(Integer n)
         * 
         * que devuelve:
         * -> true: si n es primo.
         * -> false: en caso contrario.
         * 
         * Escribir un programa que genere 100 números aleatorios menores que 1000 y que muestre por consola todos los que son primos:
         * 
         * a) Ordenados de menor a mayor.
         * b) Ordenados de mayor a menor.
         * c) Solo los comprendidos entre 200 y 800.
         * 
        */

        for (int i = 0; i < 100; i++) {
            int x = (int)(Math.random() * 1000);
            if (esPrimo(x)) {
                System.out.println(x);
            }
        }

    }

    static boolean esPrimo(Integer n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
