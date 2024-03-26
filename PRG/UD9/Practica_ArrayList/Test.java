package Practica_ArrayList;

// Importación de librerías.
import java.util.*;

public class Test {

    static Scanner sc = new Scanner(System.in); // Creamos un escáner estático para poder usarlo en todos los métodos (aunque lo necesitemos una vez).
    public static void main(String[] args) {
        
        // Creamos el ArrayList.
        ArrayList<Integer> al = new ArrayList<>();

        // Añadimos 10 números enteros al ArrayList.
        al.add(5);
        al.add(15);
        al.add(25);
        al.add(35);
        al.add(45);
        al.add(50);
        al.add(55);
        al.add(65);
        al.add(75);
        al.add(85);

        System.out.println(sumaNumerosPares(al)); // Llamamos a la función de 'sumaNumerosPares'. Indicará los números pares por consola.

        // Creamos una nueva lista para imprimir palabras.
        ArrayList<String> alPalabras = new ArrayList<>();

        // Añadimos palabras a la lista.
        alPalabras.add("Perro");
        alPalabras.add("Gato");
        alPalabras.add("Cerdo");
        alPalabras.add("Lobo");
        
        palabrasCincoLetras(alPalabras, 0); // Llamamos a la función de 'palabraCincoLetras'. Indicará las palabras que tengan exactamente 5 letras.

    }

    // Creamos un método estático para encontrar la suma de todos los numéros pares en el ArrayList.
    public static int sumaNumerosPares(ArrayList<Integer> al) {
        
        // Declaración de variables.
        int suma = 0;

        // Creamos un bucle 'for-each'.
        // Recorrerá la colección 'al' 
        for (Integer numero : al) {
            // Creamos una estructura de control 'if'.
            // Si el número es par, se calcula el resto de la división entre 'numero' y '2'. 
            // Si el resto es igual a 0, significará que el número es par.
            if (numero % 2 == 0) {
                suma += numero;
            }
        }

        return suma; // Devolvemos la suma.
    }
    
    // Creamos un método estático para imprimir cada palabra en una lista que tenga exactamente la longitud especificada.
    public static void palabrasCincoLetras(ArrayList<String> alPalabras, int longitud) {

        // Pedimos al usuario la longitud que quiera para la palabra y la guardamos en el escáner.
        System.out.println("Escribe la longitud deseada para la palabra: ");
        longitud = sc.nextInt();
        
        // Creamos un bucle 'for-each'.
        // Recorrerá la colección de 'alPalabras'.
        for (String palabras : alPalabras) {
            // Creamos una estructura de control 'if'.
            // Si la palabra se encuentra en la longitud especificada se imprimirá, resumidamente.
            if (palabras.length() == longitud) {
                System.out.println(palabras);
            }
        }
    }
}
