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
        viajes.put(Arrays.asList(g1, g2), 5);
        viajes.put(Arrays.asList(g3, g4), 7);
        viajes.put(Arrays.asList(g5, g6), 3);

        for (Map.Entry<List<Gemelo>, Integer> vuelos : viajes.entrySet()) {
            List<Gemelo> gemelos = vuelos.getKey();
            int tiempo = vuelos.getValue();
            Gemelo gemeloViaja = gemelos.get(1);
            Gemelo gemeloTierra = gemelos.get(0);
            double velocidad = Funciones.leerFicheroVelocidad("velocidades.txt");
            NaveEspacial nave = new NaveEspacial(gemeloViaja, gemeloTierra, velocidad, tiempo);
            nave.vueloEspacial();
            System.out.println("Edad final pendiente.");
        }

        System.out.println("\nDetalles de los vuelos espaciales: ");
        for (Map.Entry<List<Gemelo>, Integer> vuelos : viajes.entrySet()) {
            List<Gemelo> gemelos = vuelos.getKey();
            double velocidad = Funciones.leerFicheroVelocidad("velocidades.txt");
            int tiempo = vuelos.getValue();
            System.out.println("Gemelos: " + gemelos.get(0).nombre + " y " + gemelos.get(1).nombre);
            System.out.println("Velocitat de la nave: " + velocidad);
            System.out.println("Tiempo de viaje: " + tiempo);
            System.out.println("Diferencia de edad: " + Math.abs(gemelos.get(0).edad - gemelos.get(1).edad));
            // Escribimos datos en los ficheros.
            Funciones.escribirEnFicheros(gemelos, "gemelos.txt");
        }

        


    }
}
