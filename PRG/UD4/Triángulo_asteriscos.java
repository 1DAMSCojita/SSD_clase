
// Importación de librerías.
import java.util.Scanner;

public class Triángulo_asteriscos {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int x = 0;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos el programa.
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa dibujaremos un triángulo utilizando solamente asteriscos. ");
        System.out.println("Escribe cuantos asteriscos quieres a cada lado. ");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();

        x = sc.nextInt(); // Guardamos el número introducido por el usuario.
        System.out.println();

        // Empieza el programa. 
        // Crearemos dos bucles. Uno externo (que es el primero) y otro interno (el segundo).
        // El bucle externo controla las filas del triángulo. Definirá cuántos asteriscos se
        // deben de dibujar. Y el bucle interno cuántos asteriscos se imprimen en CADA fila.
        // Los asteriscos irán decreciendo, creando el propio triángulo. Todo esto se hará
        // en función del número que el usuario introduzca.
        for (int i = 0; i < x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print("*"); // Mostramos un asterisco. Usamos un "print" en vez de un "println" en el syso porque
                                        // así no hará un salto de línea entero.
            }
            System.out.println(); // Imprimimos un salto vacío para la separación.
        }
        sc.close(); // Cerramos escáner.
    }
}
