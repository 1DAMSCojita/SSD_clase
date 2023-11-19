
// Importación de librerías.
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ordenar_nombres {
    public static void main(String[] args) {
     
        // Declaración de variables.
        String[] personajes = new String[5];
        
        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.
        personajes[0] = "Han Solo"; // Declaramos que el primer espacio lo cubrirá el personaje Han Solo.
        personajes[1] = "Darth Vader"; // Declaramos que el segundo espacio lo cubrirá el personaje Darth Vader.

        // Presentamos la aplicación.
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa podrás almacenar varios nombres de tus personajes favoritos y ordenarlos según su longitud.");
        System.out.println("Ves probando. Escribe 3 nombres.");
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();

        // Creamos un bucle ordinario 'for'.
        // Básicamente lo que hará este bucle es en resumen ir guardando todos los nombres que introduzca el usuario hasta que llegue al límite de la cadena.
        for (int i = 2; i < personajes.length; i++) {
            personajes[i] = sc.nextLine();
            continue;
        }
        // Usamos el método 'Arrays.sort' para poder ordenar la longitud de menor a mayor.
        // También usamos 'comparator', la cuál es una interfaz de Arrays.sort que nos va permitir a ordenar los nombres de manera más precisa, sin el error
        // de ordenarlo alfabéticamente solamente.
        Arrays.sort(personajes, Comparator.comparingInt(String::length)); 

        System.out.println();
        System.out.println("Tus nombres ordenados por longitud: ");
        // Creamos un bucle 'for-each'. Para poder recorrer el array
        // 'personajes' y mostrarlo.
        for (String nombre : personajes) {
            System.out.println(nombre); // Mostramos los resultados por consola.
        }

        sc.close(); // Cerramos escáner.
    }
}
