
// Importación de librerías.
import java.util.Scanner;

public class Barcos {
    public static void main(String[] args) {

        // Presentamos la aplicación.
        System.out.println("___________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa te pediré información de barcos.");
        System.out.println("____________________________________________________________________________________________________________________________");
        System.out.println();
        
        resumen(); // Llamamos a la función resumen que mostrará todo por consola.
    }

    // Creamos una nueva función que se encargará de pedir y devolver el nombre del barco. 'x' siempre será lo que introduzca el usaurio.
    public static String nombre_barco(String x) {

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        System.out.println("Introduce el nombre de tu barco:"); // Pedimos el nombre.
        x = sc.nextLine(); // Guardamos el nombre.
        
        return x; // Devolvemos el nombre.
    }

    // Creamos una nueva función que se encargará de pedir y devolver el número de toneladas de capacidad.
    public static double capacidad_de_carga_barco(double x) {

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        System.out.println("Introduce la capacidad de carga del barco:"); // Pedimos la capacidad.
        x = sc.nextDouble(); // Guardamos las toneladas.
        return x; // Devolvemos las toneladas.
    }

    // Creamos una nueva función llamada 'resumen' que se encargará de 
    public static void resumen() {
        // Llamamos a las funciones asignándolas introduciéndolas en nuevas variables.
        String nombre = nombre_barco(null);
        double capacidad = capacidad_de_carga_barco(0);

        System.out.println("El nombre de tu barco es " + nombre + " y la capacidad es " + capacidad + " toneladas."); // Mostramos el resultado por consola.
    }
}
