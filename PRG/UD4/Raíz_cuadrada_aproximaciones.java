
// Importación de librerías.
import java.util.Scanner;

public class Raíz_cuadrada_aproximaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa consiste en calcular la raíz cuadrada mediante aproximaciones. También se mostrará el resto.");
        System.out.println("Escribe el número el cuál quieras saber la raíz cuadrada.");
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        double raiz_cuadrada = sc.nextDouble(); // Guardamos el valor introducido por el usuario.
        System.out.println();

        double resultado = calculo_raiz_cuadrada(raiz_cuadrada); // Llamamos a la función 'calculo_raiz_cuadrada' y guardamos el resultado en una nueva variable con ese mismo nombre.

        System.out.println(resultado); // Mostramos el resultado por consola. Aquí raramente al final se volverá a mostrar el número que introdució el usuario, pero eso es mera estética.

        sc.close(); // Cerramos escáner.
    }

    // Declaramos una nueva función para poder realizar el cálculo correspondiente. La definimos como 'double' ya que es lo que devolverá al final.
    public static double calculo_raiz_cuadrada(double raiz_cuadrada) {

        // Declaración de variables.
        int x = 0;
        int i = 0;
        double n = 0.0;
        double resto = 0.0;

        // Creaoms un bucle 'for'.
        // Mientras 'i' sea inferior a la raíz cuadrada, vamos incrementando la iteración.
        for (i = 0; i <= raiz_cuadrada; i++) {
            // Creamos una estructura de control "if-else".
            // Verificamos si el cuadrado de 'i' es menor o igual a la raíz cuadrada.
            if (i * i <= raiz_cuadrada) {
                x = i; // Guardamos la última aproximación.
                n = i * i; // Guardamos el resultado del cuadrado en una nueva variable (para eso usamos 'n') y posteriormente mostrarlo en el próximo println.
                System.out.println(i + " elevado a 2 = " + n);
            } else if (i * i > raiz_cuadrada) {
                n = i * i; // Lo mismo que en el primer 'if' pero lo repetimos por si es mayor a la raíz.
                System.out.println(i + " elevado a 2 = " + n);
                break; // Rompemos el bucle una vez superada la raíz cuadrada..
            }   
        }

        resto = raiz_cuadrada - (x * x); // Calculamos el resto.
        System.out.println("La raíz de " + raiz_cuadrada + " es más o menos " + x + " y el resto es " + resto); // Mostramos el resultado por pantalla.

        return raiz_cuadrada; // Devolvemos 'raiz_cuadrada'.
    }   
}
