package Activitat_6_6;

// Importación de librerías.
import java.util.Random;

public class TestCirco {
    public static void main(String[] args) {

        // Creamos instancias de las clases. Añadiendo información para cada atributo.
        Acrobata ac = new Acrobata("Juan", 25, TipoActuacion.ACROBACIA, "equilibrio en alturas");
        Malabarista m = new Malabarista("Pedro", 30, TipoActuacion.MALABARES, 5);
        PayasoMalabarista pm = new PayasoMalabarista("Pablo", 28, TipoActuacion.PAYASO, "gracioso");

        // Mostramos informaciónn haciendo un print de cada 'toString()'.
        System.out.println(ac.toString());
        System.out.println(m.toString());
        System.out.println(pm.toString());

        // Utilizar arrays de objetos para almacenar varios artistas en el circo
        ArtistaCirco[] artistas = {ac, m, pm};

        // Utilizar un array de DiasSemana para representar los días de la semana
        DiasSemana[] diasSemana = DiasSemana.values();

        // Utilizar un array multidimensional para representar el calendario semanal de actuaciones de los artistas
        String[][] calendarioSemanal = new String[diasSemana.length][artistas.length];

        // Realizar una simulación de actuaciones aleatorias durante la semana
        Random random = new Random();
        for (int i = 0; i < diasSemana.length; i++) {
            for (int j = 0; j < artistas.length; j++) {
                // Simulación aleatoria de actuaciones
                if (random.nextBoolean()) {
                    artistas[j].realizarActuacion();
                    calendarioSemanal[i][j] = artistas[j].getClass().getSimpleName(); // Guardar el tipo de actuación en el calendario
                } else {
                    calendarioSemanal[i][j] = "Descanso";
                }
            }
        }

        // Mostrar el calendario resultante
        System.out.println("\nCalendario Semanal:");
        System.out.print("      ");
        for (DiasSemana dia : diasSemana) {
            System.out.printf("%-15s", dia);
        }
        System.out.println();
        for (int i = 0; i < artistas.length; i++) {
            System.out.printf("%-6s", artistas[i].getClass().getSimpleName());
            for (int j = 0; j < diasSemana.length; j++) {
                System.out.printf("%-15s", calendarioSemanal[j][i]);
            }
            System.out.println();
        }
    }
}
