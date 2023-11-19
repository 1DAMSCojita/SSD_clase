
// Importación de librerías.
import java.util.Scanner;

public class Arrays_StarWars {
    public static void main(String[] args) {
     
        // Declaración de variables.
        String[] personajes = {"Luke Skywalker", "Darth Vader", "Princesa Leia", "Han Solo", "Yoda"};
        String nombre_correcto = "";
        boolean si_esta = false;
        
        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa consiste en verificar si existe alguno de los nombres que menciones en mi base de datos.");
        System.out.println("Pruébalo, escribe un nombre.");
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        nombre_correcto = sc.nextLine(); // Leemos la línea de entrada del usuario y la asignamos a la variable 'nombre_correcto' para posteriormente comprobar si es correcto.

        // Creamos un bucle 'for-each'.
        // Este bucle se encargará de que por cada respuesta que introduzca el usuario. Verificará si el nombre es correcto usando también una variable booleana.
        for (String respuesta : personajes) {
            // Creamos una estructura de control 'if'.
            // Si la respuesta es igual al nombre correcto, el programa comenzará interpretará que 'si_esta' es verdad. 
            // Usamos el 'equalsIgnoreCase' no solo para poder comparar cadenas, si no para que el programa distinga
            // minúsculas también.
            if (respuesta.equalsIgnoreCase(nombre_correcto)) { 
                si_esta = true; // Si se cumple esta condición, 'si_esta' será verdad.
                break; // Rompemos el bucle en caso de que la condición sea correcta.
            }
        }

        // Creamos la última estructura de control 'if'.
        // Determinará si el nombre está en la base de datos del programa y dependiendo de si está o no mostrará que si o que no.
        if (si_esta) {
            System.out.println("El nombre que has mencionado si está en mi base de datos. -> " + nombre_correcto);
        } else {
            System.out.println("El nombre que has puesto no se encuentra en mi base de datos. Prueba de nuevo.");
        }

        sc.close(); // Cerramos el escáner.
    }
}