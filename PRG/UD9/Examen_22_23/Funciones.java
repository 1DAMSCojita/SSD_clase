package Examen_22_23;

// Importación de librerías.
import java.io.*;
import java.util.*;

public class Funciones {

    // Creamos un método estático para leer ficheros.
    public static double leerFicheroVelocidad(String fichero) {
        double velocidad = 0.0;
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            List<Double> velocidades = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                velocidades.add(Double.parseDouble(linea));
            }
            Random x = new Random();
            velocidad = velocidades.get(x.nextInt(velocidades.size()));
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        return velocidad;
    }

    // Creamos un método estático para escribir en ficheros.
    public static void escribirEnFicheros(List<Gemelo> gemelos, String fichero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (Gemelo gemelo : gemelos) {
                bw.write(gemelo.nombre + "," + gemelo.edad + "," + gemelo.viaja);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

}
