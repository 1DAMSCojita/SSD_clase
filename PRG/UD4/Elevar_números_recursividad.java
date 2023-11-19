
// Importación de librerías.
import java.util.Scanner;

public class Elevar_números_recursividad {
    public static void main(String[] args) {
        
        // Declaración de variables.
        double x = 0.0;
        int y = 0;
        double fin = 0.0;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos el programa.
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa consiste en elevar tus números.");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("Escribe un número: ");
        x = sc.nextDouble(); // Guardamos el número introducido por el usuario.
        System.out.println();
        System.out.println("Ahora, escribe el numero por el cuál quieras elevarlo: ");
        y = sc.nextInt(); // Guardamos el número que el usuario quiere elevar.
        System.out.println();

        fin = elevar_numeros(y, x); // Llamamos a la función 'elevar_numeros' y la guardamos en una nueva variable.
        System.out.println(fin); // Mostramos el resultado por consola.

        sc.close(); // Cerramos escáner.
    }

    // Declaramos una nueva función que se encargará de elevar los números. 'y' será el elevado y 'x' el número base. 
    public static double elevar_numeros(int y, double x) {

        // Creamos una estructura de control 'if'.
        // Si es igual a 0, solamente devolverá un
        // uno.
        if (y == 0) {
            return 1; // Devuelve uno.
        } else {
            return x * elevar_numeros(y - 1, x); // Llamamos a la función 'elevar_numeros' mediante recursividad, multiplicándola por 'x' y devolviéndola para posteriormente
                                                // poder mostrar el resultado.
        }
        
    }
}
