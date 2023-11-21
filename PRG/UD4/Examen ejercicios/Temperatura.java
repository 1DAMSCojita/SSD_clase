
// Importación de librerías.
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        
        // Declaración de variables.
        double x = 0.0; // Declaramos 'x' que será la temperatura del agua que introducirá el usuario.

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa te iré proporcionando recomendaciones en base a los grados de temperatura que pongas para tu pesca.");
        System.out.println("Escribe los grados.");
        System.out.println("__________________________________________________________________________________________________________________________________");
        System.out.println();
        x = sc.nextDouble(); // Guardamos el número introducido por el usuario.

        // Creamos una estructura de control 'if'.
        // Si la temperatura es mayor a 25, es excelente.
        // Si está por encima de 18 y menor que 25, es adecuada.
        // Y a partir de estar por debajo de 18, es demasiado baja.
        if (x >= 25) {
            System.out.println("¡La temperatura es excelente!");
        } else if (x >= 18 && x < 25) {
            System.out.println("¡La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura es demasiado baja para la práctica de la pesca.");
        }

        sc.close(); // Cerramos escáner.
    }
}
