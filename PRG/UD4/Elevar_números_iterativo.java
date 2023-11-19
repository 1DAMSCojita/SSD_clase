
// Importación de librerías.
import java.util.Scanner;

public class Elevar_números_iterativo {
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
        x = sc.nextDouble();
        System.out.println();
        System.out.println("Ahora, escribe el numero por el cuál quieras elevarlo: ");
        y = sc.nextInt();
        System.out.println();

        fin = elevar_numeros(y, x); // Llamamos a la función 'elevar_numeros' y la guardamos en una nueva variable.
        System.out.println(fin); // Mostramos el resultado por consola.

        sc.close(); // Cerramos escáner.
    }

    // Declaramos una nueva función que se encargará de elevar los números. 'y' será el elevado y 'x' el número base. 
    public static double elevar_numeros(int y, double x) {

        // Declaración de la variable para el resultado.
        double resultado = 1;

        // Creamos un bucle 'while'.
        // Mientras la elevación sea superior a 0. Se realizarán los cálculos necesarios.
        while (y > 0) {
            resultado *= x; // Multiplicamos 'resultado' por 'x'. En resumidas cuentas, estamos multiplicando la base x repetidamente.
            y--; // Decrementamos 'y' en 1.
        }

        return resultado; // Devolvemos el resultado.
    }
}
