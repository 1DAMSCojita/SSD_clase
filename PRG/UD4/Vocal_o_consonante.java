
import java.util.Scanner; // Importamos las librerías.

public class Vocal_o_consonante {
    public static void main(String[] args) {
        
        // Declaración de variables.
        char x = ' ';
        String entrada = "";

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos el programa.
        System.out.println("Bienvenido. En este programa se te indicará si el carácter del alfabeto que pongas es una vocal o una consonante.");
        System.out.println("Escribe tu carácter: ");
        entrada = sc.nextLine(); // Guardamos el carácter introducido por el usuario.

        // Usamos una estructura condicional para determinar si el carácter introducido por el usuario es una vocal o consonante.
        // Primero, comprobamos si la longitud de la cadena es superior a 1, en caso de que si, el programa mostrará un mensaje de error. Si no, guardará la entrada como cáracter 'x'.
        if (entrada.length() > 1) {
            System.out.println("Error.");       
        } else {
            x = entrada.charAt(0);
        }

        // Verificamos si el carácter cumple con el abecedario. Luego miramos si es vocal o consonante indicando que si 'x' es cualquiera de las vocales, será vocal obviamente,
        // en caso contrario, se quedará en una simple consonante. Si el usuario introduce un carácter especial (es decir, que no coincida con ninguna letra del abecedario)
        // entonces se mostrará otro mensaje de error.
        if (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z') {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
            System.out.println("Es una vocal."); // Mostramos el resultado por consola.
            } else {
            System.out.println("Es una consonante."); // Mostramos el resultado por consola.
            } 
        } else {
            System.out.println("Error.");
        }
        sc.close(); // Cerramos escáner.
    }
}