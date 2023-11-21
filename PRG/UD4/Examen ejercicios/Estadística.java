
// Importación de librerías.
import java.util.Scanner;

public class Estadística {
    public static void main(String[] args) {
            
        // Declaración de variables.
        int[] capturas;
        int pescadores = 0;
        int numero_capturas = 0;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa te iré permitiré que vayas registrando la cantidad de capturas por pescadores y realizar las medias.");
        System.out.println("Introduce el número de pescadores.");
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println(); 

        // Capturamos el número de pescadores.
        pescadores = sc.nextInt();

        // Dimensiones del array de capturas según el número de pescadores.
        capturas = new int[pescadores];
        
        // Creamos un bucle 'for'.
        // Irá registrando el número de capturas para un pescador.
        for (int i = 0; i < capturas.length; i++) {
            System.out.println("Escribe el número de capturas para el pescador: " + (i + 1));
            capturas[i] = sc.nextInt();
        }

        // Creamos un bucle 'for-each'.
        // Sumamos las capturas.
        for (int captura : capturas) {
            numero_capturas += captura;
        }
        System.out.println();
        System.out.println("Número total de capturas: " + numero_capturas);
        System.out.println("Media de capturas por pescador: " + ((double)(numero_capturas/pescadores)));
        
        sc.close(); // Cerramos escáner.
    }
}
