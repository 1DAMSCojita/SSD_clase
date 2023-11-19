
// Declaración de variables.
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        
        // Declaración de variables.
        String entrada = "";

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa te dirá si la frase, número o cualquier tipo de carácter que pongas es o no un palíndromo.");
        System.out.println("Escribe cualquier cosa.");
        System.out.println();
        System.out.println("Nota: No uses espacios.");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        entrada = sc.nextLine(); // Guardamos la entrada del usuario.

        // Creamos una estructura de control 'if'.
        // Llamamos a la función 'es_palindromo' la cuál es booleana.
        // Si es palíndromo, el programa lo indicará. Si no, lo negará.
        // Sencillo.
        if (es_palindromo(entrada)) {
            System.out.println("Es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }
        
        sc.close(); // Cerramos escáner.
    }

    // Creamos una función "es_palindromo" para verificar si la entrada que introdució el usuario es o no palíndromo.
    public static boolean es_palindromo(String entrada) {

        // Declaración de variables.
        int longitud = entrada.length(); // Longitud será la "longitud" de la cadena.

        // Creamos un bucle 'for'.
        // Se ejecutará mientras 'i' sea la mitad de la longitud de la cadena. Por eso se divide entre 2.
        for (int i = 0; i < longitud / 2; i++) {
            if (entrada.charAt(i) != entrada.charAt(longitud - i - 1)) { // Comparamos el carácter en la posición i con el carácter en la posición simétrica desde el final de la cadena (longitud - i - 1).
                return false;
            }
        }

        return true;
    }
}
