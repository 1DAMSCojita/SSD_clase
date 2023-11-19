
// Importación de librerías.
import java.util.Scanner;

public class Factoriales {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int x = 0;
        int resultado = 0;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.err.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa consiste en calcular los factoriales de un número.");
        System.out.println("Prúebalo. Escribe uno.");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        x = sc.nextInt(); // Guardamos el número introducido por el usuario.

        if (x > 0) {
            resultado = calculo_factorial(x); // Llamamos a la función 'calculo_factorial' y la guardamos en una nueva variable.
            System.out.println("El factorial de " + x + " es " + resultado); // Mostramos el resultado por consola.    
        } else {
            System.out.println("Error. Introduzca un número válido y vuelva a intentarlo.");
        }
        
        sc.close(); // Cerramos escáner.
    }

    // Creamos una función para calcular el factorial correspondiente.
    public static int calculo_factorial(int x) {
        // Creamos una estructura de control 'if'.
        // Si 'x' es igual a 0. Devolverá uno.
        // Por el contrario, realizará el cálculo.
        if (x == 0) {
            return 1; 
        } else {
            return x * calculo_factorial(x - 1); // Aquí hacemos una llamada recursiva. Llamando a la función y realizando el cálculo simultáneamente para obtener el resultado y devolverlo.
        }
    }

}
