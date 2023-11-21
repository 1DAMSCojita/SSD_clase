
// Importación de librerías.
import java.util.Scanner;

public class Capturas {
    public static void main(String[] args) {
        
        // Presentamos la aplicación.
        System.out.println("___________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa te iré permitiré que vayas registrando tus capturas.");
        System.out.println("____________________________________________________________________________________________________________________________");
        System.out.println();

        pesos(); // Llamamos a la función pesos para que muestre todo por pantalla.
    }

    // Creamos una nueva función llamada 'pesos'. Preguntará el peso y determinará si es apta o no. Lo acumulará y pondrá el resultado por consola.
    private static void pesos() {

        // Declaración de variables.
        double peso_captura = 0; // Esta variable será el peso de las capturas.
        int capturas_aptas = 0; // Esta variable serán las capturas aptas.
        int capturas_no_aptas = 0; // Esta variable serán las capturas no aptas.
        boolean continuar = true; // Esta variable controlará el bucle.
        String respuesta = ""; // Esta variable es la respuesta que el usuario proporcionará cuando se le pregunte si quiere introducir otro registro,

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Creamos un bucle 'while'.
        // Pedirá el peso de la captura y verificará si es apta o no. Llamará a la función booleana esApta para comprobarlo y irá sumando variables.
        // También preguntará al usuario si desea añadir más capturas.
        while (continuar) {
            // Pedimos el peso y lo guardamos.
            System.out.println("Escribe el peso de la captura:");
            peso_captura = sc.nextDouble();
            sc.nextLine(); // Consumimos el salto de línea para poder preguntar después del nextDouble().

            // Llamada a la función es apta, si lo es, se suma, si no, suma la variable que no lo es.
            if (esApta(peso_captura)) {
                capturas_aptas++;
            } else {
                capturas_no_aptas++;
            }

            // Preguntamos por otro registro.
            System.out.println("¿Quieres proporcionar otro registro? (Escribe 'No' para detener. Cualquier otra respuesta continuará el bucle).");
            respuesta = sc.nextLine();

            // Si el usuario indica que no, se mostrarán los resultados por consola.
            if (respuesta.equalsIgnoreCase("No")){
                System.out.println("Total de capturas aptas: " + capturas_aptas); // Mostramos el resultado.
                System.out.println("Total de capturas no aptas: " + capturas_no_aptas); // Mostramos el resultado.
                continuar = false; // Continuar será false, por lo que, saldrá del bucle.
            }
        }

        sc.close(); // Cerramos escáner.
    }

    // Creamos una nueva función que determinará si el peso de las capturas es apto o no.
    private static boolean esApta (double peso) {
        return peso < 50;
    }

}
