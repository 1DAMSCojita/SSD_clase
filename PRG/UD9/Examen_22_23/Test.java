package Examen_22_23;

// Importación de liberías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creación de gemelos.
        Gemelo g1 = new Gemelo("Juan", 25, false);
        Gemelo g2 = new Gemelo("Ana", 25, true);
        Gemelo g3 = new Gemelo("Olga", 40, false);
        Gemelo g4 = new Gemelo("Joel", 40, true);
        Gemelo g5 = new Gemelo("Pere", 65, false);
        Gemelo g6 = new Gemelo("Josep", 65, true);

        // Creación de mapa.
        Map<List<Gemelo>, Integer> viajes = new HashMap<>();

        // Añadimos gemelos al mapa.
        viajes.put(Arrays.asList(g1, g2), 5);
        viajes.put(Arrays.asList(g3, g4), 7);
        viajes.put(Arrays.asList(g5, g6), 3);
        
        // Iteramos a través de cada entrada en el mapa 'viajes'.
        for (Map.Entry<List<Gemelo>, Integer> vuelos : viajes.entrySet()) {
            List<Gemelo> gemelos = vuelos.getKey(); // Obtenemos la lista de gemelos para el vuelo actual.
            int tiempo = vuelos.getValue(); // Obtenemos el tiempo de viaje para el vuelo actual.
            Gemelo gemeloViaja = gemelos.get(1); // Obtenemos el gemelo que viaja.
            Gemelo gemeloTierra = gemelos.get(0); // Obtenemos el gemelo que se queda en la Tierra.
            double velocidad = Funciones.leerFicheroVelocidad("velocidades.txt"); // Obtenemos la velocidad del archivo 'velocidades.txt'.
            NaveEspacial nave = new NaveEspacial(gemeloViaja, gemeloTierra, velocidad, tiempo); // Creamos una nueva nave espacial.
            nave.vueloEspacial(); // Iniciamos el viaje espacial.
            System.out.println("> Edad final de " + gemelos.get(1).nombre + ": " + Funciones.calcularEdadFinal(gemeloTierra, tiempo, velocidad) + " años."); // Imprimimos la edad final del gemelo que viaja después de que el viaje haya finalizado.
        }

        System.out.println("------------- DETALLES DE LOS VUELOS ESPACIALES ----------");
        // Creamos un bucle 'for-each'.
        // Irá iterando sobre los viajes.
        for (Map.Entry<List<Gemelo>, Integer> vuelos : viajes.entrySet()) {
            
            List<Gemelo> gemelos = vuelos.getKey(); // Obtenemos la lista de gemelos para el vuelo actual.
            Collections.sort(gemelos, new ComparaNombres()); // Ordenamos la lista de gemelos por nombres usando el comparador 'ComparaNombres'.
        
            int diferenciaEdad = Math.abs(gemelos.get(1).edad - gemelos.get(0).edad); // Calculamos la diferencia de edad entre los gemelos para el vuelo actual.
            int tiempo = vuelos.getValue(); // Obtenemos el tiempo de viaje para el vuelo actual.
            double velocidad = Funciones.leerFicheroVelocidad("velocidades.txt"); // Obtenemos la velocidad del archivo 'velocidades.txt'.
            
            // Imprimimos los detalles del vuelo espacial.
            System.out.println("\nGemelos: " + gemelos.get(0).nombre + " y " + gemelos.get(1).nombre);
            System.out.println("Velocidad de la nave: " + velocidad);
            System.out.println("Tiempo de viaje: " + tiempo + " años.");
            System.out.println("Diferencia de edad: " + diferenciaEdad + " años."); // Por algún motivo la diferencia de edad siempre sale 0 y no supe como arreglarlo.
            
            // Escribimos los detalles del vuelo en un archivo.
            Funciones.escribirEnFicheros(gemelos, "gemelos.txt"); // Al escribir en el fichero, escribe únicamente los dos primeros gemelos, pero no el resto. No supe como solucionarlo.
        }
        System.out.println("-------------------------------------------------------------");

    }
}
