package funcionesAuxiliares;

// Importación de liberías.
import java.util.*;

public class GenerarAleatorio {

    // Método que genera un número aleatorio entre 1 y 1000.
    public int generarNumeroAleatorio1entre1000(int x) {

        x = (int)(Math.random() * 1001);

        return x;
    }

    // Método que crea un valor booleano y lo devuelve, ya sea 0 para false y 1 para true.
    public Random generarBooleano() {
        Random random = new Random();

        return random;
    }

    // Método que devuelve una lista aleatoria entera con un rango y límite.
    public static List<Integer> listaAleatoriaEnteraConRangoYLimite(List<Integer> listaNumeros) {

        // Declaración de variables.
        int rango1;
        int rango2;
        int limite = 10;

        Scanner sc = new Scanner(System.in); // Declación de escáner.

        // Estructura 'try-catch'.
        // Si se encuentra alguna excepción durante la entrada de datos, se captura y se la indica al usuario.
        try {
        
            // Presentación junto la entrada de datos.
            System.out.println("Ha entrado para generar una lista entera aleatoria con rango y límite.");
            System.out.println("Introduce el primer rango de la lista: ");
            rango1 = sc.nextInt();
            System.out.println("Ahora, introduce el segundo rango de la lista: ");
            rango2 = sc.nextInt();

            // Estructura 'if' que en caso de que el rango primero sea mayor que el segundo, se intercambian.
            if (rango1 > rango2) {
                int temp = rango1;
                rango1 = rango2;
                rango2 = temp;
            }

            // Presentación de la opción si se quiere establecer un límite.
            System.out.println("\n¿Desea establecer un límite (por defecto se generarán 10 números aleatorios)? (s/n)");
            String respuesta = sc.next();

            // Si la respuesta es 's', se introducirá el límite a generar y se guardará.
            if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("Introduce el límite de números a generar: ");
                limite = sc.nextInt();
            }

            // Creación de números aleatorios con Random, dependiendo del rango escogido se generarán.
            Random random = new Random();
            for (int i = 0; i < limite; i++) {
                int numeroAleatorio = rango1 + random.nextInt(rango2 - rango1 + 1);
                listaNumeros.add(numeroAleatorio);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error. Introduzca un valor válido y vuelva a intentarlo.");
        } catch (Exception e) {
            System.out.println("Error génerico: " + e.getMessage());
        } finally {
            sc.close(); // Cierra escáner.
        }

        return listaNumeros; // Devolvemos la lista de números.
    }


}
