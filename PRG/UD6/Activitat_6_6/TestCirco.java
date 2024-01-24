package Activitat_6_6;

// Importación de librerías.
import java.util.Random;

public class TestCirco {
    public static void main(String[] args) {

        // Creamos instancias de las clases. Añadiendo información para cada objeto.
        Acrobata ac = new Acrobata("Juan", 25, TipoActuacion.ACROBACIA, "equilibrio en alturas");
        Malabarista m = new Malabarista("Pedro", 30, TipoActuacion.MALABARES, 5);
        PayasoMalabarista pm = new PayasoMalabarista("Pablo", 28, TipoActuacion.PAYASO, 4, "gracioso");

        // Creamos una estructura de control 'if'.
        // Verificamos si el número de pelotas en el malabarista es igual a 0. Si lo es, dará un mensaje de error.
        // En caso contrario, el programa continua realizando su flujo.
        if (m.numPelotas == 0 || pm.numPelotas == 0) {
            System.out.println("Error. El número de pelotas debe ser como mínimo 3 y máximo 10.");
        } else {
            // Mostramos información haciendo un print de cada 'toString()'.
            System.out.println(ac.toString());
            ac.realizarActuacion();
            System.out.println();
            System.out.println(m.toString());
            m.realizarActuacion();
            System.out.println();
            System.out.println(pm.toString());
            pm.realizarActuacion();
            pm.realizarBroma();
            System.out.println("________________________________________________________________________________________"); // Separador.

            // Creamos un array de objetos y almacenenamos las instancias de las clases.
            ArtistaCirco[] artistas = {ac, m, pm};

            // Creamos y utilizamos un array de DiasSemana para representar los días de la semana.
            DiasSemana[] diasSemana = DiasSemana.values();

            // Creamos y utilizamos un array multidimensional para representar el calendario semanal de actuaciones de los artistas.
            String[][] calendarioSemanal = new String[diasSemana.length][artistas.length];

            // Realizamos una simulación de actuaciones aleatorias durante la semana.
            Random random = new Random(); // Generamos valores booleanos aleatorios que determinarán si un artista actuará o no en un día determinado.
            // Creamos un bucle anidado 'for'.
            // Simularemos la programación de actuaciones de artistas en diferentes días de la semana.
            for (int i = 0; i < diasSemana.length; i++) {
                for (int j = 0; j < artistas.length; j++) {
                    // Creamos una estructura de control 'if'.
                    // Verificará si el valor booleano es true. Si lo es, llamará al método 'realizarActuacion()' y guardará el tipo de actuación en el calendario
                    // semanal. En caso contrario, asignará descanso.
                    if (random.nextBoolean()) {
                        calendarioSemanal[i][j] = artistas[j].getClass().getSimpleName(); 
                        // Guardamos el tipo de actuación en el calendario. Para ello, lo usamos el método 'getClass()' que representa la clase del objeto en cuestión.
                        // También usamos el método 'getSimpleName()' que devolverá el nombre simple de la clase sin el paquete.
                        // En resumen, utilizamos los métodos para obtener el nombre de la clase del objeto 'artistas[j]' y guardarlo en el calendario.
                    } else {
                        calendarioSemanal[i][j] = "Descanso";
                    }
                }
            }

            // Mostramos el calendario resultante.
            System.out.println(); // Espacio en la consola.
            System.out.println("Calendario Semanal:");
            System.out.println(); // Espacio en la consola.
            System.out.print(""); // Imprimimos una cadena de espacios en blanco.
            // Creamos un bucle 'for-each'.
            // Imprimimos los nombres de los días de la semana alineados a la izquierda.
            for (DiasSemana dia : diasSemana) {
                System.out.printf("%-15s", dia); // Usamos un ancho de 15 carácteres para dar formato a la consola y alinearlo. 
            }
            System.out.println(); // Espacio en la consola.
            // Creamos un bucle 'for'.
            // Iterará sobre la longitud del array 'artistas' y los días de semana para imprimir el calendario semanal.
            for (int i = 0; i < artistas.length; i++) {
                // Creamos otro bucle 'for'.
                // Iteramos sobre los días de la semana y imprimimos los eventos de cada artista en cada día.
                for (int j = 0; j < diasSemana.length; j++) {
                    System.out.printf("%-15s", calendarioSemanal[j][i]); // Imprimimos el calendario con un ancho de 15 carácteres.
                }
                System.out.println();
            }
        }
    }
}
