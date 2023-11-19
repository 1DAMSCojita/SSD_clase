
// Importación de librerías.
import java.util.Scanner;

public class Constante_de_Kaprekar {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int x = 0; // Declaramos 'x' que será el número que introducirá el usuario.

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        System.err.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("¡Bienvenido a la Constante de Kaprekar en Java! En este programa llegarás siempre al mismo resultado. ");
        System.out.println("Prúebalo. Introduce un número de 4 cifras.");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        x = sc.nextInt();

        if (es_numero_de_cuatro_cifras(x)) {
            
        }

        sc.close();
    }

    // Creamos una nueva función que determinará si el número que introduzca el usuario tiene 4 cifras.
    public static boolean es_numero_de_cuatro_cifras(int x) {
        return x >= 1000 && x <= 9999;
    }


}
