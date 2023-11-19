
// Importación de librerías.
import java.util.Scanner;

public class Contador_de_palabras {
    public static void main(String[] args) {
        
        // Declaración de variables.
        String frase = "";
        int contar_palabras = 0;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        System.err.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa consiste en contar las palabras de una frase que me pongas.");
        System.out.println("Escribe una frase.");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        frase = sc.nextLine();

        String[] palabras = frase.split("\\s+"); // Creamos un array llamado 'palabras', usamos un método llamado split de String[] para poder dividir frase en una subcadena y con "\\s+" cogemos los espacios para contar las palabras. 
        contar_palabras = palabras.length; // Ponemos que la longitud de la variable 'palabras' (que estará formada a partir de los espacios) se guarde en una nueva variable.
        
        System.out.println("En esta frase hay " + contar_palabras + " palabras."); // Mostramos el resultado por consola.
        
        sc.close(); // Cerramos escáner.
    }
}
