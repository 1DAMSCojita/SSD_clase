
// Importación de librerías.
import java.util.Arrays;
import java.util.Scanner; 

public class Arrays_longitud_nombre {
    public static void main(String[] args) {
     
        // Declaración de variables.
        String[] personajes = new String[5];
        
        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa podrás almacenar varios nombres de tus personajes favoritos y ordenarlos según su longitud.");
        System.out.println("Ves probando. Escribe 5 nombres.");
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        for (int i = 0; i < personajes.length; i++) {
            personajes[i] = sc.nextLine();
            continue;
        }
        Arrays.sort(personajes);

        System.out.println();
        System.out.println("Tus nombres ordenados por longitud: ");
        for (String nombre : personajes) {
            System.out.println(nombre);
        }

        sc.close();
    }
}
