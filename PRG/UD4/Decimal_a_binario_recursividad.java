
// Importación de librerías.
import java.util.Scanner; 

public class Decimal_a_binario_recursividad {
    public static void main(String[] args) {

        // Presentamos el programa.
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa consiste en realizar una conversión de decimal a binario.");
        System.out.println("Escribe el número entero que quieras convertir a binario. ");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos
        int x = sc.nextInt(); // Guardamos el número introducido por el usuario.
        String resultado = conversion(x); // Llamamos a la función 'conversion' y la introducimos en una nueva variable.
        System.out.println("Tu número en binario es: " + resultado); // Mostramos el resultado por consola.
        sc.close(); // Cerramos escáner.
    }

    // Declaramos una nueva función que realizará la conversión y posteriormente devolverá el resultado. La haremos 'String' ya que el resultado que devolverá es string.
    public static String conversion(int x) {

        // Declaración de variables.
        String binario = "";
        String binario_parte;
        int residuo = 0;

        // Empieza el programa.
        // Creamos una estructura condicional con if. Si 'x' es igual a cero:
        if (x == 0) {
            return "0"; // Devuelve cero. 
        } else if (x == 1) {
            return "1"; // Devuelve uno.
        }
        residuo = x % 2; // Obtenemos el residuo de la división por 2.
        binario_parte = conversion(x / 2); // Llamada recursiva con el cociente.
        binario = binario_parte + residuo; // Acumulamos los digitos en "binario" a medida que se van haciendo las llamadas recursivas. 

        return binario; // Devolvemos el resultado.
    }
}
