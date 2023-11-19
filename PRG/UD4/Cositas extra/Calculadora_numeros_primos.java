
// Importación de librerías.
import java.util.Scanner; 

public class Calculadora_numeros_primos {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int x = 0;
        
        Scanner sc = new Scanner (System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa te indicará si el número que has introducido es o no primo.");
        System.out.println("Prúebalo. Escribe un número.");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        x = sc.nextInt(); // Guardamos el número introducido por el usuario.

        if (es_primo(x)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

        sc.close();
    }

    public static boolean es_primo(int x) {

        if (x <= 1) {
            return false;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return true;
            }
        }

        return false; 
    }
}
