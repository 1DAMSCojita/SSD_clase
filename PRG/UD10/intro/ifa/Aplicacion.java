package intro.ifa;

import java.util.function.*;
import java.util.*;

// INTERFACES FUNCIONALES DE LA API DE JAVA
public class Aplicacion {

    // PREDICATE
    // Se emplea para comprobar que una condición en un valor de tipo genérico.

    // Método abstracto: boolean test(T valor), devuelve true si la condición se verifica.

    // Otros métodos (no abstractos):
    // negate(): devuelve un nuevo predicado que es la negación del original.

    // FUNCTION<T, V>
    // Coincide con la funcionalidad de las funciones matemáticas.

    // Método abstracto: V apply(T x)

    // CONSUMER<T>
    // Sirve para realizar una acción a partir de un argumento de entrada.

    // Método abstracto: void accept(T t)

    public static void main(String[] args) {

        // Creamos un array para guardar 50 números Integer.
        Integer[] valores = new Integer[50];

        // Llenamos el array con 50 números aleatorios entre 0 y 100.
        for (int i = 0; i < 50; i++) {
            valores[i] = (int)(Math.random() * 100);
        }

        // Ordenamos para una mejor visualización.
        Arrays.sort(valores);

        // Creamos el filtro con un predicado.
        Predicate<Integer> filtroM3 = x -> x % 3 == 0;

        // Creamos un array y volcamos el resultado de aplicar el filtro.
        Integer[] multiplosDeTres = filtrar(valores, filtroM3);

        System.out.println("Original: " + Arrays.toString(valores));
        System.out.println("Múltiplos de tres: " + Arrays.toString(multiplosDeTres));

    }

    // Implementar un método estático al que le llega como parámetro un array de tipo genérico y un predicado. Este método devuelve
    // otro array con elementos del array original que cumplan la condición del predicado. Tiene que devolver los que sean múltiplo
    // de 3. 
    static <T> T[] filtrar(T[] ar, Predicate<T> filtro) {

        /* No se puede crear un array genérico con el operador new,
         * construimos el array a retornar haciendo una copia vacía,
         * del array original (valores).
        */
        T[] valoresFiltrados = Arrays.copyOf(ar, 0);

        /* Recorremos el array original y aplicamos el filtro según
         * el predicado. Si lo supiera, aumentamos la dimensión del
         * array de filtrado (nuevamente usamos Arrays.copyOf) y le 
         * añadimos el valor.
        */
        for (T t : ar) {
            if (filtro.test(t)) {
                valoresFiltrados = Arrays.copyOf(valoresFiltrados, valoresFiltrados.length + 1);
                valoresFiltrados[valoresFiltrados.length - 1] = t;
            }
        }

        return valoresFiltrados;
    }

    // Predicate<Integer> esMayorQue10 = x -> x > 10;

        // Predicate<Integer> esMenorOIgualQue10 = esMayorQue10.negate();

        // Integer valor = 20;

        // Predicate<Integer> esPar = x -> x % 2 == 0;

        // Predicate<Integer> esMayorQue10YPar = esPar.and(esMayorQue10);

        // if (esMayorQue10YPar.test(valor)) {
        //     System.out.println(valor + " es mayor que 10 y par.");
        // } else {
        //     System.out.println(valor + " o no es mayor que 10 o no es par o es null.");
        // }

        // if (esMayorQue10.test(valor)) {
        //     System.out.println(valor + " es mayor que 10.");
        // } else {
        //     System.out.println(valor + " es menor o igual que 10.");
        // }
        
        // if (esMenorOIgualQue10.test(valor)) {
        //     System.out.println(valor + " es menor o igual que  10.");
        // } else {
        //     System.out.println(valor + " es mayor que 10.");
        // }

        // Cliente c = new Cliente("Stefan", 1.64);
        
        // Predicate<Cliente> lnm5 = x -> x.nombre.length() > 5;
        
        // if (lnm5.test(c)) {
        //     System.out.println("La longitud de " + c.nombre + " es mayor que 5.");
        // } else {
        //     System.out.println("La longitud de " + c.nombre + " es menor o igual que 5.");
        // }
            
        // Function<Double, Double> cuadrado = x -> x * x;
        
        // System.out.println(cuadrado.apply(6.0));

        // Ejemplo:
        // Consumer<Cliente> saludaCliente = c -> System.out.println("Hola " + c.nombre);
        
        // Cliente cli1 = new Cliente("Stefan", 1.64);
        // Cliente cli2 = new Cliente("Papupinga", 1.80);
        // Cliente cli3 = new Cliente("Barabarabara", 1.74);
        // Cliente cli4 = new Cliente("Bereberebere", 1.61);

        // List<Cliente> listaClientes = new ArrayList<>();

        // listaClientes.add(cli1);
        // listaClientes.add(cli2);
        // listaClientes.add(cli3);
        // listaClientes.add(cli4);

        // listaClientes.forEach(saludaCliente);

}
