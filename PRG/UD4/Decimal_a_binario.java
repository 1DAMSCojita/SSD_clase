
// Importación de librerías.
import java.util.Scanner; 

public class Decimal_a_binario {
    public static void main(String[] args) {

        // Presentamos el programa.
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa consiste en realizar una conversión de decimal a binario.");
        System.out.println("Escribe el número entero que quieras convertir a binario. ");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();

        String resultado = conversion(); // Llamamos a la función 'conversion' y la introducimos en una nueva variable.
        System.out.println("Tu número en binario es: " + resultado); // Mostramos el resultado por consola.
    }

    // Declaramos una nueva función que realizará la conversión y posteriormente devolverá el resultado. La haremos 'String' ya que el resultado que devolverá es string.
    public static String conversion() {

        // Declaración de variables.
        int x = 0;
        String binario = "";
        int residuo = 0;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos
        x = sc.nextInt(); // Guardamos el número introducido por el usuario.

        // Empieza el programa.
        // Creamos un bucle 'while', mientras que 'x' sea mayor a 0:
        while (x > 0) {
            residuo = x % 2; // Obtenemos el residuo de la división por 2.
            binario = residuo + binario; // Guardamos el resto de la división y la sumamos con el binario.
            x = x / 2; // Dividimos el número decimal por 2.
        }
        sc.close(); // Cerramos escáner.
        return binario; // Devolvemos el resultado
        
    }
}
